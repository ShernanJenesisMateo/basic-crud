package com.basicCrudPackage.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.basicCrudPackage.model.Items;
import com.basicCrudPackage.repository.ItemsRepository;

@Service
public class ItemsServiceImpl {
    private final ItemsRepository itemsRepository;

    public ItemsServiceImpl(ItemsRepository itemsRepository){
        this.itemsRepository = itemsRepository;
    }

    public List<Items> getAllItems(){
        return itemsRepository.getAllItems();
    }
}
