package com.greenfoxacademy.groot.model;

public class Cargo {

  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipstatus;
  private boolean ready;

  public Cargo(int caliber25, int caliber30, int caliber50, String shipstatus, boolean ready) {
    this.caliber25 = caliber25;
    this.caliber30 = caliber30;
    this.caliber50 = caliber50;
    this.shipstatus = shipstatus;
    this.ready = ready;
  }

  public Cargo() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipstatus = "empty";
    this.ready = false;
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
