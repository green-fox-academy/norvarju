package com.greenfoxacademy.pallida.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity
public class Warehouse {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String itemName;
  private String manufacturer;
  private String category;
  private String size;
  private float unitPrice;
  private Integer inStore;

  public Warehouse(String itemName, String manufacturer, String category, String size, float
          unitPrice, Integer inStore) {
    this.itemName = itemName;
    this.manufacturer = manufacturer;
    this.category = category;
    this.size = size;
    this.unitPrice = unitPrice;
    this.inStore = inStore;
  }

  public Warehouse() {
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

  public float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Integer isIn_store() {
    return inStore;
  }

  public void setInStore(Integer inStore) {
    this.inStore = inStore;
  }
}

