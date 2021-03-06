/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.datos;

import com.fpmislata.banco.negocio.CuentaBancaria;
import com.fpmislata.banco.negocio.SucursalBancaria;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface SucursalBancariaDAO extends GenericDAO<SucursalBancaria, Integer>{
    public List<SucursalBancaria> findByCodigo(String codigo);
    public List<SucursalBancaria> findByNombre(String letraNombre);
}
