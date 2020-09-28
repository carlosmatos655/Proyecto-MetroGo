package pe.metrogo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nacionalidad")
public class Nacionalidad implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CNacionalidad;

	@Column(name = "NNacionalidad", nullable = false, length = 30)
	private String NNacionalidad;

	
	public Nacionalidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nacionalidad(int cNacionalidad, String nNacionalidad) {
		super();
		CNacionalidad = cNacionalidad;
		NNacionalidad = nNacionalidad;
	}

	public int getCNacionalidad() {
		return CNacionalidad;
	}

	public void setCNacionalidad(int cNacionalidad) {
		CNacionalidad = cNacionalidad;
	}

	public String getNNacionalidad() {
		return NNacionalidad;
	}

	public void setNNacionalidad(String nNacionalidad) {
		NNacionalidad = nNacionalidad;
	}
	
	
}
