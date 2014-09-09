package org.web.prueba;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class CreaSesion {
	
	public static SessionFactory getSessionFactory(){
		Configuration configuracion = new Configuration().configure();
		StandardServiceRegistryBuilder constructor = new StandardServiceRegistryBuilder().applySettings(configuracion.getProperties());
		SessionFactory Sesion = configuracion.buildSessionFactory(constructor.build());
		return Sesion;
	}
}

