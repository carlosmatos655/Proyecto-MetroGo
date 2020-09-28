package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.Nacionalidad;
import pe.metrogo.service.INacionalidadService;

@Named
@RequestScoped
public class NacionalidadController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private INacionalidadService nService;
	private Nacionalidad nacionalidad;
	List<Nacionalidad> listaNacionalidades;
	
	@PostConstruct
	public void init() {
		this.listaNacionalidades = new ArrayList<Nacionalidad>();
		this.nacionalidad = new Nacionalidad();
		this.listar();
	}
	
	public String nuevoNacionalidad() {
		this.setNacionalidad(new Nacionalidad());
		return "nacionalidad.xhtml";
	}
	
	public void insertar() {
		try {
			nService.insertar(nacionalidad);
			limpiarNacionalidad();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void listar() {
		try {
			listaNacionalidades = nService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarNacionalidad() {
		this.init();
	}
	
	public void eliminar(Nacionalidad na) {
		try {
			nService.eliminar(na.getCNacionalidad());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<Nacionalidad> getListaNacionalidades() {
		return listaNacionalidades;
	}

	public void setListaNacionalidades(List<Nacionalidad> listaNacionalidades) {
		this.listaNacionalidades = listaNacionalidades;
	}
	
}
