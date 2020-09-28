package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.Nacionalidad;

public interface INacionalidadService {
	public void insertar(Nacionalidad nacionalidad);
	public List<Nacionalidad> listar();
	public void eliminar(int CNacionalidad);
}
