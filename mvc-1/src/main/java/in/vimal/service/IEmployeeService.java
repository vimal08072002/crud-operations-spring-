package in.vimal.service;

import java.util.List;

import in.vimal.entity.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee emp);
	
	List<Employee> getAllEmployees();
	Employee getOneEmployee(Integer id);
	void updateEmployee(Employee emp);
	void deleteEmployee(Integer id);

}
