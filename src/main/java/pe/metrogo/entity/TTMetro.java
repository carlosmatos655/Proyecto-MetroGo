package pe.metrogo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipotarjetametropolitano")
public class TTMetro implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CTTMetro;

	@Column(name = "NNacionalidad", nullable = false, length = 30)
	private String NTTMetro;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CTTMetro;
		result = prime * result + ((NTTMetro == null) ? 0 : NTTMetro.hashCode());
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
		TTMetro other = (TTMetro) obj;
		if (CTTMetro != other.CTTMetro)
			return false;
		if (NTTMetro == null) {
			if (other.NTTMetro != null)
				return false;
		} else if (!NTTMetro.equals(other.NTTMetro))
			return false;
		return true;
	}

	public TTMetro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TTMetro(int cTTMetro, String nTTMetro) {
		super();
		CTTMetro = cTTMetro;
		NTTMetro = nTTMetro;
	}

	public int getCTTMetro() {
		return CTTMetro;
	}

	public void setCTTMetro(int cTTMetro) {
		CTTMetro = cTTMetro;
	}

	public String getNTTMetro() {
		return NTTMetro;
	}

	public void setNTTMetro(String nTTMetro) {
		NTTMetro = nTTMetro;
	}
}
