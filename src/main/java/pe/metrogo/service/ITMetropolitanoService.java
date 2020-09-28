package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.TMetropolitano;

public interface ITMetropolitanoService {
	public void insertar(TMetropolitano tmetropolitano);
	public List<TMetropolitano> listar();
	public void eliminar(String CTarjetaMetro);
}
