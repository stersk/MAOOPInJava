package com.mainacad.model;

public class Rectangle implements Shape {
  private Sides sides;

  public Rectangle(double a, double b){
    sides = new Sides(a,b);
  }

  public Rectangle() {
    sides = new Sides(0,0);
  }

  public double getA(){
    return sides.a;
  }


  @Override
  public double getArea() {
    // Why?
    return sides.a * sides.b;
  }

  private static class Sides {
    private double a;
    private double b;

    public Sides(double a, double b) {
      this.a = a;
      this.b = b;
    }
  }
}