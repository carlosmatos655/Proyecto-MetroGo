package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.MedioDePago;
import pe.metrogo.service.IMedioDePagoService;

@Named
@RequestScoped
public class MedioDePagoController implements Serializable {
		
	private static final long serialVersionUID = 1L;
		
	@Inject
	private IMedioDePagoService mService;
	private MedioDePago mediodepago;
	List<MedioDePago> listaMedios;
	
	@PostConstruct
	public void init() {
		this.listaMedios = new ArrayList<MedioDePago>();
		this.mediodepago = new MedioDePago();
		this.listar();
	}
	
	public String nuevoMedioDePago() {
		this.setMedio(new MedioDePago());
		return "mediodepago.xhtml";
	}
	
	public void insertar() {
		try {
			mService.insertar(mediodepago);
			limpiarMedio();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaMedios = mService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarMedio() {
		this.init();
	}
	
	public void eliminar(MedioDePago me) {
		try {
			mService.eliminar(me.getCMedio());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	

	public MedioDePago getMedio() {
		return mediodepago;
	}

	public void setMedio(MedioDePago mediodepago) {
		this.mediodepago = mediodepago;
	}

	public List<MedioDePago> getListaMedios() {
		return listaMedios;
	}

	public void setListaMedios(List<MedioDePago> listaMedios) {
		this.listaMedios = listaMedios;
	}

		
}
