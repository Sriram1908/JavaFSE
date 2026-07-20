package DesignPatternsandPrinciples.Exercise4.AdapterPatternExample;




public class TestClass {

    static void main() {

        PaymentProcessor p1 = new phonePayAdapter(new phonePayGateway());

        PaymentProcessor p2 = new googlePayAdapter(new googlePayGateway());

        p1.processPayment(12000);
        p2.processPayment(150042);


    }
}


//output

//PhonePe Payment Successful
//Amount Paid:₹ 12000.0
//Google Pay Payment Successful
//Amount Sent : ₹150042.0
