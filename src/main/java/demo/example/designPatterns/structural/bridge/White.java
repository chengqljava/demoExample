package demo.example.designPatterns.structural.bridge;

public class White implements Color {

    public void bepaint(String shape) {
        System.out.println("白色" + shape);
    }

}
