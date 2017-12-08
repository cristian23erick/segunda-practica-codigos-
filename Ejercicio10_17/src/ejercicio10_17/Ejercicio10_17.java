/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_17;

import java.math.BigInteger;

/**
 *
 * @author user
 */
public class Ejercicio10_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Encuentra los primeros diez números cuadrados
	// que son mayores que Long.MAX_VALUE
		BigInteger i = new BigInteger(Long.MAX_VALUE + ""); 
		BigInteger end = i.add(new BigInteger("10"));

		//Mostrar resultados
		for (i = new BigInteger(Long.MAX_VALUE + ""); 
			i.compareTo(end) <= 0; 
			i = i.add(new BigInteger("1"))) {
			System.out.println(i.multiply(i)); 
		}		
    }
    
}
