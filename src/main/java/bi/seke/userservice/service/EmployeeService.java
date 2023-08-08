package bi.seke.userservice.service;

import bi.seke.userservice.document.Employee;

import java.util.List;

public interface EmployeeService {
  Employee getEmployeeById(String uuid);
  List<Employee> getAllEmployees();
  Employee getEmployeeByEmailOrUid(String emailOrUid);
}
