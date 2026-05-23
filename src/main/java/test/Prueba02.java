package test;

import java.util.List;

import dao.RolDAO;
import dao.RolDAOImpl;
import model.Rol;

public class Prueba02 {

	public static void main(String[] args) {
		
		RolDAO dao = new RolDAOImpl();
		List<Rol> list = dao.findAll();
		
		for(Rol r : list) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolname());
			System.out.println(r.getRolstatus());
		}
	}
	
}
