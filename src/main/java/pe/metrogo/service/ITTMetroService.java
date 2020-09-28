package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.TTMetro;

public interface ITTMetroService {
	public void insertar(TTMetro ttmetro);
	public List<TTMetro> listar();
	public void eliminar(int CTTMetro);
}
