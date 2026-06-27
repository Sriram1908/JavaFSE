package DesignPatternsandPrinciples.Exercise5.DecaratorPatternExample;


public class EmailNotifier implements Notifier{

    public void send(){
        System.out.println("Email Notification Sent");
    }
}



abstract class NotifierDecorator implements  Notifier{
    Notifier n;

    public NotifierDecorator(Notifier n)
    {
        this.n = n;
    }

    public void send(){
        n.send();
    }
}


class SMSNotifierDecorator extends NotifierDecorator{

    public SMSNotifierDecorator(Notifier n) {
        super(n);
    }

    public void send(){
        super.send();
        System.out.println("SMS Notification to sent");
    }
}

class SnackNotifierDecorator extends NotifierDecorator{

    public SnackNotifierDecorator(NotifierDecorator n)
    {
        super(n);
    }

    public void send(){
        super.send();
        System.out.println("Slack notidfication sent");
    }
}