package demo.example.designPatterns.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Color color = new Black();
        Shape square = new Square();
        square.setColor(color);
        square.draw();
    }
}
