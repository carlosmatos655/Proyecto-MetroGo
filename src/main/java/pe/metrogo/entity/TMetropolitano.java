package pe.metrogo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tmetropolitano")
public class TMetropolitano implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String CTarjetaMetro;

	private Date DVencimiento;
	
	@ManyToOne
	@JoinColumn(name = "CTTMetro", nullable = false)
	private TTMetro ttmetro;
	
	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario usuario;

	public TMetropolitano() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TMetropolitano(String cTarjetaMetro, Date dVencimiento, TTMetro ttmetro, Usuario usuario) {
		super();
		CTarjetaMetro = cTarjetaMetro;
		DVencimiento = dVencimiento;
		this.ttmetro = ttmetro;
		this.usuario = usuario;
	}

	public String getCTarjetaMetro() {
		return CTarjetaMetro;
	}

	public void setCTarjetaMetro(String cTarjetaMetro) {
		CTarjetaMetro = cTarjetaMetro;
	}

	public Date getDVencimiento() {
		return DVencimiento;
	}

	public void setDVencimiento(Date dVencimiento) {
		DVencimiento = dVencimiento;
	}

	public TTMetro getTtmetro() {
		return ttmetro;
	}

	public void setTtmetro(TTMetro ttmetro) {
		this.ttmetro = ttmetro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
