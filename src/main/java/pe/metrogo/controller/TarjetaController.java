package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.MedioDePago;
import pe.metrogo.entity.EntidadBancaria;
import pe.metrogo.entity.Tarjeta;
import pe.metrogo.service.IEntidadBancariaService;
import pe.metrogo.service.IMedioDePagoService;
import pe.metrogo.service.ITarjetaService;

@Named
@RequestScoped
public class TarjetaController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITarjetaService tService;
	
	@Inject
	private IMedioDePagoService mService;
	
	@Inject
	private IEntidadBancariaService eService;
	
	private Tarjeta tarjeta;
	List<Tarjeta> listaTarjetas;
	
	private EntidadBancaria entidad;
	List<EntidadBancaria> listaEntidades;
	
	private MedioDePago medio;
	List<MedioDePago> listaMedios;
	
	@PostConstruct
	public void init() {
		this.listaTarjetas = new ArrayList<Tarjeta>();
		this.tarjeta = new Tarjeta();
		this.listaEntidades = new ArrayList<EntidadBancaria>();
		this.entidad = new EntidadBancaria();
		this.listaMedios = new ArrayList<MedioDePago>();
		this.medio = new MedioDePago();
		this.listar();
		this.listaEntidades();
		this.listaMedios();
	}
	
	public String nuevoTarjeta() {
		this.setTarjeta(new Tarjeta());
		listaEntidades = eService.listar();
		listaMedios = mService.listar();
		return "tarjeta.xhtml";
	}
	
	public void insertar() {
		try {
			tService.insertar(tarjeta);
			limpiarTarjeta();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void listar() {
		try {
			listaTarjetas = tService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarTarjeta() {
		this.init();
	}

	public void listaEntidades() {
		try {
			listaEntidades = eService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listaMedios() {
		try {
			listaMedios = mService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void eliminar(Tarjeta ta) {
		try {
			tService.eliminar(ta.getCTarjeta());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}

	public EntidadBancaria getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadBancaria entidad) {
		this.entidad = entidad;
	}

	public List<EntidadBancaria> getListaEntidades() {
		return listaEntidades;
	}

	public void setListaEntidades(List<EntidadBancaria> listaEntidades) {
		this.listaEntidades = listaEntidades;
	}

	public MedioDePago getMedio() {
		return medio;
	}

	public void setMedio(MedioDePago medio) {
		this.medio = medio;
	}

	public List<MedioDePago> getListaMedios() {
		return listaMedios;
	}

	public void setListaMedios(List<MedioDePago> listaMedios) {
		this.listaMedios = listaMedios;
	}
	
	
}
