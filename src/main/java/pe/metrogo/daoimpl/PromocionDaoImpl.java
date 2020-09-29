package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.dao.IPromocionDao;
import pe.metrogo.entity.Promocion;

public class PromocionDaoImpl implements IPromocionDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Promocion promocion) {
		// TODO Auto-generated method stub
		try {
			em.persist(promocion);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Promocion> listar() {
		List<Promocion> lista = new ArrayList<Promocion>();
		try {
			Query q = em.createQuery("select p from Promocion p");
			lista = (List<Promocion>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CPromocion) {
		// TODO Auto-generated method stub
		Promocion pro = new Promocion();
		try {
			pro = em.getReference(Promocion.class,CPromocion);
			em.remove(pro);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	
	}

}
