package fr.afcepf.al32.web;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.afcepf.al32.entity.Client;
import fr.afcepf.al32.service.IServiceClient;

@ManagedBean
@RequestScoped
public class ClientMBean {

	@EJB
	private IServiceClient serviceClient;
	
	private Client client = new Client();
	
	public String recupererClient() {
		client = serviceClient.rechercherClientParNumero(1L);
		return null;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
