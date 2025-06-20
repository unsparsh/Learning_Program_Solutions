public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("Car.jpg");
        Image image2 = new ProxyImage("Bike.jpg");

        System.out.println("First time calling Car Image:");
        image1.display();

        System.out.println("\nSecond time calling Car Image");
        image1.display();
        
        System.out.println("----------------------------------");

        System.out.println("\nFirst time calling Bike Image");
        image2.display();
        
        System.out.println("\nSecond time calling Bike Image");
        image2.display();

    }
}
