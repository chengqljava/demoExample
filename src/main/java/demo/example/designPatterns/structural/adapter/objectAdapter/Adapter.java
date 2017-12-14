package demo.example.designPatterns.structural.adapter.objectAdapter;

public class Adapter implements Targetable {
    private Source source;

    public Adapter(Source source) {
        super();
        this.source = source;
    }

    public void method() {
        source.method();
    }

    public void newMethod() {
        System.out.println("这是一个新方法");
    }

}
