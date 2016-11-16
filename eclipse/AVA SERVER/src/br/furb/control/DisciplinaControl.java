package br.furb.control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.furb.conection.DatabaseConection;
import br.furb.model.Disciplina;

public class DisciplinaControl {

	EntityManager manager;

	public DisciplinaControl() {
		manager = DatabaseConection.getEntityManager();
	}

	public boolean inserir(Disciplina dc) {
		if (dc != null) {
			manager.getTransaction().begin();
			manager.persist(dc);
			manager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean alterar(Disciplina dc) {
		if (dc != null) {
			manager.getTransaction().begin();
			manager.merge(dc);
			manager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean excluir(Disciplina dc) {
		if (dc != null) {
			manager.getTransaction().begin();
			manager.remove(dc);
			manager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public Disciplina buscar(int id) {
		return manager.find(Disciplina.class, id);
	}

	public List<Disciplina> listarTodos() {
		manager.getTransaction().begin();
		Query consulta = manager.createQuery("SELECT disciplina FROM Disciplina disciplina");
		@SuppressWarnings("unchecked")
		List<Disciplina> disciplinas = consulta.getResultList();
		manager.getTransaction().commit();
		return disciplinas;
	}

}
