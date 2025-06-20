import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("------------------------------------------");
        System.out.println("| Welcome to Payment Portal of Cognizant |");
        System.out.println("------------------------------------------");

        int choice = 0;
        while (true) {
            System.out.println("\n\nChoose the Payment Method:");
            System.out.println("Enter 1 for Credit Card");
            System.out.println("Enter 2 for UPI Id (PhonePe, Paytm, GPay, AmazonPay...)");
            System.out.print("Your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume the newline

            if (choice == 1) {
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = sc.nextLine();
                context.setPaymentStrategy(new CreditCard(cardNumber));
                break;
            } else if (choice == 2) {
                System.out.print("Enter UPI Id: ");
                String upiId = sc.nextLine();
                context.setPaymentStrategy(new UPI(upiId));
                break;
            } else {
                System.out.println("❌ Invalid choice! Please choose only 1 or 2.");
            }
        }

        System.out.println("-------------------------------------------");
        System.out.print("Enter amount to pay: Rs.");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        context.makePayment(amount);
        sc.close();
    }
}
