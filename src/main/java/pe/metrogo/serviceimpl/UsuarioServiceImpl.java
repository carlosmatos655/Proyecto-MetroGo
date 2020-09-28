package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.IUsuarioDao;
import pe.metrogo.entity.Usuario;
import pe.metrogo.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioServiceImpl implements IUsuarioService, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioDao uD;

	@Override
	public void insertar(Usuario usuario) {
		uD.insertar(usuario);		
	}

	@Override
	public List<Usuario> listar() {
		return uD.listar();
	}

	@Override
	public void eliminar(int CUsuario) {
		uD.eliminar(CUsuario);		
	}
}
