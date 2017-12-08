package demo.example.designPatterns.creational.abstractFactory;

public class SmsSender implements Sender {

    public void send() {
        System.out.println("短信发送");
    }

}
