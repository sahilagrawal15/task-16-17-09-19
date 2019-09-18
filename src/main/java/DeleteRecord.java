import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteRecord {

	public static void main(String[] args) {

		Session session = Conn.getSF().openSession();

		System.out.println("Choose among the following for Deleting record");
		System.out.println("1) DELETE EMPLOYEE Record");
		System.out.println("2) DELETE Laptop Record");
		System.out.println("3) DELETE VEHICLE Record");
		System.out.println("4) DELETE PROJECT Record");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		switch (n) {
		
		case 1:
		{
			System.out.println("Enter emp no for deleting its record");
			int m=scan.nextInt();
			
			Employee emp = (Employee) session.get(Employee.class, m);
			Transaction tr=session.beginTransaction();
			session.delete(emp);
			tr.commit();
			session.close();
			System.out.println("Record Deleted");
			
			
			
		}
		case 2:
		{
			System.out.println("Enter Laptop no for deleting its record");
			int j=scan.nextInt();
			
			Laptop laptop = (Laptop) session.get(Laptop.class, j);
			Transaction tr=session.beginTransaction();
			session.delete(laptop);
			tr.commit();
			session.close();
			System.out.println("Record Deleted");
			
			
			
		}
		case 3:
		{
			System.out.println("Enter emp no for deleting its record");
			int k = scan.nextInt();
			Vehicle vehicle = (Vehicle) session.get(Vehicle.class, k);
			Transaction tr=session.beginTransaction();
			session.delete(vehicle);
			tr.commit();
			session.close();
			System.out.println("Record Deleted");
			
			
			
		}
		case 4:
		{
			System.out.println("Enter Project ID for deleting its record");
			int l = scan.nextInt();
			Project project = (Project) session.get(Project.class, l);
			Transaction tr=session.beginTransaction();
			session.delete(project);
			tr.commit();
			session.close();
			System.out.println("Record Deleted");
			
			
			
		}

		}
	}

}
