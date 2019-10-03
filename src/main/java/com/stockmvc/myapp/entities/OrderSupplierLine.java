package com.stockmvc.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderSupplierLine
{
	
	@Id
	@GeneratedValue
	private Long idLigneCdeFrs;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private OrderSupplier commandeFournisseur;

	public Long getIdLigneCdeFrs() {
		return idLigneCdeFrs;
	}

	public void setIdLigneCdeFrs(Long idLigneCdeFrs) {
		this.idLigneCdeFrs = idLigneCdeFrs;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public OrderSupplier getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(OrderSupplier commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
	
	
	

}
