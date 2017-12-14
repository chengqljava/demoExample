package demo.example.designPatterns.structural.adapter.classAdapter;

public class Test {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
