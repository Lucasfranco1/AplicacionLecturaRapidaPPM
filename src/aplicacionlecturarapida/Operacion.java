/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionlecturarapida;

/**
 *
 * @author lucas
 */
public class Operacion {
    public int resultado;
    
    public void calcular(double palabras, double tiempo){
        double calculo=(60*(palabras/tiempo));
        resultado=(int)Math.round(calculo);
    }
}
