/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_06;

/**
 *
 * @author user
 */
public class Ejercicio10_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Crear un StackOfIntegers
		StackOfIntegers stack = new StackOfIntegers();

		//Encuentra y empuja todos los números primos a menos de 120 para apilar

		for (int i = 2; i < 120; i++) {
			if (isPrime(i))
				stack.push(i);
		}

		// Muestra todos los números primos menos de 120 en orden decreciente

		System.out.println(
			"\nAll the prime numbers less than 120 in decreasing order:");
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	/** Devuelve verdadero si n es un número primo */
	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) 
				return false;
		}
		return true;
    }
    
}
