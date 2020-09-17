package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.entity.Recarga;
import pe.metrogo.dao.IRecargaDao;

public class RecargaDaoImpl implements IRecargaDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Override
	public void insertar(Recarga recarga) {
		// TODO Auto-generated method stub
		try {
			em.persist(recarga);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Recarga> listar() {
		List<Recarga> lista = new ArrayList<Recarga>();
		try {
			Query q = em.createQuery("select m from Motor m");
			lista = (List<Recarga>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CRecarga) {
		// TODO Auto-generated method stub
		Recarga rec = new Recarga();
		try {
			rec = em.getReference(Recarga.class,CRecarga);
			em.remove(rec);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}


}
