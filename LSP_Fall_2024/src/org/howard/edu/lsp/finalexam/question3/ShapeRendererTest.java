package org.howard.edu.lsp.finalexam.question3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeRendererTest {

    @Test
    public void testCircleInstantiation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.getShape("circle");
        assertNotNull(circle, "Circle should not be null");
        assertTrue(circle instanceof Circle, "Object should be an instance of Circle");
    }

    @Test
    public void testRectangleInstantiation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape rectangle = factory.getShape("rectangle");
        assertNotNull(rectangle, "Rectangle should not be null");
        assertTrue(rectangle instanceof Rectangle, "Object should be an instance of Rectangle");
    }

    @Test
    public void testTriangleInstantiation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape triangle = factory.getShape("triangle");
        assertNotNull(triangle, "Triangle should not be null");
        assertTrue(triangle instanceof Triangle, "Object should be an instance of Triangle");
    }

    @Test
    public void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape unknown = factory.getShape("hexagon");
        assertNull(unknown, "Unknown shape should return null");
    }

    @Test
    public void testSingletonFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2, "Both references should point to the same instance");
    }
}
