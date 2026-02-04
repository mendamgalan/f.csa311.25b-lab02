package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

/** Main class to demonstrate shape rendering with different shape types. */
public class Main {
  /**
   * Main method to demonstrate shape rendering.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    Shape rectangle = new Rectangle(2, 3);
    Renderer renderer = new Renderer(rectangle);
    renderer.draw();
    // Ямар ч дүрсийг Shape-ээр илэрхийлж болно

    // Circle ашиглах
    Shape circle = new Circle(5);
    Renderer renderer2 = new Renderer(circle);
    renderer2.draw();

    // Square ашиглах
    Shape square = new Square(4);
    Renderer renderer3 = new Renderer(square);
    renderer3.draw();
  }
}
