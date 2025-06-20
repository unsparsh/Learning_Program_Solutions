public class CreditCard implements PaymentStrategy {
    private String cardNumber;
    public CreditCard (String cardNumer){
        this.cardNumber = cardNumer;
    }    

    public void pay(double amount){
        System.out.println("Amount "+amount+" Paid through card: "+cardNumber);
    }
}
