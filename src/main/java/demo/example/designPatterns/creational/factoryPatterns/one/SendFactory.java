package demo.example.designPatterns.creational.factoryPatterns.one;

import demo.example.designPatterns.creational.factoryPatterns.MailSender;
import demo.example.designPatterns.creational.factoryPatterns.Sender;
import demo.example.designPatterns.creational.factoryPatterns.SmsSender;

public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
