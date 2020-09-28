package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.IRolDao;
import pe.metrogo.entity.Rol;
import pe.metrogo.service.IRolService;


@Named
@RequestScoped
public class RolServiceImpl implements IRolService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRolDao rD;
	
	@Override
	public void insertar(Rol rol) {
		// TODO Auto-generated method stub
		rD.insertar(rol);
	}

	@Override
	public List<Rol> listar() {
		// TODO Auto-generated method stub
		return rD.listar();
	}

	@Override
	public void eliminar(int CRol) {
		// TODO Auto-generated method stub
		rD.eliminar(CRol);
	}

	
}
