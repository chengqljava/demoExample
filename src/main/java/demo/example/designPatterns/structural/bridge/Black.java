package demo.example.designPatterns.structural.bridge;

public class Black implements Color {

    public void bepaint(String shape) {
        System.out.println("黑色" + shape);
    }

}
