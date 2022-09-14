package com.inventory.bean;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class InventoryItem {
	
	@Id
    private long id; 
    private String productCode;
    private int availableQuantity ;


}
