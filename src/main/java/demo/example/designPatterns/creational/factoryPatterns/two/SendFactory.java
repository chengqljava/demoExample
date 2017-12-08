package demo.example.designPatterns.creational.factoryPatterns.two;

import demo.example.designPatterns.creational.factoryPatterns.MailSender;
import demo.example.designPatterns.creational.factoryPatterns.Sender;
import demo.example.designPatterns.creational.factoryPatterns.SmsSender;

public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
