package in.vimal.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.vimal.entity.Employee;
import in.vimal.service.IEmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/employee")
public class EmployeeControler {
	
	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/register")
	public String showReg() {
		return "EmployeeRegister";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Employee employee,Model model) {
		Integer id=service.saveEmployee(employee);
		
		String message="employee "+id+" created";
		model.addAttribute("message", message);
		
		System.out.println( "your id is:"+employee+id);
		return "EmployeeRegister";
		
	}
	@GetMapping("/all")
	public String getall(Model model) {
		List<Employee> list=service.getAllEmployees();
		model.addAttribute("list", list);
		return "Employeedata";
	}
	
	@GetMapping("/alll")
	public String getalll(Model model) {
		List<Employee> list=service.getAllEmployees();
		System.out.println(list);
		model.addAttribute("list", list);
		return "Empdata";
	}
	
	@GetMapping("/edit/{id}")
	public String showEdit(@PathVariable Integer id,Model model) {
		System.out.println("edit method");
		Employee emp=service.getOneEmployee(id);
		model.addAttribute("emp", emp);
		return "EmployeeEdit";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Employee employee) {
		service.updateEmployee(employee);
		return "redirect:alll";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id,Model model) {
		Employee emp=service.getOneEmployee(id);
		model.addAttribute("emp", emp);
		return "EmployeeDelete";
	}
	@PostMapping("/delete")
	public String delete(@ModelAttribute Employee employee) {
		Integer id=employee.getEmpId();
		service.deleteEmployee(id);
		return "redirect:alll";
		
	}

}
