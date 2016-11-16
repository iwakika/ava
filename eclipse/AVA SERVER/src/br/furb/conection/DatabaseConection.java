package br.furb.conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseConection {
	public static EntityManagerFactory manager;

	static {
		manager = Persistence.createEntityManagerFactory("ava");
		manager.createEntityManager();
	}

	public static EntityManager getEntityManager() {
		return manager.createEntityManager();
	}
}
