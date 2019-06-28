package com.mainacad.model;

public class Square implements Shape {
  private double side;

  public Square(int side) {
    this.side = side;
  }

  public Square() {
  }

  @Override
  public double getArea() {
    return side * side;
  }
}
