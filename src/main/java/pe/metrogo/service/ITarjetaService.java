package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.Tarjeta;

public interface ITarjetaService {
	public void insertar(Tarjeta tarjeta);
	public List<Tarjeta> listar();
	public void eliminar(String CTarjeta);
}
