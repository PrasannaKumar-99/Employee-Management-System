package com.EmployeeManagement.Repository;





import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	


}
