package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.entity.EntidadBancaria;
import pe.metrogo.dao.IEntidadBancariaDao;

public class EntidadBancariaDaoImpl implements IEntidadBancariaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Override
	public void insertar(EntidadBancaria entidad) {
		// TODO Auto-generated method stub
		try {
			em.persist(entidad);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EntidadBancaria> listar() {
		// TODO Auto-generated method stub
		List<EntidadBancaria> lista = new ArrayList<EntidadBancaria>();
		try {
			Query q = em.createQuery("select eb from EntidadBancaria eb");
			lista = (List<EntidadBancaria>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CEntidad) {
		// TODO Auto-generated method stub
		EntidadBancaria ent = new EntidadBancaria();
		try {
			ent = em.getReference(EntidadBancaria.class,CEntidad);
			em.remove(ent);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
}
