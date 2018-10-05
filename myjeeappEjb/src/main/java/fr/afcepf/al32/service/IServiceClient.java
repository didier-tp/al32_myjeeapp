package fr.afcepf.al32.service;

import java.util.List;

import fr.afcepf.al32.entity.Client;

public interface IServiceClient {
   Client rechercherClientParNumero(long numClient);
   List<Client> rechercherTousLesClients();
   Client saveOrUpdateClient(Client c);
}
