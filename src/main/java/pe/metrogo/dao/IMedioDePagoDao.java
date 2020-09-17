package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.MedioDePago;

public interface IMedioDePagoDao {
	public void insertar(MedioDePago medio);
	public List<MedioDePago> listar();
	public void eliminar(int CMedio);
}
