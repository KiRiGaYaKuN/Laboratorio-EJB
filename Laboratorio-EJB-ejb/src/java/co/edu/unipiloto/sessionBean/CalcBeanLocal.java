/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBean;

import javax.ejb.Local;

/**
 *
 * @author cristian-patino
 */
@Local
public interface CalcBeanLocal {

    Integer sumar(int x, int y);

    Integer Resta(int x, int y);

    Integer Multiplicar(int x, int y);

    Integer Dividir(int x, int y);

    Integer Modulo(int x, int y);

    Double Cuadrado(int x, int y);



    
}
