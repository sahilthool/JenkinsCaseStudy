package com.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.bean.InventoryItem;
import com.inventory.persistence.InventoryDao;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryDao inventoryDao;

	@Override
	public InventoryItem getInventoryItemByProductCode(String productCode) {
		return inventoryDao.findByProductCode(productCode);
	}

	@Override
	public InventoryItem updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity) {
		int row = inventoryDao.updateAvailableQuantity(productCode, availableQuantity);
		if(row > 0) {
			return inventoryDao.findByProductCode(productCode);
		}
		return new InventoryItem();
	}
	


}
