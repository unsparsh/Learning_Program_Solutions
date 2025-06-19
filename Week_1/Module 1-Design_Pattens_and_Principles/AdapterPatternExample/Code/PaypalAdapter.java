public class PaypalAdapter implements PaymentProcessor{
    private Paypal paypal;
    
    public PaypalAdapter(Paypal paypal) {
        this.paypal = paypal;
    }

    public void processPayment(double amount){
        paypal.makePaymentfromPaypal(amount);
    }    
}
