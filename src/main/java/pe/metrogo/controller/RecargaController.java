package pe.metrogo.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.entity.Promocion;
import pe.metrogo.entity.Recarga;
import pe.metrogo.entity.TMetropolitano;
import pe.metrogo.entity.Tarjeta;
import pe.metrogo.service.IPromocionService;
import pe.metrogo.service.IRecargaService;
import pe.metrogo.service.ITMetropolitanoService;
import pe.metrogo.service.ITarjetaService;

@Named
@RequestScoped
public class RecargaController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRecargaService rService;
	
	@Inject
	private IPromocionService pService;
	
	@Inject
	private ITarjetaService tService;
	
	@Inject
	private ITMetropolitanoService mService;
	
	private Recarga recarga;
	private Promocion promocion;
	private Tarjeta tarjeta;
	private TMetropolitano tmetropolitano;
	
	List<Recarga> listaRecargas;
	List<Promocion> listaPromociones;
	List<Tarjeta> listaTarjetas;
	List<TMetropolitano> listaTMetropolitanos;
	
	@PostConstruct
	public void init() {
		this.listaRecargas = new ArrayList<Recarga>();
		this.listaPromociones = new ArrayList<Promocion>();
		this.listaTarjetas = new ArrayList<Tarjeta>();
		this.listaTMetropolitanos = new ArrayList<TMetropolitano>();
		this.recarga = new Recarga();
		this.promocion = new Promocion();
		this.tarjeta = new Tarjeta();
		this.tmetropolitano = new TMetropolitano();
		this.listar();
		this.listaPromociones();
		this.listaTarjetas();
		this.listaTMetropolitanos();
	}
	
	public String nuevoRecarga() {
		this.setRecarga(new Recarga());
		listaPromociones = pService.listar();
		listaTarjetas = tService.listar();
		listaTMetropolitanos = mService.listar();
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
	
	public void listaPromociones() {
		try {
			listaPromociones = pService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listaTarjetas() {
		try {
			listaTarjetas = tService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listaTMetropolitanos() {
		try {
			listaTMetropolitanos = mService.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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

	public Promocion getPromocion() {
		return promocion;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public TMetropolitano getTmetropolitano() {
		return tmetropolitano;
	}

	public void setTmetropolitano(TMetropolitano tmetropolitano) {
		this.tmetropolitano = tmetropolitano;
	}

	public List<Recarga> getListaRecargas() {
		return listaRecargas;
	}

	public void setListaRecargas(List<Recarga> listaRecargas) {
		this.listaRecargas = listaRecargas;
	}

	public List<Promocion> getListaPromociones() {
		return listaPromociones;
	}

	public void setListaPromociones(List<Promocion> listaPromociones) {
		this.listaPromociones = listaPromociones;
	}

	public List<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}

	public List<TMetropolitano> getListaTMetropolitanos() {
		return listaTMetropolitanos;
	}

	public void setListaTMetropolitanos(List<TMetropolitano> listaTMetropolitanos) {
		this.listaTMetropolitanos = listaTMetropolitanos;
	}
	
}
