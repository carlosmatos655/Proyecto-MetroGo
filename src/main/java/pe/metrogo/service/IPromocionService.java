package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.Promocion;

public interface IPromocionService {
	public void insertar(Promocion promocion);
	public List<Promocion> listar();
	public void eliminar(int CPromocion);
}
