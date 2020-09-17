package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.EntidadBancaria;
import pe.metrogo.service.IEntidadBancariaService;

@Named
@RequestScoped
public class EntidadBancariaController implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
	@Inject
	private IEntidadBancariaService eService;
	private EntidadBancaria entidadbancaria;
	List<EntidadBancaria> listaEntidades;
	
	@PostConstruct
	public void init() {
		this.listaEntidades = new ArrayList<EntidadBancaria>();
		this.entidadbancaria = new EntidadBancaria();
		this.listar();
	}
	
	public String nuevoEntidadBancaria() {
		this.setEntidad(new EntidadBancaria());
		return "entidadbancaria.xhtml";
	}
	
	public void insertar() {
		try {
			eService.insertar(entidadbancaria);
			limpiarEntidad();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaEntidades = eService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarEntidad() {
		this.init();
	}
	
	public void eliminar(EntidadBancaria eb) {
		try {
			eService.eliminar(eb.getCEntidad());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	
	
	public EntidadBancaria getEntidad() {
		return entidadbancaria;
	}
	
	public void setEntidad(EntidadBancaria entidadbancaria) {
		this.entidadbancaria = entidadbancaria;
	}
	
	public List<EntidadBancaria> getListaEntidades() {
		return listaEntidades;
	}
	
	public void setListaEntidades(List<EntidadBancaria> listaEntidades) {
		this.listaEntidades = listaEntidades;
	}

	
}
