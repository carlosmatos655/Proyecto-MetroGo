package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.IPromocionDao;
import pe.metrogo.entity.Promocion;
import pe.metrogo.service.IPromocionService;

@Named
@RequestScoped
public class PromocionServiceImpl implements IPromocionService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPromocionDao pD;
	
	@Override
	public void insertar(Promocion promocion) {
		// TODO Auto-generated method stub
		pD.insertar(promocion);
	}

	@Override
	public List<Promocion> listar() {
		// TODO Auto-generated method stub
		return pD.listar();
	}

	@Override
	public void eliminar(int CPromocion) {
		// TODO Auto-generated method stub
		pD.eliminar(CPromocion);
	}

	
}
