package Com.Ems.Dao;

import java.util.List;

import Com.Ems.Model.Employe;

public interface EmployeDao {
	void save(Employe employe);
    List<Employe> getAll();
}
