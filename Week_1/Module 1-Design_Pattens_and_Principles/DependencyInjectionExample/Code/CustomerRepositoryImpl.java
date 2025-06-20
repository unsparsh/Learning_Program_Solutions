package Code;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(String id) {
        // In a real-world app, this would query a DB
        // For now, return a dummy customer
        return new Customer(id, "Sparsh Singh");
    }
}
