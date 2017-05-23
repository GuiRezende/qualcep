package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entidades.TipoLog;

public class TipoLogDao {

	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(TipoLog tipolog) {
		manager.getTransaction().begin();
		
		manager.persist(tipolog);
		
		manager.getTransaction().commit();
	}
	
	public void altera(TipoLog tipolog) {
		manager.getTransaction().begin();
		
		manager.merge(tipolog);
		
		manager.getTransaction().commit();		
	}

	public void remove(TipoLog tipolog) {
		manager.getTransaction().begin();

		manager.remove(tipolog);
		
		manager.getTransaction().commit();

	}
	
	public List<TipoLog> todos() {
	  return manager.createQuery("from TipoLog", TipoLog.class).getResultList();
	}

	public List<TipoLog> ordenadosPeloNome() {
		return manager.createQuery("select en from TipoLog en order by en.nome", TipoLog.class).getResultList();
	}	
	
	public TipoLog porId(Long id) {
		return manager.find(TipoLog.class, id);
	}

}
