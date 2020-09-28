package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.Rol;

public interface IRolService {
	public void insertar(Rol rol);
	public List<Rol> listar();
	public void eliminar(int CRol);
}
