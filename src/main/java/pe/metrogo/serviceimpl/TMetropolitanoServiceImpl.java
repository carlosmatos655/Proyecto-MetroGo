package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.ITMetropolitanoDao;
import pe.metrogo.entity.TMetropolitano;
import pe.metrogo.service.ITMetropolitanoService;


@Named
@RequestScoped
public class TMetropolitanoServiceImpl implements ITMetropolitanoService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITMetropolitanoDao tD;
	
	@Override
	public void insertar(TMetropolitano tmetropolitano) {
		// TODO Auto-generated method stub
		tD.insertar(tmetropolitano);
	}

	@Override
	public List<TMetropolitano> listar() {
		// TODO Auto-generated method stub
		return tD.listar();
	}

	@Override
	public void eliminar(String CTarjetaMetro) {
		// TODO Auto-generated method stub
		tD.eliminar(CTarjetaMetro);
	}

	
}
