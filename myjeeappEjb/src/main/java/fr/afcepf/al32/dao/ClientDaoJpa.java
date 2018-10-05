package fr.afcepf.al32.dao;

import java.util.List;

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

	@Override
	public List<Client> findAll() {
		return entityManager.createNamedQuery("Client.findAll", Client.class)
				.getResultList();
	}

	@Override
	public Client save(Client c) {
		if(c.getNumero()==null) {
			entityManager.persist(c);//avec auto_incr du numero
			if(c.getAdressePrincipale()!=null) {
				c.getAdressePrincipale().setIdClient(c.getNumero());
				entityManager.persist(c.getAdressePrincipale());
			}
		}
		else 
			entityManager.merge(c);
		return c;
	}

}
