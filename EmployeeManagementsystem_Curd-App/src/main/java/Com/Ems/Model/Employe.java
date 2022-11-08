package Com.Ems.Model;

public class Employe {
private int id;
private String name;
private double salary;
private String email;
 
public Employe (){	
}

public Employe(int id, String name, double salary, String email) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.email = email;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
}

}
