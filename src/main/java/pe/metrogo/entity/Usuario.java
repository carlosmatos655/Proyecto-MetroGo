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
	
	@Column(name="CContraseña", nullable=false, length=10)
	private String CContraseña;
	
	private Date FNacimiento;
	
	@ManyToOne
	@JoinColumn(name = "CNacionalidad", nullable = false)
	private Nacionalidad nacionalidad;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CContraseña == null) ? 0 : CContraseña.hashCode());
		result = prime * result + CUsuario;
		result = prime * result + ((FNacimiento == null) ? 0 : FNacimiento.hashCode());
		result = prime * result + ((NNombreyApellido == null) ? 0 : NNombreyApellido.hashCode());
		result = prime * result + ((TCorreo == null) ? 0 : TCorreo.hashCode());
		result = prime * result + ((nacionalidad == null) ? 0 : nacionalidad.hashCode());
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
		Usuario other = (Usuario) obj;
		if (CContraseña == null) {
			if (other.CContraseña != null)
				return false;
		} else if (!CContraseña.equals(other.CContraseña))
			return false;
		if (CUsuario != other.CUsuario)
			return false;
		if (FNacimiento == null) {
			if (other.FNacimiento != null)
				return false;
		} else if (!FNacimiento.equals(other.FNacimiento))
			return false;
		if (NNombreyApellido == null) {
			if (other.NNombreyApellido != null)
				return false;
		} else if (!NNombreyApellido.equals(other.NNombreyApellido))
			return false;
		if (TCorreo == null) {
			if (other.TCorreo != null)
				return false;
		} else if (!TCorreo.equals(other.TCorreo))
			return false;
		if (nacionalidad == null) {
			if (other.nacionalidad != null)
				return false;
		} else if (!nacionalidad.equals(other.nacionalidad))
			return false;
		return true;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int cUsuario, String nNombreyApellido, String tCorreo, String cContraseña, Date fNacimiento, Nacionalidad nacionalidad) {
		super();
		CUsuario = cUsuario;
		NNombreyApellido = nNombreyApellido;
		TCorreo = tCorreo;
		CContraseña = cContraseña;
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

	public String getCContraseña() {
		return CContraseña;
	}

	public void setCContraseña(String cContraseña) {
		CContraseña = cContraseña;
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
