package DesignPatternsandPrinciples.Exercise4.AdapterPatternExample;

class phonePayGateway{

    public void sendMoney(double amount)
    {
        System.out.println("PhonePe Payment Successful");
        System.out.println("Amount Paid:₹ "+amount);
    }
}

class googlePayGateway{

    public void transaction(double amt)
    {
        System.out.println("Google Pay Payment Successful");
        System.out.println("Amount Sent : ₹" + amt);
    }
}


class phonePayAdapter implements PaymentProcessor
{
    private phonePayGateway p;

    public phonePayAdapter(phonePayGateway p)
    {
        this.p = p;
    }

    public void processPayment(double amt){
        p.sendMoney(amt);
    }
}

class googlePayAdapter implements PaymentProcessor{

    private googlePayGateway g;

    public googlePayAdapter(googlePayGateway g)
    {
        this.g=g;
    }

    public void processPayment(double amt)
    {
        g.transaction(amt);
    }
}


