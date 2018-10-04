package fr.afcepf.al32.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Client {

	@Id
	//....
	@Column(name="numClient")
	private Long numero;
	
	private String prenom;
	private String nom;

}
