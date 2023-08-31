package bi.seke.userservice.service.impl;

import bi.seke.userservice.document.Customer;
import bi.seke.userservice.repository.CustomerRepository;
import bi.seke.userservice.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(String uid) {
        return customerRepository.findById(uid).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerByEmailOrUid(String emailOrUid) {
        return customerRepository.findByEmailOrUid(emailOrUid);
    }
}
