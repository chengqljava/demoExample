package demo.example.designPatterns.structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }
}
