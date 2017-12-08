package demo.example.designPatterns.creational.factoryPatterns.three;

import demo.example.designPatterns.creational.factoryPatterns.MailSender;
import demo.example.designPatterns.creational.factoryPatterns.Sender;
import demo.example.designPatterns.creational.factoryPatterns.SmsSender;

public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
