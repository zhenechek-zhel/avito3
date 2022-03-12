package com.amr.project.service.abstracts;

import com.amr.project.model.entity.Item;

import java.util.List;

public interface ItemService {

    List<Item> getAllItems();

    Item getItemById(Long id);

    void saveItem(Item item);

    void updateItem(Item item);

    void deleteItem(Long id);
}
