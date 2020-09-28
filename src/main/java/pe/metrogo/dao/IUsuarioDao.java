package pe.metrogo.dao;

import java.util.List;
import pe.metrogo.entity.Usuario;

public interface IUsuarioDao {
	public void insertar(Usuario usuario);
	public List<Usuario> listar();
	public void eliminar(int CUsuario);
}
