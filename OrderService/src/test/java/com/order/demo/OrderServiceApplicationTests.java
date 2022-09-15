package com.order.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.order.persistence.OrderDao;

@SpringBootTest
class OrderServiceApplicationTests {
	
	@Autowired
	private OrderDao orderDao;
	
	

	@BeforeEach
	public void setUp() throws Exception {
		inventoryService=new InventoryServiceImpl();
		 inventoryService.setInventoryDao(inventoryDao);
		
		 
		 inventoryDao2=Mockito.mock(InventoryDao.class);
			
			List<InventoryItem> items=new ArrayList<InventoryItem>();
			items.add(new InventoryItem(1001L, "Item001", 20));	
			items.add(new InventoryItem(1002L, "Item002", 30));
			items.add(new InventoryItem(1003L, "Item003", 40));
			
			
			inventoryService.setItems(items);
			inventoryService.setInventoryDao(inventoryDao2);
	}

	@AfterEach
	public void tearDown() throws Exception {
		inventoryService=null;
	}

}
