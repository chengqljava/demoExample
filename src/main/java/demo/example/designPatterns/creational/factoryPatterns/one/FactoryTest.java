package demo.example.designPatterns.creational.factoryPatterns.one;

import demo.example.designPatterns.creational.factoryPatterns.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("sms");
        sender.send();
    }
}
