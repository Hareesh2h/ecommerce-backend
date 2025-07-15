package com.ht.ecommercetap.repository;

import com.ht.ecommercetap.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}