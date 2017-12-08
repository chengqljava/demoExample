package demo.example.designPatterns.creational.factoryPatterns.two;

import demo.example.designPatterns.creational.factoryPatterns.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
