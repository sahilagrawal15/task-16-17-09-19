import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Conn {
	
	public static SessionFactory getSF()
	{
		Configuration config=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Project.class).addAnnotatedClass(Vehicle.class);
		SessionFactory sf=config.buildSessionFactory();
		return sf;
	}

}
