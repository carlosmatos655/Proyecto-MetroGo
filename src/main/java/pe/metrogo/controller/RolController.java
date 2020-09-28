package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.Rol;
import pe.metrogo.service.IRolService;

@Named
@RequestScoped
public class RolController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRolService rService;
	private Rol rol;
	List<Rol> listaRoles;
	
	@PostConstruct
	public void init() {
		this.listaRoles = new ArrayList<Rol>();
		this.rol = new Rol();
		this.listar();
	}
	
	public String nuevoRol() {
		this.setRol(new Rol());
		return "rol.xhtml";
	}
	
	public void insertar() {
		try {
			rService.insertar(rol);
			limpiarRol();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void listar() {
		try {
			listaRoles = rService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarRol() {
		this.init();
	}
	
	public void eliminar(Rol ro) {
		try {
			rService.eliminar(ro.getCRol());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Rol> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Rol> listaRoles) {
		this.listaRoles = listaRoles;
	}
	
}
