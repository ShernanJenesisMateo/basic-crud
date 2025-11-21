package com.basicCrudPackage.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.basicCrudPackage.mapper.ItemsMapper;
import com.basicCrudPackage.model.Items;

@Repository
public class ItemsRepository {
    ItemsMapper itemsMapper;

    public List<Items> getAllItems(){
        return itemsMapper.getAllItems();
    }
}
