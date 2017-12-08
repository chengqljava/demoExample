package demo.example.designPatterns.creational.factoryPatterns.three;

import demo.example.designPatterns.creational.factoryPatterns.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
