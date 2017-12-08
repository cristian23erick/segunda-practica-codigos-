/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_18;

import java.math.BigInteger;

/**
 *
 * @author user
 */
public class Ejercicio10_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Encuentra cinco números primos más grandes que Long.MAX_VALUE

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		int count = 0; // Cuenta el número de primos
		final int NUMBER_OF_PRIMES = 5;

		System.out.println();
		while (count < NUMBER_OF_PRIMES) {
			number = number.add(new BigInteger("1"));
			if (isPrime(number)){
				count++;
				System.out.println(number);
			}
		}
	}

	/**  Devuelve verdadero si el número es primo*/
	public static boolean isPrime(BigInteger n) {
		for (BigInteger d = new BigInteger("2"); 
			  d.compareTo(n.divide(new BigInteger("2"))) <= 0; 
			  d = d.add(new BigInteger("1"))) {
			if (n.remainder(d).compareTo(new BigInteger("0")) == 0) {
				return false;
			}
		}
		return true;
    }
    
}
