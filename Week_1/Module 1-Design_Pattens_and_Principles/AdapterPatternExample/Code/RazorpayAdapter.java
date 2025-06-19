public class RazorpayAdapter implements PaymentProcessor{
    private RazorPay razorpay;
    
    public RazorpayAdapter(RazorPay razorpay) {
        this.razorpay = razorpay;
    }

    public void processPayment(double amount){
        razorpay.makePaymentfromRazorpay(amount);
    }
}
