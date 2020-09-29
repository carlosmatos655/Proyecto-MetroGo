package pe.metrogo.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.metrogo.entity.Usuario;
import pe.metrogo.dao.IUsuarioDao;

public class UsuarioDaoImpl implements IUsuarioDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		try {
			em.persist(usuario);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			Query q = em.createQuery("select u from Usuario u");
			lista = (List<Usuario>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findByNameUsuario(Usuario usu) {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			Query q = em.createQuery("from Usuario u where u.NNombreyApellido like ?1");
			q.setParameter(1, "%" + usu.getNNombreyApellido() + "%");
			lista = (List<Usuario>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar usuario");
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int CUsuario) {
		Usuario usu = new Usuario();
		try {
			usu = em.getReference(Usuario.class,CUsuario);
			em.remove(usu);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}				
	}

}
