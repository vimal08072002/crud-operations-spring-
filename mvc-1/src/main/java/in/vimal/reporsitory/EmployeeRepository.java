package in.vimal.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vimal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	


}
