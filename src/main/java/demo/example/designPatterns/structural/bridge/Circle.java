package demo.example.designPatterns.structural.bridge;

public class Circle extends Shape {

    @Override
    public void draw() {
        color.bepaint("圆形");
    }

}
