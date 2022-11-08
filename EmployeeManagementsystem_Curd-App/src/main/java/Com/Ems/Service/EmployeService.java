package Com.Ems.Service;

import java.util.List;

import Com.Ems.Model.Employe;

public interface EmployeService {
	void save(Employe employe);
    List<Employe> getAll();
}
