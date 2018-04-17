package com.greenfoxacademy.groot.model;

public class FillResponse {

  private String received;
  private int amount;
  private String shipstatus;
  private boolean ready;

  public FillResponse(String received, int amount, String shipstatus, boolean ready) {
    this.received = received;
    this.amount = amount;
    this.shipstatus = shipstatus;
    this.ready = ready;
  }

  public FillResponse() {
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
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
