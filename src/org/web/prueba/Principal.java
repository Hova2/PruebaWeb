package org.web.prueba;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Principal implements Serializable{

	private int cuit;
	private String dir;
	private int tel1;
	private int tel2;
	private String eml;
	private String nom;
	private String ape;
	private int dni;
	private String raso;
	
	public int getCuit(){
		return this.cuit;
	}
	
	public void setCuit(int cuit){
		this.cuit = cuit;
	}
	
	public int getTel1(){
		return this.tel1;
	}
	
	public void setTel1(int tel1){
		this.tel1 = tel1;
	}
	
	public int getTel2(){
		return this.tel2;
	}
	
	public void setTel2(int tel2){
		this.tel2 = tel2;
	}
	
	public int getDni(){
		return this.dni;
	}
	
	public void setDni(int dni){
		this.dni = dni;
	}
	
	public String getDir(){
		return this.dir;
	}
	
	public void setDir(String dir){
		this.dir = dir;
	}
	
	public String getEml(){
		return this.eml;
	}
	
	public void setEml(String eml){
		this.eml = eml;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public String getApe(){
		return this.ape;
	}
	
	public void setApe(String ape){
		this.ape = ape;
	}
	
	public String getRaso(){
		return this.raso;
	}
	
	public void setRaso(String raso){
		this.raso = raso;
	}
	
	public void SCli(){
		SessionFactory Sesion = CreaSesion.getSessionFactory();
		Session SAbierta = Sesion.openSession();
		
		ClienteOrganizacion CO = new ClienteOrganizacion();
		Cliente Cli = new Cliente();
		
		CO.setCuit(this.cuit);
		CO.setDir(this.dir);
		CO.setTel1(this.tel1);
		CO.setTel2(this.tel2);
		CO.setEml(this.eml);
		CO.setCliente(Cli);
		Cli.setApe(this.ape);
		Cli.setNom(this.nom);
		Cli.setDni(this.dni);
		Cli.setClienteOrganizacion(CO);
		SAbierta.beginTransaction();
		SAbierta.save(CO);
		Cli.setIdcli(CO.getIdcliOrg());
		SAbierta.save(Cli);
		SAbierta.getTransaction().commit();
		SAbierta.close();
		Sesion.close();
	}
	
	public List TCli(){
		SessionFactory Sesion = CreaSesion.getSessionFactory();
		Session SAbierta = Sesion.openSession();
		return SAbierta.createQuery("FROM ClienteOrganizacion").list();
	}
	
}
