package hr.java.com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import hr.java.com.my.hr.domain.Laborer;

public interface LaborerDao {
	List<Laborer> selectLaborers();
	void insertLaborer(String laborerName, LocalDate hireDate);
	void updateLaborer(Laborer laborer);
	void deleteLaborer(int laborerId);
}
