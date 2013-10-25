package com.fpmislata.banco.datos;

import com.fpmislata.banco.negocio.SucursalBancaria;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumno
 */
public class SucursalBancariaDAOImpHibernate extends GenericDAOImplHibernate<SucursalBancaria, Integer> implements SucursalBancariaDAO{

    public SucursalBancariaDAOImpHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
}
