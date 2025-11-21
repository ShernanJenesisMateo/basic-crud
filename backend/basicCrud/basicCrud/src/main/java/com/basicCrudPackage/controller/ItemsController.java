package com.basicCrudPackage.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basicCrudPackage.model.Items;
import com.basicCrudPackage.service.ItemsService;

@RestController
@RequestMapping("/api/items")
public class ItemsController {
    private final ItemsService itemsService;

    public ItemsController(ItemsService itemsService){
        this.itemsService = itemsService;
    }

    public ResponseEntity<List<Items>> getAllItems(){
        return ResponseEntity.ok(itemsService.getAllItems());
    }
}
