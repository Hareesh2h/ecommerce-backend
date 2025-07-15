package com.ht.ecommercetap.repository;

import com.ht.ecommercetap.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
