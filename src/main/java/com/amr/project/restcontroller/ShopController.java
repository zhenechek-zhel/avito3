package com.amr.project.restcontroller;

import com.amr.project.model.dto.ShopDto;
import com.amr.project.service.abstracts.ShopService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/v1/shops", produces = APPLICATION_JSON_VALUE)
public class ShopController {

    private static final Logger logger = LoggerFactory.getLogger(ShopController.class);

    private static final String ID = "shopId";
    private static final String NEW_SHOP_LOG = "New shop was created id:{}";
    private static final String SHOP_UPDATED_LOG = "Shop:{} was updated";

    private final ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @Operation(summary = "create new Shop")
    @ApiResponse(
            responseCode = "201",
            description = "Shop is created",
            content = {@Content(mediaType = APPLICATION_JSON_VALUE, schema = @Schema(implementation = ShopDto.class))}
            )
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<ShopDto> createShop(@Valid @RequestBody ShopDto shopDto) {
        shopService.createShop(shopDto);
        logger.info(NEW_SHOP_LOG, shopDto.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(shopDto);
    }
}
