package fr.afcepf.al32.service;

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

}
