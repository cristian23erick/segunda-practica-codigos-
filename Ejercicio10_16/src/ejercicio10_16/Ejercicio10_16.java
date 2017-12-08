/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_16;

import java.math.BigInteger;

/**
 *
 * @author user
 */
public class Ejercicio10_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int count = 0;
		BigInteger n = new BigInteger(
			"10000000000000000000000000000000000000000000000000");
		BigInteger z = new BigInteger("0");

		//System.out.println(n.remainder(new BigInteger("3")));
		while (count < 10) {
			if (z.compareTo(n.remainder(new BigInteger("2"))) == 0 || 
				z.compareTo(n.remainder(new BigInteger("3"))) == 0) {
				System.out.println(n);
				count++;
			}
			n = n.add(new BigInteger("1"));
		}
    }
    
}
