package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ItemDto;
import com.amr.project.model.entity.Item;

import java.util.List;

public interface ItemService {

    List<ItemDto> getAllItems();

    ItemDto getItemById(Long id);

    void saveItem(ItemDto itemDTO);

    void updateItem(ItemDto itemDTO);

    void deleteItem(Long id);

    List<Item> findFirst4ByOrderByRatingAsc();
}
