/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.datos;

import com.fpmislata.banco.negocio.MovimientoBancario;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumno
 */
public class MovimientoBancarioDAOImpHibernate extends GenericDAOImplHibernate<MovimientoBancario, Integer> implements MovimientoBancarioDAO{

    public MovimientoBancarioDAOImpHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
}
