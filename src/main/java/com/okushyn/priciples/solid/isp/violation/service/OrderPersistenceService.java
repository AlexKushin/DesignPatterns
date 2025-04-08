package com.okushyn.priciples.solid.isp.violation.service;

import com.okushyn.priciples.solid.isp.violation.entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order> {

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public void save(Order order) {
        synchronized (ORDERS) {
            ORDERS.put(order.getId(), order);
        }
    }

    @Override
    public void delete(Order order) {
        synchronized (ORDERS) {
            ORDERS.remove(order.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (ORDERS) {
            return ORDERS.get(id);
        }
    }

    //Violation (Order class doesn't have name)
    @Override
    public List<Order> findByName(String name) {
        throw new UnsupportedOperationException("Find by name is not supported");
    }
}
