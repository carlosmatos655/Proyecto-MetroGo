package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.dao.INacionalidadDao;
import pe.metrogo.entity.Nacionalidad;

public class NacionalidadDaoImpl implements INacionalidadDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		try {
			em.persist(nacionalidad);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Nacionalidad> listar() {
		List<Nacionalidad> lista = new ArrayList<Nacionalidad>();
		try {
			Query q = em.createQuery("select n from Nacionalidad n");
			lista = (List<Nacionalidad>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CNacionalidad) {
		// TODO Auto-generated method stub
		Nacionalidad nac = new Nacionalidad();
		try {
			nac = em.getReference(Nacionalidad.class,CNacionalidad);
			em.remove(nac);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	
	}

}
