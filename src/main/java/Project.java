import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int pid;
	private String pname;
	private String topic;
	@ManyToMany
	private List<Employee> employee=new ArrayList<Employee>();
	
	
	public Project(int pid, String pname, String topic) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.topic = topic;
	}


	public Project() {
		super();
	}


	


	public Project(int pid, String pname, String topic, List<Employee> employee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.topic = topic;
		this.employee = employee;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public List<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}


	

}
