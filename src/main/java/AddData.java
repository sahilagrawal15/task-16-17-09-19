
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddData {

	public static void main(String[] args) {

		Session session = Conn.getSF().openSession();

		System.out.println("Choose among the following for adding record");
		System.out.println("1) ADD EMPLOYEE");
		System.out.println("2) ADD Laptop");
		System.out.println("3) ADD VEHICLE");
		System.out.println("4) ADD PROJECT");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		switch (n) {

		case 1: {
			Employee employee1 = new Employee(101, "Raj", 30000);
			Employee employee2 = new Employee(102, "Amit", 40000);
			Employee employee3 = new Employee(103, "Keshav", 20000);

			Transaction tr = session.beginTransaction();

			session.save(employee1);
			session.save(employee2);
			session.save(employee3);

			tr.commit();
			session.close();
			System.out.println("Employee record added");
			break;

		}
		case 2: {
			Laptop laptop1 = new Laptop(1001, "Lenovo", 45000);
			Laptop laptop2 = new Laptop(1002, "Dell", 55000);
			Laptop laptop3 = new Laptop(1003, "Hp", 35000);

			Transaction tr = session.beginTransaction();

			session.save(laptop1);
			session.save(laptop2);
			session.save(laptop3);

			tr.commit();
			session.close();

			System.out.println("Laptop record added");
			break;

		}
		case 3: {

			Vehicle vehicle1 = new Vehicle(1111, "Verna", "Grey", 1500000);
			Vehicle vehicle2 = new Vehicle(1112, "Ritz", "White", 800000);

			Transaction tr = session.beginTransaction();

			session.save(vehicle1);
			session.save(vehicle2);

			tr.commit();
			session.close();

			System.out.println("Vehicle record added");
			break;

		}
		case 4: {
			Project project1 = new Project(001, "Automation", "ML");
			Project project2 = new Project(002, "Robot", "AI");
			Project project3 = new Project(003, "Book Entry", "Java");
			Project project4 = new Project(004, "Manual", "Testing");

			Transaction tr = session.beginTransaction();

			session.save(project1);
			session.save(project2);
			session.save(project3);
			session.save(project4);

			tr.commit();
			session.close();

			System.out.println("Project record added");
			break;

		}

		}

	}

}
