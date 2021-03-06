package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entidades.Endereco;

public class EnderecoDao {

	EntityManager manager = new JPAUtil().getEntityManager();

	public void adiciona(Endereco endereco) {
		manager.getTransaction().begin();
		
		manager.persist(endereco);
		
		manager.getTransaction().commit();
	}
	
	public void altera(Endereco endereco) {
		manager.getTransaction().begin();
		
		manager.merge(endereco);
		
		manager.getTransaction().commit();		
	}

	public void remove(Endereco endereco) {
		manager.getTransaction().begin();

		manager.remove(endereco);
		
		manager.getTransaction().commit();

	}
	
	public List<Endereco> todos() {
	  return manager.createQuery("from Endereco", Endereco.class).getResultList();
	}

	public List<Endereco> ordenadosPeloNome() {
		return manager.createQuery("select en from Endereco en order by en.nome", Endereco.class).getResultList();
	}	
	
	public Endereco porId(Long id) {
		return manager.find(Endereco.class, id);
	}

}
