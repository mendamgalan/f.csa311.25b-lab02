package edu.cmu.cs.cs214.lab02.shapes;

/**
 * A circle shape implementation.
 */
public class Circle implements Shape {
  private double radius; // public байсан attribute private болгосон

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
}
