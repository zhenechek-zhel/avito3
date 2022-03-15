package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;

import java.util.List;

public interface ItemService {

    List<ItemDTO> getAllItems();

    ItemDTO getItemById(Long id);

    void saveItem(Item item);

    void updateItem(Item item);

    void deleteItem(Long id);
}
