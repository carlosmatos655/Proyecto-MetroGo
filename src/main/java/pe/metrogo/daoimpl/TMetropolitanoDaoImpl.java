package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.dao.ITMetropolitanoDao;
import pe.metrogo.entity.TMetropolitano;

public class TMetropolitanoDaoImpl implements ITMetropolitanoDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(TMetropolitano tmetropolitano) {
		// TODO Auto-generated method stub
		try {
			em.persist(tmetropolitano);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TMetropolitano> listar() {
		List<TMetropolitano> lista = new ArrayList<TMetropolitano>();
		try {
			Query q = em.createQuery("select t from TMetropolitano t");
			lista = (List<TMetropolitano>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(String CTarjetaMetro) {
		// TODO Auto-generated method stub
		TMetropolitano nac = new TMetropolitano();
		try {
			nac = em.getReference(TMetropolitano.class,CTarjetaMetro);
			em.remove(nac);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	
	}


}
