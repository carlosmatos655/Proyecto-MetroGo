package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.Recarga;

public interface IRecargaService {
	public void insertar(Recarga recarga);
	public List<Recarga> listar();
	public void eliminar(int CRecarga);
}
