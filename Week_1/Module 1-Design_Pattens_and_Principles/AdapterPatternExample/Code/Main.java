public class Main {
    public static void main(String[] args) {
        //Payment using RazorPay
        RazorPay razorpay = new RazorPay();
        PaymentProcessor razorpayAdapter = new RazorpayAdapter(razorpay);
        razorpayAdapter.processPayment(1000);

        //Payment using Paypal
        Paypal paypal = new Paypal();
        PaymentProcessor paypalAdapter = new PaypalAdapter(paypal);
        paypalAdapter.processPayment(2000);
    }
}
