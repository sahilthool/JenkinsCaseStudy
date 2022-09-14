package com.inventory.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inventory.bean.InventoryItem;

@Repository
public interface InventoryDao extends JpaRepository<InventoryItem, Integer>{
	
	InventoryItem findByProductCode(String productCode);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE InventoryItem SET availableQuantity=:aq where productCode=:pc")
	int updateAvailableQuantity(@Param("pc") String productCode, @Param("aq") int availableQuantity);

}
