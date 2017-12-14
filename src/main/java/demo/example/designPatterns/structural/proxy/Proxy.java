package demo.example.designPatterns.structural.proxy;

public class Proxy implements Sourceable {
    private Sourceable source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    public void method() {
        before();
        source.method();
        after();
    }

    public void before() {
        System.out.println("执行前");
    }

    public void after() {
        System.out.println("执行后");
    }

}
