/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.presentacion;

import com.fpmislata.banco.datos.EntidadBancariaDAO;
import com.fpmislata.banco.datos.EntidadBancariaDAOImpHibernate;
import com.fpmislata.banco.negocio.EntidadBancaria;
import com.fpmislata.banco.negocio.TipoEntidadBancaria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author alumno
 */
public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        
        //PROBAMOS EL EntidadBancariaDAOImpHibernate
        Session session = sessionFactory.openSession();
        //EntidadBancaria entidadBancaria=new EntidadBancaria(22, "cambiandodatos", "patitisimo", "superpatito", TipoEntidadBancaria.CoopCredito);
        //EntidadBancaria entidadBancaria= (EntidadBancaria)session.get(EntidadBancaria.class, 22);
        //entidadBancaria.setCif("83745983754");
        //EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImpHibernate(sessionFactory);
        //entidadBancariaDAO.read(13);
        //entidadBancariaDAO.insert(entidadBancaria);
        //entidadBancariaDAO.delete(22);
        //entidadBancariaDAO.update(entidadBancaria);
        
        //PROBAMOS EL FIND ALL
        EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImpHibernate(sessionFactory);
        entidadBancariaDAO.findAll();
        sessionFactory.close();
    }
}
