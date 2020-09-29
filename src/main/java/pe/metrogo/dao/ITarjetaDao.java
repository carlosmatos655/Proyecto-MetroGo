package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.Tarjeta;

public interface ITarjetaDao {
	public void insertar(Tarjeta tarjeta);
	public List<Tarjeta> listar();
	public void eliminar(String CTarjeta);	
}
