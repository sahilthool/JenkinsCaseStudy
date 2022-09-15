package com.order.service;

import java.util.Optional;

import com.order.bean.Order;

public interface OrderService {
	
	Order saveOrder(Order order);
	Optional<Order> findOrderById (long id);
	
	

}
