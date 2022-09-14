package com.inventory.service;

import com.inventory.bean.InventoryItem;

public interface InventoryService {
	
	InventoryItem getInventoryItemByProductCode (String productCode);
	InventoryItem updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity);

}
