package Code;

public class Main {
    public static void main(String[] args) {
        // Create the dependency
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the dependency into the service using constructor
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.printCustomerDetails("C123");
    }
}
