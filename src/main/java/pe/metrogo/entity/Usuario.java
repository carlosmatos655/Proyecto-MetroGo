package pe.metrogo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CDNI;
	
	@Column(name="NNombreyApellido", nullable=false, length=30)
	private String NNombreyApellido;
	
	@Column(name="TCorreo", nullable=false, length=30)
	private String TCorreo;
	
	@Column(name="CContraseña", nullable=false, length=10)
	private String CContraseña;
	
	private Date FRegistro;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int cDNI, String nNombreyApellido, String tCorreo, String cContraseña, Date fRegistro) {
		super();
		CDNI = cDNI;
		NNombreyApellido = nNombreyApellido;
		TCorreo = tCorreo;
		CContraseña = cContraseña;
		FRegistro = fRegistro;
	}

	public int getCDNI() {
		return CDNI;
	}

	public void setCDNI(int cDNI) {
		CDNI = cDNI;
	}

	public String getNNombreyApellido() {
		return NNombreyApellido;
	}

	public void setNNombreyApellido(String nNombreyApellido) {
		NNombreyApellido = nNombreyApellido;
	}

	public String getTCorreo() {
		return TCorreo;
	}

	public void setTCorreo(String tCorreo) {
		TCorreo = tCorreo;
	}

	public String getCContraseña() {
		return CContraseña;
	}

	public void setCContraseña(String cContraseña) {
		CContraseña = cContraseña;
	}

	public Date getFRegistro() {
		return FRegistro;
	}

	public void setFRegistro(Date fRegistro) {
		FRegistro = fRegistro;
	}
	
	
	
}
