/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author cristian-patino
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer sumar(int x, int y) {
        return x+y;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer Resta(int x, int y) {
        return x-y;
    }

    @Override
    public Integer Multiplicar(int x, int y) {
        return x*y;
    }

    @Override
    public Integer Dividir(int x, int y) {
        return x/y;
    }

    @Override
    public Integer Modulo(int x, int y) {
        return x%y;
    }

    @Override
    public Double Cuadrado(int x, int y) {
        return Math.pow(x, y);
    }

   
    
    
}
