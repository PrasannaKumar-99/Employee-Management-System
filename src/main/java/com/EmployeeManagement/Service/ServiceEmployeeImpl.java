package com.EmployeeManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EmployeeManagement.Entity.EmployeeEntity;
import com.EmployeeManagement.Repository.EmployeeRepository;



@Service
public class ServiceEmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;
	

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public void saveEmployee(EmployeeEntity employee) {
      this.  repo.save(employee);
    }

  

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }

  

	@Override
	public EmployeeEntity getEmployeeById(Long id) {
		Optional<EmployeeEntity> optional = repo.findById(id);
		EmployeeEntity employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}
	}

