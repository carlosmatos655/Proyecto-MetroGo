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
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CPromocion;
		result = prime * result + ((DFin == null) ? 0 : DFin.hashCode());
		result = prime * result + ((DInicio == null) ? 0 : DInicio.hashCode());
		result = prime * result + ((NPromocion == null) ? 0 : NPromocion.hashCode());
		result = prime * result + ((TDescipcion == null) ? 0 : TDescipcion.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promocion other = (Promocion) obj;
		if (CPromocion != other.CPromocion)
			return false;
		if (DFin == null) {
			if (other.DFin != null)
				return false;
		} else if (!DFin.equals(other.DFin))
			return false;
		if (DInicio == null) {
			if (other.DInicio != null)
				return false;
		} else if (!DInicio.equals(other.DInicio))
			return false;
		if (NPromocion == null) {
			if (other.NPromocion != null)
				return false;
		} else if (!NPromocion.equals(other.NPromocion))
			return false;
		if (TDescipcion == null) {
			if (other.TDescipcion != null)
				return false;
		} else if (!TDescipcion.equals(other.TDescipcion))
			return false;
		return true;
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
