package fr.afcepf.al32.dao;

import fr.afcepf.al32.entity.Client;

public interface IClientDao {
	Client findOne(Long num);
	//...
}
