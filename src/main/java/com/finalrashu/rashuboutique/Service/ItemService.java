package com.finalrashu.rashuboutique.Service;

import com.finalrashu.rashuboutique.Model.Item;

public interface ItemService {
    
    public Item createItem(Item item);
    public Item getItemById(Integer id);
    public Iterable<Item> getAllItems();
    public Item updateItemById(Integer id, Item item);
    public Item deleteItemById(Integer id);

}
