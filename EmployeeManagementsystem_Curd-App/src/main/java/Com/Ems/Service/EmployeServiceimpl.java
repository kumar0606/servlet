package Com.Ems.Service;

import java.util.List;

import Com.Ems.Dao.EmployeDaoimpl;
import Com.Ems.Model.Employe;

public class EmployeServiceimpl implements EmployeService{
	private EmployeDaoimpl dao = new EmployeDaoimpl();
	public void save(Employe employe) {
	dao.save(employe);
		
	}

	public List<Employe> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
