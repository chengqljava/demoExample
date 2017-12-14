package demo.example.designPatterns.structural.adapter.objectAdapter;

public class AdapterTest {

    public static void main(String[] args) {

        Source source = new Source();
        Targetable targetable = new Adapter(source);
        targetable.method();
        targetable.newMethod();
    }

}
