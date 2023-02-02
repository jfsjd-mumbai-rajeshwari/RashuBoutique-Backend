package com.finalrashu.rashuboutique.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalrashu.rashuboutique.Model.Item;
import com.finalrashu.rashuboutique.Repository.ItemRepository;


@Service
public class ItemServiceimpl implements ItemService {
    
    @Autowired
    private ItemRepository itemrepository;

    public ItemServiceimpl(ItemRepository itemrepository) {
      this.itemrepository = itemrepository;
  }

   
    public Item createItem(Item item){
       return itemrepository.save(item);
      
    }
    public Item getItemById(Integer id){
        Optional<Item> findById=itemrepository.findById(id);
        if(findById.isPresent()){
            return findById.get();
        }
    
        return null;
    }
    public Iterable<Item> getAllItems(){
        return itemrepository.findAll();
        
    }
    public Item updateItemById(Integer id, Item item){
        Optional<Item> itemToUpdateOptional=itemrepository.findById(id);
        if (!itemToUpdateOptional.isPresent()) { 
            return null;
          }
         
          
          Item itemToUpdate = itemToUpdateOptional.get();
         
          if (item.getName() != null) {
            itemToUpdate.setName(item.getName());
          }
          if (item.getDescription() != null) {
            itemToUpdate.setDescription(item.getDescription());
          }
          if (item.getPrice() != null) {
            itemToUpdate.setPrice(item.getPrice());
          }
         
          Item updatedItem  = itemrepository.save(itemToUpdate);
          return updatedItem ;
        }
        public Item  deleteItemById(Integer id) {
            Optional<Item> itemToDeleteOptional = itemrepository.findById(id);
            if (!itemToDeleteOptional.isPresent()) {
              return null;
            }
            Item  itemToDelete = itemToDeleteOptional.get();
            itemrepository.delete(itemToDelete);
            return itemToDelete;
          }

}
