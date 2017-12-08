package demo.example.designPatterns.creational.abstractFactory;

public class MailSender implements Sender {

    public void send() {
        System.out.println("邮件发送");
    }

}
