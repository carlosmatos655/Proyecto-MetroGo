package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.TMetropolitano;

public interface ITMetropolitanoDao {
	public void insertar(TMetropolitano tmetropolitano);
	public List<TMetropolitano> listar();
	public void eliminar(String CTarjetaMetro);	
}
