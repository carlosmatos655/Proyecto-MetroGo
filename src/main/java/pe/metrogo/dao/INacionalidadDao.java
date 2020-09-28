package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.Nacionalidad;

public interface INacionalidadDao {
	public void insertar(Nacionalidad nacionalidad);
	public List<Nacionalidad> listar();
	public void eliminar(int CNacionalidad);	
}
