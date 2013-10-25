/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.datos;

import com.fpmislata.banco.negocio.MovimientoBancario;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface MovimientoBancarioDAO extends GenericDAO<MovimientoBancario, Integer>{
    public List<MovimientoBancario> findByCodigo (String codigo);
    public List<MovimientoBancario> findByNombre (String LetraNombre);
    
}
