package com.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.OrderItem;
import com.example.Entities.pk.OrderItemPk;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
