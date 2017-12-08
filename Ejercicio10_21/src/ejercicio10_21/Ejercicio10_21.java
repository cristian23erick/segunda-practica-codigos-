/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_21;

import java.math.BigInteger;

/**
 *
 * @author user
 */
public class Ejercicio10_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int count = 0;
		BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger five = new BigInteger("5");
		BigInteger six = new BigInteger("6");
		BigInteger zero = new BigInteger("0");

		// Display results
		System.out.println("\nFirst ten numbers greater than Long.MAX_VALUE" +
			" that are divisible by 5 or 6:");
		while (count < 10) {
			n = n.add(new BigInteger("1"));
			if ((n.remainder(five)).compareTo(zero) == 0 || 
				 (n.remainder(six)).compareTo(zero) == 0) {
				System.out.println(n);
				count++;
			}
		}
    }
    
}
