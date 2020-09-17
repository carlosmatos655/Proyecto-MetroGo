package pe.metrogo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mediodepago")

public class MedioDePago implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CMedio;
	
	@Column(name="NMedio", nullable=false, length=30)
	private String NMedio;

	public MedioDePago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedioDePago(int cMedio, String nMedio) {
		super();
		CMedio = cMedio;
		NMedio = nMedio;
	}

	public int getCMedio() {
		return CMedio;
	}

	public void setCMedio(int cMedio) {
		CMedio = cMedio;
	}

	public String getNMedio() {
		return NMedio;
	}

	public void setNMedio(String nMedio) {
		NMedio = nMedio;
	}
	

}
