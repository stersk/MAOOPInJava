package com.mainacad.model;

public class Rectangle {
  private Sides sides;
  public Rectangle(int a, int b) {
    sides = new Sides(a,b);
  }

  public int getA(){
    return sides.a;
  }

  private static class Sides {
    private int a;
    private int b;

    public Sides(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}
