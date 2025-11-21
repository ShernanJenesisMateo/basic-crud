package com.basicCrudPackage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.basicCrudPackage.model.Items;

@Mapper
public interface ItemsMapper {
    List<Items> getAllItems();
}
