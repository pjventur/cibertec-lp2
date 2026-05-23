package dao;

import java.util.List;

import model.Rol;

public interface RolDAO {

	public void create(Rol rol);
	public void update(Rol rol);
	public void delete(int id);
	public Rol find(int id);
	public List<Rol> findAll();
	
}
