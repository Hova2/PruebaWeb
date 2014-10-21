package org.web.prueba;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FlowEvent;

public class Principal implements Serializable{

	//Variables para clientes u organizaciones
	
	private Long cuit;
	private String dir;
	private Integer tel1;
	private Integer tel2;
	private String eml;
	private String nom;
	private String ape;
	private Integer dni;
	private String raso;
	private Integer idcli;
	private Integer idorg;
	
	// Variables para articulos
	
	private String nomart;
	private String tipart;
	private Integer cantart;
	private String descart;
	private Integer palqart;
	private Integer pcomart;
	
	//Metodos geter y seter para cientes u organizaciones
	
	public  Long getCuit(){
		return this.cuit;
	}
	
	public void setCuit(Long cuit){
		this.cuit = cuit;
	}
	
	public Integer getIdcli(){
		return this.idcli;
	}
	
	public void setIdcli(Integer idcli){
		this.idcli = idcli;
	}
	
	public Integer getIdorg(){
		return this.idorg;
	}
	
	public void setIdorg(Integer idorg){
		this.idorg = idorg;
	}
	
	public Integer getTel1(){
		return this.tel1;
	}
	
	public void setTel1(Integer tel1){
		this.tel1 = tel1;
	}
	
	public Integer getTel2(){
		return this.tel2;
	}
	
	public void setTel2(Integer tel2){
		this.tel2 = tel2;
	}
	
	public Integer getDni(){
		return this.dni;
	}
	
	public void setDni(Integer dni){
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
	
	//Metodos geter y seter para articulos
	
	
	public String getNomart(){
		return this.nomart;
	}
	
	public void setNomart(String nomart){
		this.nomart = nomart;
	}
	
	public String getTipart(){
		return this.tipart;
	}
	
	public void setTipart(String tipart){
		this.tipart = tipart;
	}
	
	public Integer getCantart(){
		return this.cantart;
	}
	
	public void setCantart(Integer cantart){
		this.cantart = cantart;
	}
	
	public String getDescart(){
		return this.descart;
	}
	
	public void setDescart(String descart){
		this.descart = descart;
	} 
	
	public Integer getPalqart(){
		return this.palqart;
	}
	
	public void setPalqart(Integer palqart){
		this.palqart = palqart;
	}
	
	public Integer getPcomart(){
		return this.pcomart;
	}
	
	public void setPcomart(Integer pcomart){
		this.pcomart = pcomart;
	}
	
	public void ResetValues(){
		this.setIdcli(null);
		this.setIdorg(null);
		this.setNom(null);
		this.setApe(null);
		this.setDni(null);
		this.setCuit(null);
		this.setDir(null);
		this.setTel1(null);
		this.setTel2(null);
		this.setEml(null);
		this.setRaso(null);
		this.setNomart(null);
		this.setCantart(null);
		
		this.setTipart(null);
		this.setPalqart(null);
		this.setPcomart(null);
	}
	
	public void CCli(){
		SessionFactory sesion = CreaSesion.getSessionFactory();
		Session sabierta = sesion.openSession();
		ClienteOrganizacion co = new ClienteOrganizacion();
		Cliente cli = new Cliente();
		
		if (this.idcli == null){
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
			this.ResetValues();
		}
		else{
			co.setIdcliOrg(this.idcli);
			co.setCuit(this.getCuit());
			co.setDir(this.getDir());
			co.setTel1(this.getTel1());
			co.setTel2(this.getTel2());
			co.setEml(this.getEml());
			co.setCliente(cli);
			cli.setIdcli(this.idcli);
			cli.setApe(this.getApe());
			cli.setNom(this.getNom());
			cli.setDni(this.getDni());
			cli.setClienteOrganizacion(co);
			sabierta.beginTransaction();
			sabierta.update(co);;
			sabierta.update(cli);
			sabierta.getTransaction().commit();
			this.ResetValues();
		}
		sabierta.close();
		sesion.close();
	}
	
	public void COrg(){
		SessionFactory sesion = CreaSesion.getSessionFactory();
		Session sabierta = sesion.openSession();
		ClienteOrganizacion co = new ClienteOrganizacion();	
		Organizacion org = new Organizacion();
		
		if (this.idorg == null){
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
			this.ResetValues();
		}
		else{
			co.setIdcliOrg(this.idorg);
			co.setCuit(this.getCuit());
			co.setDir(this.getDir());
			co.setTel1(this.getTel1());
			co.setTel2(this.getTel2());
			co.setEml(this.getEml());
			co.setOrganizacion(org);
			org.setIdorg(this.idorg);
			org.setRaso(this.raso);
			org.setClienteOrganizacion(co);
			sabierta.beginTransaction();
			sabierta.update(co);;
			sabierta.update(org);
			sabierta.getTransaction().commit();
			this.ResetValues();
		}
		sabierta.close();
		sesion.close();
	}
	
	public List LCli(){
		SessionFactory Sesion = CreaSesion.getSessionFactory();
		Session SAbierta = Sesion.openSession();
		return SAbierta.createQuery("FROM Cliente").list(); 		
	}
	
	public List LOrg(){
		SessionFactory Sesion = CreaSesion.getSessionFactory();
		Session SAbierta = Sesion.openSession();
		return SAbierta.createQuery("FROM Organizacion").list();
	}
	
	public void BCli(){
		SessionFactory sesion = CreaSesion.getSessionFactory();
		Session sabierta = sesion.openSession();
		String query = ("from Cliente where idcli="+"'"+this.getIdcli().toString()+"'");
		Cliente mcli = (Cliente)sabierta.createQuery(query).uniqueResult();
		this.setApe(mcli.getApe());
		this.setNom(mcli.getNom());
		this.setDni(mcli.getDni());
		this.setCuit(mcli.getClienteOrganizacion().getCuit());
		this.setTel1(mcli.getClienteOrganizacion().getTel1());
		this.setTel2(mcli.getClienteOrganizacion().getTel2());
		this.setDir(mcli.getClienteOrganizacion().getDir());
		this.setEml(mcli.getClienteOrganizacion().getEml());
		sabierta.close();
		sesion.close();
	}
	
	public void BOrg(){
		SessionFactory sesion = CreaSesion.getSessionFactory();
		Session sabierta = sesion.openSession();
		String query = ("from Organizacion where idorg="+"'"+this.getIdorg().toString()+"'");
		Organizacion morg = (Organizacion)sabierta.createQuery(query).uniqueResult();
		this.setRaso(morg.getRaso());
		this.setCuit(morg.getClienteOrganizacion().getCuit());
		this.setTel1(morg.getClienteOrganizacion().getTel1());
		this.setTel2(morg.getClienteOrganizacion().getTel2());
		this.setDir(morg.getClienteOrganizacion().getDir());
		this.setEml(morg.getClienteOrganizacion().getEml());
		sabierta.close();
		sesion.close();
	}
	
	public void ECli(){
		SessionFactory sesion = CreaSesion.getSessionFactory();
		Session sabierta = sesion.openSession();
		ClienteOrganizacion co = new ClienteOrganizacion();
		
		if (this.idcli != null){
			Cliente cli = new Cliente();
			co.setIdcliOrg(this.idcli);
			cli.setIdcli(this.idcli);
			sabierta.beginTransaction();
			sabierta.delete(cli);
			sabierta.delete(co);
			sabierta.getTransaction().commit();
			this.ResetValues();
		}
		else{
			Organizacion org = new Organizacion();
			co.setIdcliOrg(this.idorg);
			org.setIdorg(this.idorg);
			sabierta.beginTransaction();
			sabierta.delete(org);
			sabierta.delete(co);
			sabierta.getTransaction().commit();
			this.ResetValues();
		}
		sabierta.close();
		sesion.close();
	}
	
	// Metodos para articulos
	
	public void CArt(){
		SessionFactory sesion = CreaSesion.getSessionFactory();
		Session sabierta = sesion.openSession();
		Articulo art = new Articulo();
		
		art.setNom(this.getNomart());
		art.setTip(this.getTipart());
		art.setCant(this.getCantart());
		art.setDesc(this.getDescart());
		art.setPalq(this.getPalqart());
		art.setPcom(this.getPcomart());
		sabierta.beginTransaction();
		sabierta.save(art);
		sabierta.getTransaction().commit();
		sabierta.close();
		sesion.close();
		}
}
