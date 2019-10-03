package com.stockmvc.myapp.entities;

import java.io.IOException;
import java.math.BigDecimal;
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
import javax.persistence.Transient;

import org.aspectj.internal.lang.annotation.ajcDeclareSoft;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.type.descriptor.java.BigIntegerTypeDescriptor;

@Entity
public class OrderClient 
{
		
	@Id
	@GeneratedValue
	private Long idCommandeClient;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient")
	private List<ClientOrderLine> ligneCommandeClients;
	
	@Transient
	private BigDecimal totalCommande;
	
	
	public Long getIdCommandeClient() {
		return idCommandeClient;
	}

	public void setIdCommandeClient(Long idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@JsonIgnore
	public List<ClientOrderLine> getLigneCommandeClients() {
		return ligneCommandeClients;
	}

	public void setLigneCommandeClients(List<ClientOrderLine> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}
	
	//get total order form here 
	public BigDecimal getTotalCommande()
	{
		
		totalCommande=BigDecimal.ZERO;
		
		if(!ligneCommandeClients.isEmpty())
		{
			for(ClientOrderLine clientorderline:ligneCommandeClients)
			{
				if(clientorderline.getQuantite() !=null && clientorderline.getPrixUnitaire()!=null)
				{
					
					BigDecimal totalLine=clientorderline.getQuantite().multiply(clientorderline.getPrixUnitaire());
					totalCommande = totalCommande.add(totalLine);
				}
			
			}
			
		}
		return totalCommande;
	}
	
	@Transient
	public String getLigneCommandJson() {
		if(!ligneCommandeClients.isEmpty())
		{
			ObjectMapper mapper=new ObjectMapper();
			try {
				return mapper.writeValueAsString(ligneCommandeClients);
			} catch (JsonGenerationException e) {
				
				e.printStackTrace();
			} catch (JsonMappingException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}
		
		
		return "";
	}

}
