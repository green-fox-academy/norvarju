package com.greenfoxacademy.pallida.controller;

import com.greenfoxacademy.pallida.model.Cart;
import com.greenfoxacademy.pallida.model.Warehouse;
import com.greenfoxacademy.pallida.repository.CartRepo;
import com.greenfoxacademy.pallida.repository.ClothingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Maincontroller {

  @Autowired
  ClothingRepo clothingRepo;

  @Autowired
  CartRepo cartRepo;

  @GetMapping("/warehouse")
  public String fashionStore(Model model) {
    model.addAttribute("clothes", clothingRepo.findAll());
    model.addAttribute("items", clothingRepo.findAllDistinctByItemName());
    model.addAttribute("sizes", clothingRepo.findAllDistinctBySize());
    return "index";
  }

  @PostMapping("/warehouse")
  public String addToCart(@ModelAttribute(name = "item") String item,
                        @ModelAttribute(name = "size") String size,
                        @ModelAttribute(name = "quantity") int quantity) {
    Warehouse warehouse = clothingRepo.findFirstByItemName(item);
    Cart cart = new Cart(item, size ,quantity);
    cart.setManufacturer(warehouse.getManufacturer());
    cart.setCategory(warehouse.getCategory());
    cart.setUnitPrice(warehouse.getUnitPrice());
    cart.setSubTotalPrice(cart.getUnitPrice() * cart.getQuantity());
    cartRepo.save(cart);
    return "redirect:/warehouse/summary";
  }

  @GetMapping("/warehouse/summary")
  public String summary(Model model) {
    model.addAttribute("selectedAll", cartRepo.findAll());
    return "summary";
  }
}
