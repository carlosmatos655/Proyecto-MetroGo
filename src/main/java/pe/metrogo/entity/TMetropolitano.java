package pe.metrogo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tmetropolitano")
public class TMetropolitano implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CTarjetaMetro", nullable = false, length = 10)
	private String CTarjetaMetro;

	private Date DVencimiento;
	
	@ManyToOne
	@JoinColumn(name = "CTTMetro", nullable = false)
	private TTMetro ttmetro;
	
	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario usuario;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CTarjetaMetro == null) ? 0 : CTarjetaMetro.hashCode());
		result = prime * result + ((DVencimiento == null) ? 0 : DVencimiento.hashCode());
		result = prime * result + ((ttmetro == null) ? 0 : ttmetro.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		TMetropolitano other = (TMetropolitano) obj;
		if (CTarjetaMetro == null) {
			if (other.CTarjetaMetro != null)
				return false;
		} else if (!CTarjetaMetro.equals(other.CTarjetaMetro))
			return false;
		if (DVencimiento == null) {
			if (other.DVencimiento != null)
				return false;
		} else if (!DVencimiento.equals(other.DVencimiento))
			return false;
		if (ttmetro == null) {
			if (other.ttmetro != null)
				return false;
		} else if (!ttmetro.equals(other.ttmetro))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public TMetropolitano() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TMetropolitano(String cTarjetaMetro, Date dVencimiento, TTMetro ttmetro, Usuario usuario) {
		super();
		CTarjetaMetro = cTarjetaMetro;
		DVencimiento = dVencimiento;
		this.ttmetro = ttmetro;
		this.usuario = usuario;
	}

	public String getCTarjetaMetro() {
		return CTarjetaMetro;
	}

	public void setCTarjetaMetro(String cTarjetaMetro) {
		CTarjetaMetro = cTarjetaMetro;
	}

	public Date getDVencimiento() {
		return DVencimiento;
	}

	public void setDVencimiento(Date dVencimiento) {
		DVencimiento = dVencimiento;
	}

	public TTMetro getTtmetro() {
		return ttmetro;
	}

	public void setTtmetro(TTMetro ttmetro) {
		this.ttmetro = ttmetro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
