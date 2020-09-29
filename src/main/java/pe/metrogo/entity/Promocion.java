package pe.metrogo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "promocion")
public class Promocion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CPromocion;

	@Column(name = "NPromocion", nullable = false, length = 30)
	private String NPromocion;

	private Date DInicio;
	
	private Date DFin;
	
	@Column(name = "NDescripcion", nullable = false, length = 50)
	private String TDescipcion;

	public Promocion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Promocion(int cPromocion, String nPromocion, Date dInicio, Date dFin, String tDescipcion) {
		super();
		CPromocion = cPromocion;
		NPromocion = nPromocion;
		DInicio = dInicio;
		DFin = dFin;
		TDescipcion = tDescipcion;
	}

	public int getCPromocion() {
		return CPromocion;
	}

	public void setCPromocion(int cPromocion) {
		CPromocion = cPromocion;
	}

	public String getNPromocion() {
		return NPromocion;
	}

	public void setNPromocion(String nPromocion) {
		NPromocion = nPromocion;
	}

	public Date getDInicio() {
		return DInicio;
	}

	public void setDInicio(Date dInicio) {
		DInicio = dInicio;
	}

	public Date getDFin() {
		return DFin;
	}

	public void setDFin(Date dFin) {
		DFin = dFin;
	}

	public String getTDescipcion() {
		return TDescipcion;
	}

	public void setTDescipcion(String tDescipcion) {
		TDescipcion = tDescipcion;
	}
	
	
}
