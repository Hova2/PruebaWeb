package org.web.prueba;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.primefaces.context.RequestContext;

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
	
	public void CCli(){
		SessionFactory sesion = CreaSesion.getSessionFactory();
		Session sabierta = sesion.openSession();
		
		ClienteOrganizacion co = new ClienteOrganizacion();
		Cliente cli = new Cliente();
		
		co.setCuit(this.getCuit());
		co.setDir(this.getDir());
		co.setTel1(this.getTel1());
		co.setTel2(this.getTel2());
		co.setEml(this.getEml());
		co.setCliente(cli);
		cli.setApe(this.getApe());
		cli.setNom(this.getNom());
		cli.setDni(this.getDni());
		cli.setClienteOrganizacion(co);
		sabierta.beginTransaction();
		sabierta.save(co);
		cli.setIdcli(co.getIdcliOrg());
		sabierta.save(cli);
		sabierta.getTransaction().commit();
		}
	
	public void COrg(){
		SessionFactory sesion = CreaSesion.getSessionFactory();
		Session sabierta = sesion.openSession();
		
		ClienteOrganizacion co = new ClienteOrganizacion();	
		Organizacion org = new Organizacion();
		
		co.setCuit(this.getCuit());
		co.setDir(this.getDir());
		co.setTel1(this.getTel1());
		co.setTel2(this.getTel2());
		co.setEml(this.getEml());
		co.setOrganizacion(org);
		org.setRaso(this.getRaso());
		org.setClienteOrganizacion(co);
		sabierta.beginTransaction();
		sabierta.save(co);
		org.setIdorg(co.getIdcliOrg());
		sabierta.save(org);
		sabierta.getTransaction().commit();
		sabierta.close();
		sesion.close();
	}
	
	public List TCli(){
		SessionFactory Sesion = CreaSesion.getSessionFactory();
		Session SAbierta = Sesion.openSession();
		return SAbierta.createQuery("FROM ClienteOrganizacion").list();
	}
}
