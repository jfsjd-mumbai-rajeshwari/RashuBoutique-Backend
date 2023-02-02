package com.finalrashu.rashuboutique.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalrashu.rashuboutique.Controller.Dto.ItemDto;
import com.finalrashu.rashuboutique.Model.Item;
import com.finalrashu.rashuboutique.Service.ItemService;


@RestController
public class ItemsController {

    @Autowired 
    private ItemService itemservice;
    public ItemsController(ItemService itemservice) {
        this.itemservice= itemservice;
    }


    @CrossOrigin
    @PostMapping("/createitem")
    public ResponseEntity<Item> createItem(@RequestBody ItemDto itemDto){
        Item status = itemservice.createItem(new Item(itemDto));
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
   

    @CrossOrigin
    @GetMapping("/item/{id}")

    public ResponseEntity<Item> getItemById(@PathVariable Integer id){
        Item status = itemservice.getItemById(id);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/getallitems")
    public ResponseEntity<Iterable<Item>> getAllItems(){
        Iterable<Item> status = itemservice.getAllItems();
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
    @PutMapping("/item/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable Integer id,@RequestBody Item item){
        Item status = itemservice.updateItemById(id,item);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @DeleteMapping("/item/{id}")
    public ResponseEntity<Item> deleteItem(@PathVariable Integer id){
        Item status = itemservice.deleteItemById(id);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    
}
