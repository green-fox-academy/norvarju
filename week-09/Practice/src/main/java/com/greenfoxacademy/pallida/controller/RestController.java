package com.greenfoxacademy.pallida.controller;


import com.greenfoxacademy.pallida.model.Result;
import com.greenfoxacademy.pallida.repository.ClothingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  ClothingRepo clothingRepo;

  @GetMapping("/warehouse/query")
  public ResponseEntity listItems(@RequestParam(name = "price", required = false) Float price,
                                  @RequestParam(name = "type", required = false) String type) {
    if (type.equals("lower")) {
      return ResponseEntity.status(HttpStatus.OK).body(new Result(clothingRepo
              .findAllByUnitPriceIsLessThan(price)));
    } else if (type.equals("equals")) {
      return ResponseEntity.status(HttpStatus.OK).body(new Result(clothingRepo
              .findAllByUnitPriceEquals(price)));
    } else if (type.equals("higher")) {
      return ResponseEntity.status(HttpStatus.OK).body(new Result(clothingRepo
              .findAllByUnitPriceGreaterThan(price)));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Error("Oops"));
      }
  }
}
