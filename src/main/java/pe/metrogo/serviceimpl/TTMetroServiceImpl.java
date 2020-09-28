package pe.metrogo.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.metrogo.dao.ITTMetroDao;
import pe.metrogo.entity.TTMetro;
import pe.metrogo.service.ITTMetroService;


@Named
@RequestScoped
public class TTMetroServiceImpl implements ITTMetroService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITTMetroDao tD;
	
	@Override
	public void insertar(TTMetro ttmetro) {
		// TODO Auto-generated method stub
		tD.insertar(ttmetro);
	}

	@Override
	public List<TTMetro> listar() {
		// TODO Auto-generated method stub
		return tD.listar();
	}

	@Override
	public void eliminar(int CTTMetro) {
		// TODO Auto-generated method stub
		tD.eliminar(CTTMetro);
	}

	
}
