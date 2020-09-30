package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.TMetropolitano;
import pe.metrogo.entity.TTMetro;
import pe.metrogo.entity.Usuario;
import pe.metrogo.service.ITMetropolitanoService;
import pe.metrogo.service.ITTMetroService;
import pe.metrogo.service.IUsuarioService;

@Named
@RequestScoped
public class TMetropolitanoController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITTMetroService ttService;
	
	@Inject
	private ITMetropolitanoService tmService;
	
	@Inject
	private IUsuarioService uService;
	
	private TTMetro ttmetro;
	private TMetropolitano tmetropolitano;
	private Usuario usuario;
	
	List<TMetropolitano> listaTMetropolitanos;
	List<TTMetro> listaTTMetros;
	List<Usuario> listaUsuarios;
	
	@PostConstruct
	public void init() {
		this.listaTTMetros = new ArrayList<TTMetro>();
		this.listaTMetropolitanos = new ArrayList<TMetropolitano>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.ttmetro = new TTMetro();
		this.tmetropolitano = new TMetropolitano();
		this.usuario = new Usuario();
		this.listar();
		this.listTTMetro();
		this.listUsuario();
	}
	
	public String nuevoTMetropolitano() {
		this.setTmetropolitano(new TMetropolitano());
		return "tmetropolitano.xhtml";
	}
	
	public void insertar() {
		try {
			tmService.insertar(tmetropolitano);
			this.limpiarTMetropolitano();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void listar() {
		try {
			listaTMetropolitanos = tmService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarTMetropolitano() {
		this.init();
	}
	
	public void listTTMetro() {
		try {
			listaTTMetros = ttService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listUsuario() {
		try {
			listaUsuarios = uService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void eliminar(TMetropolitano t) {
		try {
			tmService.eliminar(t.getCTarjetaMetro());
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

	public TMetropolitano getTmetropolitano() {
		return tmetropolitano;
	}

	public void setTmetropolitano(TMetropolitano tmetropolitano) {
		this.tmetropolitano = tmetropolitano;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<TMetropolitano> getListaTMetropolitanos() {
		return listaTMetropolitanos;
	}

	public void setListaTMetropolitanos(List<TMetropolitano> listaTMetropolitanos) {
		this.listaTMetropolitanos = listaTMetropolitanos;
	}

	public List<TTMetro> getListaTTMetros() {
		return listaTTMetros;
	}

	public void setListaTTMetros(List<TTMetro> listaTTMetros) {
		this.listaTTMetros = listaTTMetros;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
}