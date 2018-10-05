package fr.afcepf.al32.dao;

import java.util.List;

import fr.afcepf.al32.entity.Client;

public interface IClientDao {
	Client findOne(Long num);
	List<Client> findAll();
	Client save(Client c);
}
