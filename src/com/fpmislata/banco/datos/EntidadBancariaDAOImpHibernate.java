/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.datos;

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
public class EntidadBancariaDAOImpHibernate implements EntidadBancariaDAO {

    private SessionFactory sessionFactory;

    public EntidadBancariaDAOImpHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;

    }

    //READ
    public EntidadBancaria read(Integer idEntidadBancaria) {
        Session session = sessionFactory.openSession();
        EntidadBancaria entidadBancaria;
        try {
            session.beginTransaction();
            entidadBancaria = (EntidadBancaria) session.get(EntidadBancaria.class, idEntidadBancaria);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        }

        return entidadBancaria;
    }
    //UPDATE

    public void update(EntidadBancaria entidadBancaria) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(entidadBancaria);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        }
    }
}
