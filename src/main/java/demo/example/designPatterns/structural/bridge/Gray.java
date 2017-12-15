package demo.example.designPatterns.structural.bridge;

public class Gray implements Color {

    public void bepaint(String shape) {
        System.out.println("灰色" + shape);
    }

}
