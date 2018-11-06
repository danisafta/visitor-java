package Implementations;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List <Employee> lEmp= new ArrayList<>();
		
		lEmp.add(new Employee("Fred",100));
		lEmp.add(new Employee("Alice", 2100));
		lEmp.add(new Manager("Bob", 3000,100));
		lEmp.add(new Intern("Adi",12));
		Manager subManger = new Manager("mangersub", 1221, 100);
		Employee firstEmpl = new Employee("employee_level_2",10000);
		Employee e2 = new Employee("employee_level_1",3300);
		Intern intern = new Intern("intern_level_2",10);
		Manager CEO = new Manager("Seff",122 ,10);
		subManger.addSubordinate(firstEmpl);
		subManger.addSubordinate(intern);
		CEO.addSubordinate(subManger);
		CEO.addSubordinate(e2);
		RevenueVisitor visitorTypeRevenue= new RevenueVisitor();
		TreeVisitor visitorTypeTree = new TreeVisitor(visitorTypeRevenue);
		
		System.out.println(CEO.getSubordinates());
		
		CEO.accept(visitorTypeTree);
		
//		for ( Employee e : lEmp ) {
//			e.accept(v);
//		}
	
	}
}
