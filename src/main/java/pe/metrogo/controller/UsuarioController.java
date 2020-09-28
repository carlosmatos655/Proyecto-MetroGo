package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.Usuario;
import pe.metrogo.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioService uService;
	private Usuario usuario;
	List<Usuario> listaUsuarios;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.listar();
	}
	
	public String nuevoUsuario() {
		this.setUsuario(new Usuario());
		return "usuario.xhtml";
	}
	
	public void insertar() {
		try {
			uService.insertar(usuario);
			limpiarUsuario();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaUsuarios = uService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarUsuario() {
		this.init();
	}
	
	public void eliminar(Usuario us) {
		try {
			uService.eliminar(us.getCUsuario());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
}
