package lab10;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
public class EmployeeService {
	public static void main(String args[]) {
	    //1.
		System.out.println("SUM:");
		Stream<Employee> e1=EmployeeRepository.getEmployees().stream();
		List<Double> l1=e1.map((e)->e.getSalary()).collect(Collectors.toList());
		Stream<Double> s=l1.stream();
		Optional<Double> o=s.reduce((a,b)->a+b);
		System.out.println(o.get());
		System.out.println("\n");
		
		//3.	
		System.out.println("SeniorEmployee:");
		Stream<Employee> de=EmployeeRepository.getEmployees().stream();
		Optional<Employee> opt=de.min((a,b)->a.getHireDate().compareTo(b.getHireDate()));
		System.out.println(opt.get());
		System.out.println("\n");
		
		//2.
		System.out.println("Dept:");
		List<Employee> l2=EmployeeRepository.getEmployees();
		Map<Department,Long> m=l2.stream().filter(e->e.getDepartment()!=null).collect(Collectors.groupingBy(Employee::
				getDepartment,Collectors.counting()));
		m.forEach((a,b)->
			System.out.println(a.getDepartmentName()+" "+b));
		System.out.println("\n");
		
		//11.
		System.out.println("Before and After Applying 15% :");
		EmployeeRepository.getEmployees().stream().
		forEach(s11 -> System.out.println(s11.getFirstName() + " " + s11.getLastName() + "  " + s11.getSalary() + " " 
		+ (s11.getSalary() + (s11.getSalary()*15) / 100)));
		System.out.println("\n");
		
		//12.
		System.out.println("NotReport:");
		EmployeeRepository.getEmployees().stream().filter(s8->(s8.getManagerId() == null))
		.forEach(e -> System.out.println(e.getFirstName() + " "+ e.getLastName()));
		System.out.println("\n");
		
		//8.
		System.out.println("Date: ");
		Stream<Employee> e8=EmployeeRepository.getEmployees().stream();
	e8.forEach((e) -> System.out.println(e.getFirstName() + " "
				+ e.getLastName() + "   " + e.getHireDate() + "   " + e.getHireDate().getDayOfWeek()));
	System.out.println("\n");	
		
		//5.
		System.out.println("Without Dept:");
		Stream<Employee> d5=EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()==null);
		d5.forEach((e) ->System.out.println(e.getFirstName() + " "+ e.getLastName()));
		System.out.println("\n");	
		
		//6.
		System.out.println("Without Employees:");
		//Stream<Department> d6=EmployeeRepository.getDepartments().stream().filter(e->e.get);
		
		
		String k ="big "; 
	      k.concat("crowded ");
	      k += "city";
	      System.out.println(k);
		
		//7.
		//Stream<Department> d3=EmployeeRepository.getDepartments().stream();
		
		
		
		
	}
}
