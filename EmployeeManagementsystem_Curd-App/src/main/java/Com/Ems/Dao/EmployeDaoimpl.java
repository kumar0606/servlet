package Com.Ems.Dao;

import java.util.ArrayList;
import java.util.List;

import Com.Ems.Model.Employe;

public class EmployeDaoimpl implements EmployeDao {

	private static List<Employe> employes=new ArrayList<Employe>();
	static {
		employes.add(new Employe(101, "ravi", 20000.00, "ravi@gmail.com"));
		employes.add(new Employe(102, "kumar", 30000.00, "kumar@gmail.com"));
		employes.add(new Employe(103, "pawan", 40000.00, "pawan@gmail.com"));
		employes.add(new Employe(104, "satya", 50000.00, "satya@gmail.com"));
		employes.add(new Employe(105, "mahesh", 60000.00, "mahesh@gmail.com"));
		
	}
	public void save(Employe employe) {
		employes.add(employe);
		
	}

	public List<Employe> getAll() {
		// TODO Auto-generated method stub
		return employes;
	}

}
