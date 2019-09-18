import java.util.List;

import org.hibernate.Session;

public class DiaplayAll {

	public static void main(String[] args) {

		Session session=Conn.getSF().openSession();
		
		List<Employee> employees = (List<Employee>) session.createQuery("from Employee").list();
	       System.out.println(employees.size());
	            for (Employee employee : employees) {
	                System.out.println(employee.getEno() + " - " + employee.getEname() + " - " + employee.getSalary());
	                System.out.println(employee);
	}

}
}