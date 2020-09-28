package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.TTMetro;

public interface ITTMetroDao {
	public void insertar(TTMetro ttmetro);
	public List<TTMetro> listar();
	public void eliminar(int CTTMetro);	
}
