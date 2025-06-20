public class UPI implements PaymentStrategy{
    private String upiId;

    public UPI(String upiId){
        this.upiId = upiId;
    }

    public void pay(double amount){
        System.out.println("Payment of " + amount + " made using UPI ID: "+upiId);
    }
}
