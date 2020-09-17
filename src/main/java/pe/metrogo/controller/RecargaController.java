package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.Recarga;
import pe.metrogo.service.IRecargaService;

@Named
@RequestScoped
public class RecargaController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRecargaService rService;
	private Recarga recarga;
	List<Recarga> listaRecargas;
	
	@PostConstruct
	public void init() {
		this.listaRecargas = new ArrayList<Recarga>();
		this.recarga = new Recarga();
		this.listar();
	}
	
	public String nuevoRecarga() {
		this.setRecarga(new Recarga());
		return "recarga.xhtml";
	}
	
	public void insertar() {
		try {
			rService.insertar(recarga);
			limpiarRecarga();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaRecargas = rService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarRecarga() {
		this.init();
	}
	
	public void eliminar(Recarga re) {
		try {
			rService.eliminar(re.getCRecarga());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	

	public Recarga getRecarga() {
		return recarga;
	}

	public void setRecarga(Recarga recarga) {
		this.recarga = recarga;
	}

	public List<Recarga> getListaRecargas() {
		return listaRecargas;
	}

	public void setListaRecargas(List<Recarga> listaRecargas) {
		this.listaRecargas = listaRecargas;
	}

	
}
