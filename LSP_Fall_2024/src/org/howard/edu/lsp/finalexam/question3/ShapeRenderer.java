package org.howard.edu.lsp.finalexam.question3;
//Shape Interface
interface Shape {
 void draw();
}

//Circle Class
class Circle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Rectangle Class
class Rectangle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Triangle Class
class Triangle implements Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Triangle");
 }
}

//Shape Factory (Singleton)
class ShapeFactory {
 // Singleton instance
 private static ShapeFactory instance;

 // Private constructor to prevent instantiation
 private ShapeFactory() {}

 // Method to retrieve the single instance of ShapeFactory
 public static synchronized ShapeFactory getInstance() {
     if (instance == null) {
         instance = new ShapeFactory();
     }
     return instance;
 }

 // Factory method to create shapes
 public Shape getShape(String shapeType) {
     if (shapeType == null) {
         return null;
     }
     switch (shapeType.toLowerCase()) {
         case "circle":
             return new Circle();
         case "rectangle":
             return new Rectangle();
         case "triangle":
             return new Triangle();
         default:
             return null;
     }
 }
}

//ShapeRenderer Class
public class ShapeRenderer {
 public void renderShape(String shapeType) {
     ShapeFactory factory = ShapeFactory.getInstance();
     Shape shape = factory.getShape(shapeType);
     if (shape != null) {
         shape.draw();
     } else {
         System.out.println("Unknown shape type: " + shapeType);
     }
 }

 public static void main(String[] args) {
     ShapeRenderer renderer = new ShapeRenderer();

     // Render different shapes
     renderer.renderShape("circle");    // Output: Drawing a Circle
     renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
     renderer.renderShape("triangle");  // Output: Drawing a Triangle
     renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
 }
}



