package com.fpmislata.banco.datos;
import java.util.List;

public interface GenericDAOImplHibernate <T, ID>{ 
    public T read(ID id);
    public void insert (T t);    
    public void update (T t);
    public void delete (ID id);
    public List<T> findAll();
}
