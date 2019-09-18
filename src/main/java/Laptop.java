import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	private int lcode;
	private String brand;
	private int price;
	@OneToOne
	private Employee employee;
	
	
	public Laptop(int lcode, String brand, int price) {
		super();
		this.lcode = lcode;
		this.brand = brand;
		this.price = price;
	}


	public Laptop() {
		super();
	}


	public Laptop(int lcode, String brand, int price, Employee employee) {
		super();
		this.lcode = lcode;
		this.brand = brand;
		this.price = price;
		this.employee = employee;
	}


	public int getLcode() {
		return lcode;
	}


	public void setLcode(int lcode) {
		this.lcode = lcode;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
