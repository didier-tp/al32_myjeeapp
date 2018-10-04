package fr.afcepf.al32.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.al32.entity.Client;

@Stateless
@Local
public class ClientDaoJpa implements IClientDao {

	@PersistenceContext()
	private EntityManager entityManager;

	@Override
	public Client findOne(Long num) {
		return entityManager.find(Client.class, num);
	}

}
