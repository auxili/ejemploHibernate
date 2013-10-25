package com.fpmislata.banco.datos;

import com.fpmislata.banco.negocio.EntidadBancaria;
import org.hibernate.SessionFactory;

public class EntidadBancariaDAOImpHibernate extends GenericDAOImplHibernate<EntidadBancaria, Integer> implements EntidadBancariaDAO {

    public EntidadBancariaDAOImpHibernate(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
}
