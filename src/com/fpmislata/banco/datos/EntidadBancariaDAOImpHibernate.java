/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.datos;

import com.fpmislata.banco.negocio.EntidadBancaria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
    @Override
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
        }finally {
            if ((session!=null) && (session.isConnected()==true)) {
                session.close();
            }
        }
        return entidadBancaria;
    }
    //UPDATE

    @Override
    public void update(EntidadBancaria entidadBancaria) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(entidadBancaria);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        }finally {
            if ((session!=null) && (session.isConnected()==true)) {
                session.close();
            }
        }
    }

    public void delete(Integer idEntidadBancaria) {
        //DELETE
        Session session = sessionFactory.openSession();
        EntidadBancaria entidadBancaria;
        try {
            session.beginTransaction();
            entidadBancaria = (EntidadBancaria) session.get(EntidadBancaria.class, idEntidadBancaria);
            session.delete(entidadBancaria);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        }finally {
            if ((session!=null) && (session.isConnected()==true)) {
                session.close();
            }
        }
    }

    @Override
    public void insert(EntidadBancaria entidadBancaria) {
        Session session = sessionFactory.openSession();
        //SAVE: hace como un insert
        try {
            session.beginTransaction();
            session.save(entidadBancaria);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw new RuntimeException(ex);
        } finally {
            if ((session!=null) && (session.isConnected()==true)) {
                session.close();
            }
        }
    }

    @Override
    public List<EntidadBancaria> findByCodigo(String Codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EntidadBancaria> findByNombre(String letraNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EntidadBancaria> findAll() {
        //Esto ya no es SQL es HQL (Hibernate)
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT entidadBancaria FROM EntidadBancaria entidadBancaria");
        List list = query.list();
        session.close();
        return list;
        
    }
}
