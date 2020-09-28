package pe.metrogo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CRol;

	@Column(name = "NRol", nullable = false, length = 30)
	private String NRol;

	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rol(int cRol, String nRol) {
		super();
		CRol = cRol;
		NRol = nRol;
	}

	public int getCRol() {
		return CRol;
	}

	public void setCRol(int cRol) {
		CRol = cRol;
	}

	public String getNRol() {
		return NRol;
	}

	public void setNRol(String nRol) {
		NRol = nRol;
	}
}
