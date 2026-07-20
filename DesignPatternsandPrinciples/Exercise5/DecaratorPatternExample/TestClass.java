package DesignPatternsandPrinciples.Exercise5.DecaratorPatternExample;

public class TestClass {

    static void main(String[] args) {
        
        Notifier n = new SnackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier(

                        )
                )
        );
        n.send();
    }
}
