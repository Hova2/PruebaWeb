package org.web.prueba;

// Generated 05/09/2014 17:49:27 by Hibernate Tools 4.0.0

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private int idcli;
	private ClienteOrganizacion clienteOrganizacion;
	private String nom;
	private String ape;
	private Integer dni;

	public Cliente() {
	}

	public Cliente(ClienteOrganizacion clienteOrganizacion) {
		this.clienteOrganizacion = clienteOrganizacion;
	}

	public Cliente(ClienteOrganizacion clienteOrganizacion, String nom,
			String ape, Integer dni) {
		this.clienteOrganizacion = clienteOrganizacion;
		this.nom = nom;
		this.ape = ape;
		this.dni = dni;
	}

	public int getIdcli() {
		return this.idcli;
	}

	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}

	public ClienteOrganizacion getClienteOrganizacion() {
		return this.clienteOrganizacion;
	}

	public void setClienteOrganizacion(ClienteOrganizacion clienteOrganizacion) {
		this.clienteOrganizacion = clienteOrganizacion;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return this.ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public Integer getDni() {
		return this.dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

}
