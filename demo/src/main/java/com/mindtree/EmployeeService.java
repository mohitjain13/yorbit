package com.mindtree;

import java.util.List;

public interface EmployeeService {

	List<Employee> getList();

	Employee save(Employee employee);

}
