package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import model.Rol;

public class RolDAOImpl implements RolDAO {
	
	EntityManager em;
	EntityManagerFactory fabric;
	
	public RolDAOImpl() {
		fabric = Persistence.createEntityManagerFactory("cibertecjpa");
		em = fabric.createEntityManager();
	}

	@Override
	public void create(Rol rol) {
		try {
			em.getTransaction().begin();
			em.persist(rol);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(Rol rol) {
		em.getTransaction().begin();
		em.merge(rol);
		em.getTransaction().commit();
	}

	@Override
	public void delete(int id) {
		em.getTransaction().begin();
		em.remove(id);
		em.getTransaction().commit();
	}

	@Override
	public Rol find(int id) {
		return em.find(Rol.class, id);
	}

	@Override
	public List<Rol> findAll() {
		Query query = em.createNamedQuery("Rol.findAll");
		List<Rol> list;
		try {
			list = query.getResultList();
		} catch (Exception e) {
			list = null;
		}
		return list;
	}

	
	
}
