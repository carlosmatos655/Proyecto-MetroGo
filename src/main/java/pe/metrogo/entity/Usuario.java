package pe.metrogo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CUsuario;
	
	@Column(name="NNombreyApellido", nullable=false, length=30)
	private String NNombreyApellido;
	
	@Column(name="TCorreo", nullable=false, length=30)
	private String TCorreo;
	
	@Column(name="CContrase�a", nullable=false, length=10)
	private String CContrase�a;
	
	private Date FNacimiento;
	
	@ManyToOne
	@JoinColumn(name = "CNacionalidad", nullable = false)
	private Nacionalidad nacionalidad;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int cUsuario, String nNombreyApellido, String tCorreo, String cContrase�a, Date fNacimiento, Nacionalidad nacionalidad) {
		super();
		CUsuario = cUsuario;
		NNombreyApellido = nNombreyApellido;
		TCorreo = tCorreo;
		CContrase�a = cContrase�a;
		FNacimiento = fNacimiento;
		this.nacionalidad = nacionalidad;
	}

	public int getCUsuario() {
		return CUsuario;
	}

	public void setCUsuario(int cUsuario) {
		CUsuario = cUsuario;
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

	public String getCContrase�a() {
		return CContrase�a;
	}

	public void setCContrase�a(String cContrase�a) {
		CContrase�a = cContrase�a;
	}

	public Date getFNacimiento() {
		return FNacimiento;
	}

	public void setFNacimiento(Date fNacimiento) {
		FNacimiento = fNacimiento;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}
