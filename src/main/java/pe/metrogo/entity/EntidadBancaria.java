package pe.metrogo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entidadbancaria")
public class EntidadBancaria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CEntidad;
	
	@Column(name="NEntidad", nullable=false, length=30)
	private String NEntidad;

	public EntidadBancaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntidadBancaria(int cEntidad, String nEntidad) {
		super();
		CEntidad = cEntidad;
		NEntidad = nEntidad;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CEntidad;
		result = prime * result + ((NEntidad == null) ? 0 : NEntidad.hashCode());
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
		EntidadBancaria other = (EntidadBancaria) obj;
		if (CEntidad != other.CEntidad)
			return false;
		if (NEntidad == null) {
			if (other.NEntidad != null)
				return false;
		} else if (!NEntidad.equals(other.NEntidad))
			return false;
		return true;
	}

	public int getCEntidad() {
		return CEntidad;
	}

	public void setCEntidad(int cEntidad) {
		CEntidad = cEntidad;
	}

	public String getNEntidad() {
		return NEntidad;
	}

	public void setNEntidad(String nEntidad) {
		NEntidad = nEntidad;
	}
	
}
