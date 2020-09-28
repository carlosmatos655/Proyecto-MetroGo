package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.dao.IRolDao;
import pe.metrogo.entity.Rol;

public class RolDaoImpl implements IRolDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Rol rol) {
		// TODO Auto-generated method stub
		try {
			em.persist(rol);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> listar() {
		List<Rol> lista = new ArrayList<Rol>();
		try {
			Query q = em.createQuery("select r from Rol r");
			lista = (List<Rol>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CRol) {
		// TODO Auto-generated method stub
		Rol rol = new Rol();
		try {
			rol = em.getReference(Rol.class,CRol);
			em.remove(rol);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}	
	}

}
