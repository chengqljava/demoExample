package demo.example.designPatterns.structural.decorator;

public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    public void method() {
        System.out.println("装饰对象前");
        source.method();
        System.out.println("装饰对象后");
    }

}
