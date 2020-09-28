package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.INacionalidadDao;
import pe.metrogo.entity.Nacionalidad;
import pe.metrogo.service.INacionalidadService;


@Named
@RequestScoped
public class NacionalidadServiceImpl implements INacionalidadService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private INacionalidadDao nD;
	
	@Override
	public void insertar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		nD.insertar(nacionalidad);
	}

	@Override
	public List<Nacionalidad> listar() {
		// TODO Auto-generated method stub
		return nD.listar();
	}

	@Override
	public void eliminar(int CNacionalidad) {
		// TODO Auto-generated method stub
		nD.eliminar(CNacionalidad);
	}

	
}
