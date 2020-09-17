package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.IEntidadBancariaDao;
import pe.metrogo.entity.EntidadBancaria;
import pe.metrogo.service.IEntidadBancariaService;

@Named
@RequestScoped
public class EntidadBancariaServiceImpl implements IEntidadBancariaService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEntidadBancariaDao eD;

	@Override
	public void insertar(EntidadBancaria entidad) {
		eD.insertar(entidad);		
	}

	@Override
	public List<EntidadBancaria> listar() {
		return eD.listar();
	}

	@Override
	public void eliminar(int CEntidad) {
		eD.eliminar(CEntidad);		
	}
	
}
