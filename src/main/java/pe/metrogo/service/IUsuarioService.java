package pe.metrogo.service;

import java.util.List;

import pe.metrogo.entity.Usuario;

public interface IUsuarioService {
	public void insertar(Usuario usuario);
	public List<Usuario> listar();
	public void eliminar(int CUsuario);
}
