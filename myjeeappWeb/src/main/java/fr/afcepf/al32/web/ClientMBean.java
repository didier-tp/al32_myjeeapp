package fr.afcepf.al32.web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.afcepf.al32.entity.Adresse;
import fr.afcepf.al32.entity.Client;
import fr.afcepf.al32.service.IServiceClient;

@ManagedBean
@RequestScoped
public class ClientMBean {

	@EJB
	private IServiceClient serviceClient;
	
	private Client client;//à saisir / ajouter
	
	
	
	public ClientMBean() {
		client = new Client(); //surtout par null
		client.setAdressePrincipale(new Adresse());//surtout pas null pour pouvoir saisir dedans
		//quelques valeurs par defaut:
		client.setNom("nom");client.setPrenom("prenom");client.setTelephone("123");
		client.setEmail("prenom.nom@gmail.com");
		client.getAdressePrincipale().setRue("rue");
		client.getAdressePrincipale().setCp("000");
		client.getAdressePrincipale().setVille("ville");
	}

	private List<Client> listeClients ; //à récupérer/afficher
	
	public String recupererClient() {
		client = serviceClient.rechercherClientParNumero(1L);
		return null;
	}
	
	public String ajouterClient() {
		serviceClient.saveOrUpdateClient(this.client);
		return recupererTousLesClients(); //réactualiser la liste
		//return null;
	}
	
	public String recupererTousLesClients() {
		this.listeClients = serviceClient.rechercherTousLesClients();
		return null;
	}
	
	@PostConstruct
	public void init() {
		recupererTousLesClients();
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}
	
	

}
