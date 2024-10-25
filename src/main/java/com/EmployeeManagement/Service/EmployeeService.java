package com.EmployeeManagement.Service;



import java.util.List;
import com.EmployeeManagement.Entity.EmployeeEntity;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployees();
    void saveEmployee(EmployeeEntity employee);
    EmployeeEntity getEmployeeById(Long id); // Make sure the method name matches
    void deleteEmployee(Long id); // Ensure consistency in parameter naming
}
