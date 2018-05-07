package com.greenfoxacademy.pallida.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String itemName;
  private String manufacturer;
  private String category;
  private String size;
  private int quantity;
  private float unitPrice;
  private float subTotalPrice;

  public Cart(String itemName, String manufacturer, String category, String size, int quantity,
              float unitPrice, float subTotalPrice) {
    this.itemName = itemName;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.subTotalPrice = subTotalPrice;
  }

  public Cart(String itemName, String size, int quantity) {
    this.itemName = itemName;
    this.size = size;
    this.quantity = quantity;
    this.subTotalPrice = quantity * unitPrice;
  }

  public Cart() {
    this.subTotalPrice = getQuantity() * getUnitPrice();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public float getSubTotalPrice() {
    return subTotalPrice;
  }

  public void setSubTotalPrice(float subTotalPrice) {
    this.subTotalPrice = subTotalPrice;
  }
}
