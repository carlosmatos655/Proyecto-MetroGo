package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.EntidadBancaria;

public interface IEntidadBancariaDao {
	public void insertar(EntidadBancaria entidad);
	public List<EntidadBancaria> listar();
	public void eliminar(int CEntidad);	
}
