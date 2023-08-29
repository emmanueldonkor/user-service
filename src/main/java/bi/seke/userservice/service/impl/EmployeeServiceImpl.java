package bi.seke.userservice.service.impl;

import bi.seke.userservice.document.Employee;
import bi.seke.userservice.repository.EmployeeRepository;
import bi.seke.userservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(String uuid) {
        return employeeRepository.findById(uuid).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByEmailOrUid(String emailOrUid) {
        return employeeRepository.findByEmailOrUid(emailOrUid);
    }
}
