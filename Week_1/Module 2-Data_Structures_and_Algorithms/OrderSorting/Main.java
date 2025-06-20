package OrderSorting;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Sparsh", 3500),
            new Order("O102", "Hetal", 1500),
            new Order("O103", "Ravi", 2500),
            new Order("O104", "Priya", 5000)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Testing Bubble Sort
        Order[] bubbleSorted = orders.clone();
        BubbleSort.sort(bubbleSorted);
        System.out.println("\nOrders after Bubble Sort (by totalPrice):");
        printOrders(bubbleSorted);

        // Testing Quick Sort
        Order[] quickSorted = orders.clone();
        QuickSort.sort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nOrders after Quick Sort (by totalPrice):");
        printOrders(quickSorted);
    }

    public static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
