package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.MedioDePago;

public interface IMedioDePagoService {
	public void insertar(MedioDePago medio);
	public List<MedioDePago> listar();
	public void eliminar(int CMedio);
}
