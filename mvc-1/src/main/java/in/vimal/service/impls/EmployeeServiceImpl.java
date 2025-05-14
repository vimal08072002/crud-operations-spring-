package in.vimal.service.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vimal.entity.Employee;
import in.vimal.reporsitory.EmployeeRepository;
import in.vimal.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;
	@Override
	public Integer saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp).getEmpId();
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll()  ;
	}
	@Override
	public Employee getOneEmployee(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	@Override
	public void updateEmployee(Employee emp) {
		repo.save(emp);
		
	}
	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
		
	}

}
