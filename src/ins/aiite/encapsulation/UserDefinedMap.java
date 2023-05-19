package ins.aiite.encapsulation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setName("ABC");
		e1.setEmpId("E1");
		e1.setPhno(1111111111L);
		
		Employee e2=new Employee();
		e2.setName("XYZ");
		e2.setEmpId("E2");
		e2.setPhno(2222222222L);
		
		Employee e3=new Employee();
		e3.setName("PQR");
		e3.setEmpId("E3");
		e3.setPhno(3333333333L);
		
		Map<Integer,Employee> map=new HashMap<>();
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		
		
		Set<Entry<Integer, Employee>> employees = map.entrySet();
		for (Entry<Integer, Employee> employee : employees) {
			System.out.println(employee.getKey());
			System.out.println(employee.getValue().getName());
			System.out.println(employee.getValue().getEmpId());
			System.out.println(employee.getValue().getPhno());
			
			
		}
		

	}

}
