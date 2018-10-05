package fr.afcepf.al32.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.al32.dao.IClientDao;
import fr.afcepf.al32.entity.Client;

@Local
@Stateless
public class ServiceClientEjb implements IServiceClient {

	@EJB
	private IClientDao clientDao;

	@Override
	public Client rechercherClientParNumero(long numClient) {
		return clientDao.findOne(numClient);
	}

	@Override
	public List<Client> rechercherTousLesClients() {
		return clientDao.findAll();
	}

	@Override
	public Client saveOrUpdateClient(Client c) {
		return clientDao.save(c);
	}

}
