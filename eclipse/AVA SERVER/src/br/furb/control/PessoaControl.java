package br.furb.control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.furb.conection.DatabaseConection;
import br.furb.model.Pessoa;

public class PessoaControl {

	EntityManager manager;

	public PessoaControl() {
		manager = DatabaseConection.getEntityManager();
	}

	public boolean inserir(Pessoa p) {
		if (p != null) {
			manager.getTransaction().begin();
			manager.persist(p);
			manager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean alterar(Pessoa p) {
		if (p != null) {
			manager.getTransaction().begin();
			manager.merge(p);
			manager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean alterarDados(int id, String email, String facebook, String homepage, String skype, String twitter) {
		Pessoa p = buscar(id);
		if (p != null) {
			p.setEmail(email);
			p.setFacebook(facebook);
			p.setHomepage(homepage);
			p.setSkype(skype);
			p.setTwitter(twitter);
			manager.getTransaction().begin();
			manager.merge(p);
			manager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean excluir(Pessoa p) {
		if (p != null) {
			manager.getTransaction().begin();
			manager.remove(p);
			manager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public Pessoa buscar(int id) {
		return manager.find(Pessoa.class, id);
	}

	public Pessoa buscarLogin(String login) {
		return manager.find(Pessoa.class, login);
	}

	public List<Pessoa> listarTodos() {
		manager.getTransaction().begin();
		Query consulta = manager.createQuery("SELECT pessoa FROM Pessoa pessoa");
		@SuppressWarnings("unchecked")
		List<Pessoa> pessoas = consulta.getResultList();
		manager.getTransaction().commit();
		return pessoas;
	}

}
