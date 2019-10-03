package com.stockmvc.myapp.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class OrderSupplier implements Serializable
{
	
	@Id
	@GeneratedValue
	private Long idCommandeFournisseur;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idFournisseur")
	private Supplier fournisseur;
	
	@OneToMany(mappedBy = "commandeFournisseur")
	private List<OrderSupplierLine> ligneCommandeFournisseurs;

	public Long getIdCommandeFournisseur() {
		return idCommandeFournisseur;
	}

	public void setIdCommandeFournisseur(Long idCommandeFournisseur) {
		this.idCommandeFournisseur = idCommandeFournisseur;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Supplier getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Supplier fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<OrderSupplierLine> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}

	public void setLigneCommandeFournisseurs(List<OrderSupplierLine> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}
	
	

}
