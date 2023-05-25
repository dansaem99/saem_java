package hr.java.com.my.hr;

import java.util.ArrayList;
import java.util.List;

import hr.java.com.my.hr.dao.LaborerDao;
import hr.java.com.my.hr.dao.LaborerDaoImpl;
import hr.java.com.my.hr.domain.Laborer;
import hr.java.com.my.hr.pressentation.Console;
import hr.java.com.my.hr.pressentation.LaborerIo;
import hr.java.com.my.hr.service.LaborerService;
import hr.java.com.my.hr.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<>();
		
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
		Console.info("end.");
	}
}
