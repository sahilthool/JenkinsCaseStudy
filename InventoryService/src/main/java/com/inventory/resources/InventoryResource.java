package com.inventory.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.bean.InventoryItem;
import com.inventory.service.InventoryService;

@RestController
public class InventoryResource {
	
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping(path = "/inventoryitems/{productCode}",produces = MediaType.APPLICATION_JSON_VALUE)
	public InventoryItem getInventoryItemByProductCode (@PathVariable("productCode") String productCode){
		return inventoryService.getInventoryItemByProductCode(productCode);
	}
	
	@PutMapping(path = "/inventoryitems/{pc}/{aq}",produces = MediaType.APPLICATION_JSON_VALUE)
	public InventoryItem updateInventoryItemQuantityByProductCode(@Param("pc") String productCode, @Param("aq") int availableQuantity) {
		return inventoryService.updateInventoryItemQuantityByProductCode(productCode, availableQuantity);
	}

}
