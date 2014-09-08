package org.web.prueba;

// Generated 05/09/2014 17:49:27 by Hibernate Tools 4.0.0

/**
 * Organizacion generated by hbm2java
 */
public class Organizacion implements java.io.Serializable {

	private int idorg;
	private ClienteOrganizacion clienteOrganizacion;
	private String raso;

	public Organizacion() {
	}

	public Organizacion(ClienteOrganizacion clienteOrganizacion) {
		this.clienteOrganizacion = clienteOrganizacion;
	}

	public Organizacion(ClienteOrganizacion clienteOrganizacion, String raso) {
		this.clienteOrganizacion = clienteOrganizacion;
		this.raso = raso;
	}

	public int getIdorg() {
		return this.idorg;
	}

	public void setIdorg(int idorg) {
		this.idorg = idorg;
	}

	public ClienteOrganizacion getClienteOrganizacion() {
		return this.clienteOrganizacion;
	}

	public void setClienteOrganizacion(ClienteOrganizacion clienteOrganizacion) {
		this.clienteOrganizacion = clienteOrganizacion;
	}

	public String getRaso() {
		return this.raso;
	}

	public void setRaso(String raso) {
		this.raso = raso;
	}

}
