package com.mainacad;

import com.mainacad.model.*;

public class ApplicationRunner {
  static Shape maxShape;

  public static void main(String[] args) {
    Circle circle = new Circle(7);
    Triangle triangle = new Triangle(23,6);
    Rectangle rectangle = new Rectangle(14,6);
    Square square = new Square(15);

    maxShape = circle;
    checkShape(triangle);
    checkShape(rectangle);
    checkShape(square);

    System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " and it has area " + maxShape.getArea());
  }

  private static void checkShape(Shape shape) {
    if (shape.getArea() > maxShape.getArea()) {
      maxShape = shape;
    }
  }
}
