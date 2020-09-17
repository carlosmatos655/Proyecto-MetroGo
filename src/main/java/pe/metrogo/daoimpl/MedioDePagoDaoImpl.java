package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.entity.MedioDePago;
import pe.metrogo.dao.IMedioDePagoDao;

public class MedioDePagoDaoImpl implements IMedioDePagoDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(MedioDePago medio) {
		// TODO Auto-generated method stub
		try {
			em.persist(medio);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MedioDePago> listar() {
		// TODO Auto-generated method stub
		List<MedioDePago> lista = new ArrayList<MedioDePago>();
		try {
			Query q = em.createQuery("select mdp from MedioDePago mdp");
			lista = (List<MedioDePago>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CMedio) {
		// TODO Auto-generated method stub
		MedioDePago med = new MedioDePago();
		try {
			med = em.getReference(MedioDePago.class,CMedio);
			em.remove(med);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}				
	}
	
	
	
}
