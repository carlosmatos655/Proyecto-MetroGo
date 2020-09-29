package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.Nacionalidad;
import pe.metrogo.entity.Usuario;
import pe.metrogo.service.INacionalidadService;
import pe.metrogo.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private INacionalidadService nService;
	
	private Usuario usuario;
	private Nacionalidad nacionalidad;
	
	List<Usuario> listaUsuarios;
	List<Nacionalidad> listaNacionalidades;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaNacionalidades = new ArrayList<Nacionalidad>();
		this.usuario = new Usuario();
		this.nacionalidad = new Nacionalidad();
		this.listar();
		this.listaNacionalidades();
	}
	
	public String nuevoUsuario() {
		this.setUsuario(new Usuario());
		listaNacionalidades = nService.listar();
		return "usuario.xhtml";
	}
	
	public void insertar() {
		try {
			uService.insertar(usuario);
			this.limpiarUsuario();
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
	
	public void listaNacionalidades() {
		try {
			listaNacionalidades = nService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void findByNameUsuario() {
		try {
			if (usuario.getNNombreyApellido().isEmpty()) {
				this.listar();
			} else {
				listaUsuarios = this.uService.findByNameUsuario(this.getUsuario());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
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
	
	public List<Nacionalidad> getListaNacionalidades() {
		return listaNacionalidades;
	}

	public void setListaNacionalidades(List<Nacionalidad> listaNacionalidades) {
		this.listaNacionalidades = listaNacionalidades;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}
