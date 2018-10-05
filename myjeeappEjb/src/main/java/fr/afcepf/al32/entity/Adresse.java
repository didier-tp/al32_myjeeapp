package fr.afcepf.al32.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="AdresseDeClient")
@Entity
@Getter @Setter @NoArgsConstructor
public class Adresse {
	
	@Id
	private Long idClient;
	
	private String rue;
	private String cp;
	private String ville;
	
	@OneToOne(optional=false)
	@PrimaryKeyJoinColumn
	private Client client;

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", cp=" + cp + ", ville=" + ville + "]";
	}

	
	
}
