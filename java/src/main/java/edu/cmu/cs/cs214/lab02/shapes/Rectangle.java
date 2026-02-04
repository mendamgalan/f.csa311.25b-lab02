package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height; // attribute-уудыг private болгосон
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
}
