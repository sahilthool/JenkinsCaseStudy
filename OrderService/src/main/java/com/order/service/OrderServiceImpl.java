package com.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.bean.Order;
import com.order.persistence.OrderDao;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;

	@Override
	public Order saveOrder(Order order) {
		return orderDao.save(order);
	}

	@Override
	public Optional<Order> findOrderById(long id) {
		return orderDao.findById(id);
	}

}
