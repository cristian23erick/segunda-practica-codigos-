/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_19;

import java.math.BigInteger;

/**
 *
 * @author user
 */
public class Ejercicio10_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Mostrar encabezado de tabla
		System.out.println("p       2^p - 1");

		// Display all Mersenne primes with p <= 31
		for (BigInteger p = new BigInteger("2"); 
			p.compareTo(new BigInteger("100")) <= 0; 
			p = p.add(new BigInteger("1"))) {
			if (isPrime(p)) {
				System.out.printf("%-3d", p);
				System.out.println("       " + mersennePrime(p));
			}
		}
	}

	/** Method mersennePrime finds and returns the mersenne prime of n */
	public static BigInteger mersennePrime(BigInteger n) {
		BigInteger two = new BigInteger("2");
		BigInteger x = new BigInteger("2");
		for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0; 
			i = i.add(new BigInteger("1"))) {
			x = x.multiply(two);
		}
		return x.subtract(new BigInteger("1")); 
	}

	/** Check whether number is prime */
	public static boolean isPrime(BigInteger n) {
		for (BigInteger d = new BigInteger("2"); 
			  d.compareTo(n.divide(new BigInteger("2"))) <= 0; 
			  d = d.add(new BigInteger("1"))) {
			if (n.remainder(d).compareTo(new BigInteger("0")) == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}
		return true; // Number is prime
    }
    
}
