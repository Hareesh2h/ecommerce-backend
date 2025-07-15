package com.ht.ecommercetap.controller;

import com.ht.ecommercetap.entity.Cart;
import com.ht.ecommercetap.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/{userId}")
    public Cart getCart(@PathVariable Long userId) {
        return cartService.getCartByUserId(userId);
    }

    @PostMapping("/{userId}/add")
    public Cart addItem(@PathVariable Long userId, @RequestParam Long productId, @RequestParam Integer quantity) {
        return cartService.addItemToCart(userId, productId, quantity);
    }

    @PutMapping("/{userId}/update")
    public Cart updateItem(@PathVariable Long userId, @RequestParam Long productId, @RequestParam Integer quantity) {
        return cartService.updateItemQuantity(userId, productId, quantity);
    }

    @DeleteMapping("/{userId}/remove")
    public Cart removeItem(@PathVariable Long userId, @RequestParam Long productId) {
        return cartService.removeItemFromCart(userId, productId);
    }
}
