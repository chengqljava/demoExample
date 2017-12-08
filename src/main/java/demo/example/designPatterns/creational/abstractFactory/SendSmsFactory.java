package demo.example.designPatterns.creational.abstractFactory;

public class SendSmsFactory implements Provider {

    public Sender produce() {
        return new SmsSender();
    }

}
