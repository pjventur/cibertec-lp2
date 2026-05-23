package test;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import model.Rol;

public class Prueba01 {

	public static void main(String[] args) {
		EntityManagerFactory fabric = 
				Persistence.createEntityManagerFactory("cibertecjpa");
		EntityManager em = fabric.createEntityManager();
		
		Query query = em.createNamedQuery("Rol.findAll");
		List<Rol> list = (List<Rol>) query.getResultList();
		
		for(Rol r : list) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolname());
			System.out.println(r.getRolstatus());
		}
	}

}
