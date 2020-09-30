package pe.metrogo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tarjeta")
public class Tarjeta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CTarjeta", nullable = false, length = 16)
	private String CTarjeta;

	@Column(name = "NTitular", nullable = false, length = 30)
	private String NTitular;

	@ManyToOne
	@JoinColumn(name = "CMedio", nullable = false)
	private MedioDePago medio;
	
	@ManyToOne
	@JoinColumn(name = "CEntidad", nullable = false)
	private EntidadBancaria entidad;

	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tarjeta(String cTarjeta, String nTitular, MedioDePago medio, EntidadBancaria entidad) {
		super();
		CTarjeta = cTarjeta;
		NTitular = nTitular;
		this.medio = medio;
		this.entidad = entidad;
	}

	public String getCTarjeta() {
		return CTarjeta;
	}

	public void setCTarjeta(String cTarjeta) {
		CTarjeta = cTarjeta;
	}

	public String getNTitular() {
		return NTitular;
	}

	public void setNTitular(String nNacionalidad) {
		NTitular = nNacionalidad;
	}

	public MedioDePago getMedio() {
		return medio;
	}

	public void setMedio(MedioDePago medio) {
		this.medio = medio;
	}

	public EntidadBancaria getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadBancaria entidad) {
		this.entidad = entidad;
	}
}
