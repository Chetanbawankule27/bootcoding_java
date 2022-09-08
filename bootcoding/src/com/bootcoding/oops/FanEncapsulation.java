package com.bootcoding.oops;

public class FanEncapsulation {
    public FanEncapsulation(){

    }
  private   int speed;
  private   int noofblades;
  String colour;
  private double Price;
  private   String company;

  private int warranty;

  public void setSpeed(int speed){
      this.speed =speed;
  }
  public void setColour(String colour){
     this.colour =colour;
  }
  public void setNoofblades(int noofblades){
      this.noofblades= noofblades;
  }
  public void setPrice(double Price){
      this.Price=Price;
  }
  public void setCompany(String company){
      this.company= company;

  }
  public void setWarranty(int warranty){
      this.warranty =warranty;
  }

    public double getspeed() {
        return speed;
    }

    public double getPrice() {
        return Price;
    }

    public String getCompany() {
        return company;

    }

    public int getNoofblades() {
        return noofblades;
    }

    public int getWarranty() {
        return warranty;
    }
}
