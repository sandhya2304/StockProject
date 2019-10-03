package com.stockmvc.myapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OnlineSale implements Serializable 
{
	
	@Id
	@GeneratedValue
	private Long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "vente")
	private Sale vente;

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Sale getVente() {
		return vente;
	}

	public void setVente(Sale vente) {
		this.vente = vente;
	}
	
	

}
