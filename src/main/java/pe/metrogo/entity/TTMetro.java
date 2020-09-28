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
