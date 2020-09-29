package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.Promocion;
import pe.metrogo.service.IPromocionService;


@Named
@RequestScoped
public class PromocionController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPromocionService pService;
	private Promocion promocion;
	List<Promocion> listaPromociones;
	
	@PostConstruct
	public void init() {
		this.listaPromociones = new ArrayList<Promocion>();
		this.promocion = new Promocion();
		this.listar();
	}
	
	public String nuevoPromocion() {
		this.setPromocion(new Promocion());
		return "promocion.xhtml";
	}
	
	public void insertar() {
		try {
			pService.insertar(promocion);
			limpiarPromocion();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void listar() {
		try {
			listaPromociones = pService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarPromocion() {
		this.init();
	}
	
	public void eliminar(Promocion pr) {
		try {
			pService.eliminar(pr.getCPromocion());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}

	public Promocion getPromocion() {
		return promocion;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}

	public List<Promocion> getListaPromociones() {
		return listaPromociones;
	}

	public void setListaPromociones(List<Promocion> listaPromociones) {
		this.listaPromociones = listaPromociones;
	}
	
}
