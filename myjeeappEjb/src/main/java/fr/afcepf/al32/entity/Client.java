package fr.afcepf.al32.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@NamedQueries({
	@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
})
public class Client {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numClient")
	private Long numero;
	
	private String prenom;
	private String nom;
	private String email;
	private String telephone;
	
	@Override
	public String toString() {
		return "Client [numero=" + numero + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", telephone="
				+ telephone + "]";
	}
	
	@OneToOne(optional=true ,mappedBy="client")
	private Adresse	adressePrincipale;
	

}
