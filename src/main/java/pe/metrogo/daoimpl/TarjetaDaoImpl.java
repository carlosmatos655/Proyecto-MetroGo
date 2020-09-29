package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.dao.ITarjetaDao;
import pe.metrogo.entity.Tarjeta;


public class TarjetaDaoImpl implements ITarjetaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		try {
			em.persist(tarjeta);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tarjeta> listar() {
		List<Tarjeta> lista = new ArrayList<Tarjeta>();
		try {
			Query q = em.createQuery("select t from Tarjeta t");
			lista = (List<Tarjeta>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(String CTarjeta) {
		// TODO Auto-generated method stub
		Tarjeta tar = new Tarjeta();
		try {
			tar = em.getReference(Tarjeta.class,CTarjeta);
			em.remove(tar);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	
	}

}
