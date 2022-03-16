package com.amr.project.webapp.controller;

import com.amr.project.model.dto.CategoryDTO;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.service.abstracts.CartItemService;
import com.amr.project.service.abstracts.CategoryService;
import com.amr.project.service.abstracts.ItemService;
import com.amr.project.service.abstracts.ShopService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Tag(name = "Main page", description = "Rest Controller to serve main page")
@RequiredArgsConstructor
@RestController
@RequestMapping("/main")
public class MainPageRestContr {

    private final ItemService itemService;
    private final CartItemService cartItemService;
    private final CategoryService categoryService;
    private final ShopService shopService;


    @Operation(summary = "Get list of some Items(some of more popular)")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
                    description = "Success",
                    content = @Content(mediaType = APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ItemDTO.class)))
    })
    @GetMapping("/items")
    public ResponseEntity<List<ItemDTO>> getItems() {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "Get list of some Items in given Category/ies (according to a certain pattern)")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
                    description = "Success",
                    content = @Content(mediaType = APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ItemDTO.class)))
    })
    @GetMapping("/items/category/{id}")
    public ResponseEntity<List<ItemDTO>> getItemsByCategory() {

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @Operation(summary = "Get list of all Categories")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
                    description = "Success",
                    content = @Content(mediaType = APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = CategoryDTO.class)))
    })
    @GetMapping("/categories")
    public ResponseEntity<List<CategoryDTO>> getAllCategories() {
        return new ResponseEntity<>(
                new ArrayList<>(categoryService.getAllCategories()),
                HttpStatus.OK);
    }


    @Operation(summary = "Get list of some Shops(some of more popular)")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
                    description = "Success",
                    content = @Content(mediaType = APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ShopDTO.class)))
    })
    @GetMapping("/shops")
    public ResponseEntity<List<ShopDTO>> getShops() {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "Update the CartItem: create link between Item and CartItem")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Item was updated",
                    content = @Content(mediaType = APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ItemDTO.class))),
            @ApiResponse(responseCode = "404",
                    description = "Item or CartItem not found",
                    content = @Content)
    })
    @PutMapping("/cart/{cart_id, item_id}")
    public ResponseEntity<ItemDTO> addItemToCart(
            @PathVariable(name = "cart_id") Long cart_id,
            @PathVariable(name = "item_id") Long item_id) {

        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Где, когда и как будет создаваться корзина пользователя?
    //Где - страница с заведением нового Пользователя
    //Когда - при создании аккаунта Пользователя (занесения Пользователя в БД)
    //Как - автоматически
}
