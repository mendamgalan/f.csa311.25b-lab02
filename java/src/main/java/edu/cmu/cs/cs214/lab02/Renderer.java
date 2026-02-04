package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/** Renderer class that handles drawing shapes and calculating their areas. */
public class Renderer {
  private final Shape shape; // Use 'final' since shape doesn't change

  public Renderer(Shape shape) { // Add 'public' modifier
    this.shape = shape;
  }

  public void draw() { // Add 'public' modifier
    double area = shape.getArea();
    System.out.println("Shape printed\nIts area is " + area);
  }
}
