import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	
	@Id
	private int regno;
	private String model;
	private String color;
	private int cost;
	@ManyToOne
	private Employee employee;
	
	
	public Vehicle(int regno, String model, String color, int cost) {
		super();
		this.regno = regno;
		this.model = model;
		this.color = color;
		this.cost = cost;
	}


	public Vehicle() {
		super();
	}


	public Vehicle(int regno, String model, String color, int cost, Employee employee) {
		super();
		this.regno = regno;
		this.model = model;
		this.color = color;
		this.cost = cost;
		this.employee = employee;
	}


	public int getRegno() {
		return regno;
	}


	public void setRegno(int regno) {
		this.regno = regno;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
