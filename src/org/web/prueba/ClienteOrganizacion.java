package org.web.prueba;

// Generated 05/09/2014 17:49:27 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * ClienteOrganizacion generated by hbm2java
 */
public class ClienteOrganizacion implements java.io.Serializable {

	private Integer idcliOrg;
	private Long cuit;
	private String dir;
	private Integer tel1;
	private Integer tel2;
	private String eml;
	private Organizacion organizacion;
	private Cliente cliente;
	private Set pedidos = new HashSet(0);

	public ClienteOrganizacion() {
	}

	public ClienteOrganizacion(Long cuit, String dir, Integer tel1,
			Integer tel2, String eml, Organizacion organizacion,
			Cliente cliente, Set pedidos) {
		this.cuit = cuit;
		this.dir = dir;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.eml = eml;
		this.organizacion = organizacion;
		this.cliente = cliente;
		this.pedidos = pedidos;
	}

	public Integer getIdcliOrg() {
		return this.idcliOrg;
	}

	public void setIdcliOrg(Integer idcliOrg) {
		this.idcliOrg = idcliOrg;
	}

	public Long getCuit() {
		return this.cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}

	public String getDir() {
		return this.dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public Integer getTel1() {
		return this.tel1;
	}

	public void setTel1(Integer tel1) {
		this.tel1 = tel1;
	}

	public Integer getTel2() {
		return this.tel2;
	}

	public void setTel2(Integer tel2) {
		this.tel2 = tel2;
	}

	public String getEml() {
		return this.eml;
	}

	public void setEml(String eml) {
		this.eml = eml;
	}

	public Organizacion getOrganizacion() {
		return this.organizacion;
	}

	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set pedidos) {
		this.pedidos = pedidos;
	}

}
