package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.dao.ITTMetroDao;
import pe.metrogo.entity.TTMetro;

public class TTMetroDaoImpl implements ITTMetroDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(TTMetro ttmetro) {
		// TODO Auto-generated method stub
		try {
			em.persist(ttmetro);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TTMetro> listar() {
		List<TTMetro> lista = new ArrayList<TTMetro>();
		try {
			Query q = em.createQuery("select t from TTMetro t");
			lista = (List<TTMetro>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CTTMetro) {
		// TODO Auto-generated method stub
		TTMetro ttm = new TTMetro();
		try {
			ttm = em.getReference(TTMetro.class,CTTMetro);
			em.remove(ttm);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	
	}

}
