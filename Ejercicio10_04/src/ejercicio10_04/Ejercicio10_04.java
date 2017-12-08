/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_04;

/**
 *
 * @author user
 */
public class Ejercicio10_04 {

    //metodo main
    public static void main(String[] args) {
        //creat 2 puntos
        MiPunto punto1=new MiPunto();
        MiPunto punto2=new MiPunto(10,30.5);
        
        //muestra la distancia entre el punto1 y punto2
        System.out.println("La distancia entre ("
                + punto1.getX()+ ", " + punto1.getY() + ") y ("
                + punto2.getX()+ ", " + punto2.getY()+ ") es: " +
                punto1.distancia(punto2));
        
    }
    
}
