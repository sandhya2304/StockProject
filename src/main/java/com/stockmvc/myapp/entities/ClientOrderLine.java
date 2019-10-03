package com.stockmvc.myapp.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
public class ClientOrderLine implements Serializable
{
	
	
	@Id
	@GeneratedValue
	private Long idLigneCdeClt;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeClient")
	private OrderClient commandeClient;

	public Long getIdLigneCdeClt() {
		return idLigneCdeClt;
	}

	public void setIdLigneCdeClt(Long idLigneCdeClt) {
		this.idLigneCdeClt = idLigneCdeClt;
	}
	
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@JsonIgnore
	public OrderClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(OrderClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	
	

}
