package bi.seke.userservice.controller;

import bi.seke.userservice.document.Address;
import bi.seke.userservice.document.Customer;
import bi.seke.userservice.service.CustomerService;
import bi.seke.userservice.service.EmployeeService;
import bi.seke.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CustomerService customerService;
    private final EmployeeService employeeService;
    private final UserService userService;

    @Autowired
    public UserController(CustomerService customerService, EmployeeService employeeService, UserService userService) {
        this.customerService = customerService;
        this.employeeService = employeeService;
        this.userService = userService;
    }

    /**
     * Endpoint to get any user by email-id or uuid
     */
    @GetMapping("/{emailOrUid}")
    public ResponseEntity<?> getUserByEmailOrUid(@PathVariable String emailOrUid) {
        return userService.getUser(emailOrUid)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //End point to get all customers
    @GetMapping("/customers")
    public ResponseEntity<?> getAllCustomers() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    //Endpoint to get all addresses for a specific customer and add a new address
    @GetMapping("/customers/{customerUid}/addresses")
    public ResponseEntity<?> getCustomerAddress(@PathVariable String customerUid) {
        Customer customer = customerService.getCustomerById(customerUid);
        if (customer != null) {
            return ResponseEntity.ok(customer.getAddresses());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Endpoint to get the default address for a specific customer or set a new default address
    @GetMapping("/customers/{customerUid}/addresses/{code}/default")
    public ResponseEntity<?> getDefaultAddress(@PathVariable String customerUid, @PathVariable String code) {
        Customer customer = customerService.getCustomerById(customerUid);
        if (customer != null) {
            Address defaultAddress = customer.getAddresses().stream()
                    .filter(address -> address.getCode().equals(code))
                    .findFirst()
                    .orElse(null);

            if (defaultAddress != null) {
                customer.setDefaultAddress(defaultAddress);
                customerService.saveCustomer(customer);
                return ResponseEntity.ok(defaultAddress);
            } else {
                return ResponseEntity.notFound().build();
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

