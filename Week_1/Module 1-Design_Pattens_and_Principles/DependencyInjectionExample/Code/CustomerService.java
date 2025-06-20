package Code;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor Injection 👇
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void printCustomerDetails(String id) {
        Customer customer = customerRepository.findCustomerById(id);
        if (customer != null) {
            System.out.println("Customer ID   : " + customer.getId());
            System.out.println("Customer Name : " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
