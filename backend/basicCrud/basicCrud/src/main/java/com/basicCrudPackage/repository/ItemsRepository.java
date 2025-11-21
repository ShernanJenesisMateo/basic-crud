package com.basicCrudPackage.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.basicCrudPackage.mapper.ItemsMapper;
import com.basicCrudPackage.model.Items;

@Repository
public class ItemsRepository {

    private final ItemsMapper itemsMapper;

    public ItemsRepository(ItemsMapper itemsMapper){
        this.itemsMapper = itemsMapper;
    }

    public List<Items> getAllItems(){
        return itemsMapper.getAllItems();
    }
}
