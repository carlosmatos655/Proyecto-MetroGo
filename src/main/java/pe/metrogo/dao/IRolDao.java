package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.Rol;

public interface IRolDao {
	public void insertar(Rol rol);
	public List<Rol> listar();
	public void eliminar(int CRol);	
}
