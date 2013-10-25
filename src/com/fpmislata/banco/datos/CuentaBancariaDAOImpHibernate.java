/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.datos;

import com.fpmislata.banco.negocio.CuentaBancaria;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumno
 */
public class CuentaBancariaDAOImpHibernate extends GenericDAOImplHibernate<CuentaBancaria, Integer> implements CuentaBancariaDAO{

    public CuentaBancariaDAOImpHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
    
}
