package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.IMedioDePagoDao;
import pe.metrogo.entity.MedioDePago;
import pe.metrogo.service.IMedioDePagoService;

@Named
@RequestScoped
public class MedioDePagoServiceImpl implements IMedioDePagoService, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IMedioDePagoDao mD;

	@Override
	public void insertar(MedioDePago medio) {
		mD.insertar(medio);		
	}

	@Override
	public List<MedioDePago> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int CMedio) {
		mD.eliminar(CMedio);		
	}

	
}
