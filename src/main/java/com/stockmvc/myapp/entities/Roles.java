package com.stockmvc.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Roles 
{
	@Id
	@GeneratedValue
	private Long idRole;
	
	private String roleName;
	
	@ManyToOne
	@JoinColumn(name="idUtilisateur")
	private Utilisateur user;
	
	public Roles() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	

}
