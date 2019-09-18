import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int eno;
	private String ename;
	private int salary;
	
	@OneToOne(mappedBy = "employee")
	private Laptop laptop;
	
	@OneToMany(mappedBy = "employee")
	private List<Vehicle> vehicle=new ArrayList<Vehicle>();
	
	@ManyToMany
	private List<Project> project=new ArrayList<Project>();
	
	
	public Employee(int eno, String ename, int salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	
	public Employee(int eno, String ename, int salary, Laptop laptop) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.laptop = laptop;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Employee(int eno, String ename, int salary, Laptop laptop, List<Vehicle> vehicle, List<Project> project) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.laptop = laptop;
		this.vehicle = vehicle;
		this.project = project;
	}

	public Employee(int eno) {
		super();
		this.eno = eno;
	}

		
	
}
