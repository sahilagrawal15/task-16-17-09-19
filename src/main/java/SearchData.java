import java.util.Scanner;

import org.hibernate.Session;

public class SearchData {

	public static void main(String[] args) {

		Session session = Conn.getSF().openSession();

		System.out.println("Choose among the following for searching record");
		System.out.println("1) SEARCH EMPLOYEE");
		System.out.println("2) SEARCH Laptop");
		System.out.println("3) SEARCH VEHICLE");
		System.out.println("4) SEARCH PROJECT");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		switch (n) {

		case 1: {
			System.out.println("Enter Employee ID for searching it:");
			int i = scan.nextInt();
			Employee emp = (Employee) session.get(Employee.class, i);

			System.out.println(emp.getEno());
			System.out.println(emp.getEname());
			System.out.println(emp.getSalary());
			break;
		}
		case 2: {
			System.out.println("Enter Laptop code for searching it:");
			int j = scan.nextInt();
			Laptop laptop = (Laptop) session.get(Laptop.class, j);

			System.out.println(laptop.getLcode());
			System.out.println(laptop.getBrand());
			System.out.println(laptop.getPrice());
			break;
		}
		case 3: {
			System.out.println("Enter Vehicle Reg no for searching it:");
			int k = scan.nextInt();
			Vehicle vehicle = (Vehicle) session.get(Vehicle.class, k);

			System.out.println(vehicle.getRegno());
			System.out.println(vehicle.getModel());
			System.out.println(vehicle.getColor());
			System.out.println(vehicle.getCost());
			break;
		}
		case 4: {
			System.out.println("Enter Projcect ID for searching it:");
			int l = scan.nextInt();
			Project project = (Project) session.get(Project.class, l);

			System.out.println(project.getPid());
			System.out.println(project.getPname());
			System.out.println(project.getTopic());
			break;
		}

		}

	}

}
