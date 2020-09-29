package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.Promocion;

public interface IPromocionDao {
	public void insertar(Promocion promocion);
	public List<Promocion> listar();
	public void eliminar(int CPromocion);
}
