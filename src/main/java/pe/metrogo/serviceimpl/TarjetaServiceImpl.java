package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.ITarjetaDao;
import pe.metrogo.entity.Tarjeta;
import pe.metrogo.service.ITarjetaService;

@Named
@RequestScoped
public class TarjetaServiceImpl implements ITarjetaService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITarjetaDao tD;
	
	@Override
	public void insertar(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		tD.insertar(tarjeta);
	}

	@Override
	public List<Tarjeta> listar() {
		// TODO Auto-generated method stub
		return tD.listar();
	}

	@Override
	public void eliminar(String CTarjeta) {
		// TODO Auto-generated method stub
		tD.eliminar(CTarjeta);
	}

	
}
