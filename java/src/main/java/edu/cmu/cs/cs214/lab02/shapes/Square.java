package edu.cmu.cs.cs214.lab02.shapes;

/**
 * A square shape with a specified side length.
 */
public class Square implements Shape {
  private double sideLen; // attribute-ыг private болгосон

  public Square(double sideLen) {
    this.sideLen = sideLen;
  }

  public double getArea() {
    return sideLen * sideLen;
  }
}
