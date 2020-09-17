package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.IRecargaDao;
import pe.metrogo.entity.Recarga;
import pe.metrogo.service.IRecargaService;

@Named
@RequestScoped
public class RecargaServiceImpl implements IRecargaService, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRecargaDao rD;
	
	@Override
	public void insertar(Recarga recarga) {
		rD.insertar(recarga);		
	}

	@Override
	public List<Recarga> listar() {
		return rD.listar();
	}

	@Override
	public void eliminar(int CRecarga) {
		rD.eliminar(CRecarga);		
	}
}
