package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.Recarga;

public interface IRecargaDao {
	public void insertar(Recarga recarga);
	public List<Recarga> listar();
	public void eliminar(int CRecarga);
}
