package org.web.prueba;

// Generated 05/09/2014 17:49:27 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Articulo generated by hbm2java
 */
public class Articulo implements java.io.Serializable {

	private Integer idart;
	private String nom;
	private String tip;
	private int cant;
	private String desc;
	private int palq;
	private int pcom;
	private Set pedidoArticulos = new HashSet(0);

	public Articulo() {
	}

	public Articulo(String nom, String tip, int cant, String desc, int palq,
			int pcom) {
		this.nom = nom;
		this.tip = tip;
		this.cant = cant;
		this.desc = desc;
		this.palq = palq;
		this.pcom = pcom;
	}

	public Articulo(String nom, String tip, int cant, String desc, int palq,
			int pcom, Set pedidoArticulos) {
		this.nom = nom;
		this.tip = tip;
		this.cant = cant;
		this.desc = desc;
		this.palq = palq;
		this.pcom = pcom;
		this.pedidoArticulos = pedidoArticulos;
	}

	public Integer getIdart() {
		return this.idart;
	}

	public void setIdart(Integer idart) {
		this.idart = idart;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getCant() {
		return this.cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPalq() {
		return this.palq;
	}

	public void setPalq(int palq) {
		this.palq = palq;
	}

	public int getPcom() {
		return this.pcom;
	}

	public void setPcom(int pcom) {
		this.pcom = pcom;
	}

	public Set getPedidoArticulos() {
		return this.pedidoArticulos;
	}

	public void setPedidoArticulos(Set pedidoArticulos) {
		this.pedidoArticulos = pedidoArticulos;
	}

}