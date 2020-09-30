package pe.metrogo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recarga")

public class Recarga implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CRecarga;
	
	private double MMonto;
	
	private Date DFecha;

	@ManyToOne
	@JoinColumn(name = "CTarjetaMetro", nullable = false)
	private TMetropolitano tmetropolitano;

	@ManyToOne
	@JoinColumn(name = "CPromocion", nullable = false)
	private Promocion promocion;
	
	@ManyToOne
	@JoinColumn(name = "CTarjeta", nullable = false)
	private Tarjeta tarjeta;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CRecarga;
		result = prime * result + ((DFecha == null) ? 0 : DFecha.hashCode());
		long temp;
		temp = Double.doubleToLongBits(MMonto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((promocion == null) ? 0 : promocion.hashCode());
		result = prime * result + ((tarjeta == null) ? 0 : tarjeta.hashCode());
		result = prime * result + ((tmetropolitano == null) ? 0 : tmetropolitano.hashCode());
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
		Recarga other = (Recarga) obj;
		if (CRecarga != other.CRecarga)
			return false;
		if (DFecha == null) {
			if (other.DFecha != null)
				return false;
		} else if (!DFecha.equals(other.DFecha))
			return false;
		if (Double.doubleToLongBits(MMonto) != Double.doubleToLongBits(other.MMonto))
			return false;
		if (promocion == null) {
			if (other.promocion != null)
				return false;
		} else if (!promocion.equals(other.promocion))
			return false;
		if (tarjeta == null) {
			if (other.tarjeta != null)
				return false;
		} else if (!tarjeta.equals(other.tarjeta))
			return false;
		if (tmetropolitano == null) {
			if (other.tmetropolitano != null)
				return false;
		} else if (!tmetropolitano.equals(other.tmetropolitano))
			return false;
		return true;
	}

	public Recarga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recarga(int cRecarga, double mMonto, Date dFecha, TMetropolitano tmetropolitano, Promocion promocion,
			Tarjeta tarjeta) {
		super();
		CRecarga = cRecarga;
		MMonto = mMonto;
		DFecha = dFecha;
		this.tmetropolitano = tmetropolitano;
		this.promocion = promocion;
		this.tarjeta = tarjeta;
	}

	public int getCRecarga() {
		return CRecarga;
	}

	public void setCRecarga(int cRecarga) {
		CRecarga = cRecarga;
	}

	public double getMMonto() {
		return MMonto;
	}

	public void setMMonto(double mMonto) {
		MMonto = mMonto;
	}

	public Date getDFecha() {
		return DFecha;
	}

	public void setDFecha(Date dFecha) {
		DFecha = dFecha;
	}

	public TMetropolitano getTmetropolitano() {
		return tmetropolitano;
	}

	public void setTmetropolitano(TMetropolitano tmetropolitano) {
		this.tmetropolitano = tmetropolitano;
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
	
}
