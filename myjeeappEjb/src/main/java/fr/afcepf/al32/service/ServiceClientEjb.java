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
		System.out.println("numClient="+c.getNumero());
		clientDao.save(c);
		System.out.println("numClient="+c.getNumero());
		if(c.getAdressePrincipale().getCp().equals("-1")) {
			throw new RuntimeException("-1 = codePostal invalide");
			//exemple "scolaire" pour visualiser rollback automatique sur EJB
		}
		return c;
	}

}
