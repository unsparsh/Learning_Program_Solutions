public class PaymentContext {
    private PaymentStrategy pStrategy;

    public void setPaymentStrategy(PaymentStrategy pStrategy) {
        this.pStrategy = pStrategy;
    }

    public void makePayment(double amount){
        if(pStrategy == null){
            System.out.println("Please choose any one of the payment method");
        }else{
            pStrategy.pay(amount);
        }
    }
}
