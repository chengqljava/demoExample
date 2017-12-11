package demo.example.designPatterns.creational.builder;

public class ConcreteBuilder implements Builder {

    public void buildPartA() {
        System.out.println("部分1");
    }

    public void buildPartB() {
        System.out.println("部分2");
    }

    public void buildPartC() {
        System.out.println("部分3");
    }

    public Product getResult() {
        return null;
    }

}
