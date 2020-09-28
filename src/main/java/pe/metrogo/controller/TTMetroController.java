package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.TTMetro;
import pe.metrogo.service.ITTMetroService;

@Named
@RequestScoped
public class TTMetroController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITTMetroService tService;
	private TTMetro ttmetro;
	List<TTMetro> listaTTMetros;
	
	@PostConstruct
	public void init() {
		this.listaTTMetros = new ArrayList<TTMetro>();
		this.ttmetro = new TTMetro();
		this.listar();
	}
	
	public String nuevoTTMetro() {
		this.setTtmetro(new TTMetro());
		return "ttmetro.xhtml";
	}
	
	public void insertar() {
		try {
			tService.insertar(ttmetro);
			limpiarTTMetro();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void listar() {
		try {
			listaTTMetros = tService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarTTMetro() {
		this.init();
	}
	
	public void eliminar(TTMetro tt) {
		try {
			tService.eliminar(tt.getCTTMetro());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}

	public TTMetro getTtmetro() {
		return ttmetro;
	}

	public void setTtmetro(TTMetro ttmetro) {
		this.ttmetro = ttmetro;
	}

	public List<TTMetro> getListaTTMetros() {
		return listaTTMetros;
	}

	public void setListaTTMetros(List<TTMetro> listaTTMetros) {
		this.listaTTMetros = listaTTMetros;
	}
	
}

