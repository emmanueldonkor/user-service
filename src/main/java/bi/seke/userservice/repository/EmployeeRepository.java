package bi.seke.userservice.repository;

import bi.seke.userservice.document.Customer;
import bi.seke.userservice.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

  @Query("SELECT e FROM Employee e WHERE e.email =?1 OR e.uid=?1")
  Employee findByEmailOrUid(String emailOrUid);
}
