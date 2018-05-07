package com.greenfoxacademy.pallida.repository;

import com.greenfoxacademy.pallida.model.Cart;
import com.greenfoxacademy.pallida.model.Warehouse;
import org.springframework.data.repository.CrudRepository;

public interface CartRepo extends CrudRepository<Cart, Long> {
}
