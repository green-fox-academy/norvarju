package com.greenfoxacademy.pallida.model;

import com.greenfoxacademy.pallida.repository.ClothingRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {

  @Autowired
  ClothingRepo clothingRepo;

  private String result;
  private List<Warehouse> clothes;

  public Result(List<Warehouse> clothes) {
    this.result = "ok";
    this.clothes = clothes;
  }

  public Result() {
    this.result = "ok";
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Warehouse> getClothes() {
    return clothes;
  }

  public void setClothes(List<Warehouse> clothes) {
    this.clothes = clothes;
  }
}
