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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CNacionalidad;

	@Column(name = "NNacionalidad", nullable = false, length = 30)
	private String NNacionalidad;

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CNacionalidad;
		result = prime * result + ((NNacionalidad == null) ? 0 : NNacionalidad.hashCode());
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
		Nacionalidad other = (Nacionalidad) obj;
		if (CNacionalidad != other.CNacionalidad)
			return false;
		if (NNacionalidad == null) {
			if (other.NNacionalidad != null)
				return false;
		} else if (!NNacionalidad.equals(other.NNacionalidad))
			return false;
		return true;
	}

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
