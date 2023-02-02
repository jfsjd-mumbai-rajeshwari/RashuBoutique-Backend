package com.finalrashu.rashuboutique.Repository;

import org.springframework.data.repository.CrudRepository;

import com.finalrashu.rashuboutique.Model.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {
    
}
