package pe.metrogo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recarga")

public class Recarga implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CRecarga;
	
	private double MMonto;

	public Recarga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recarga(int cRecarga, double mMonto) {
		super();
		CRecarga = cRecarga;
		MMonto = mMonto;
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
	
	
}
