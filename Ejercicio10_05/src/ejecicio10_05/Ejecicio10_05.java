/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio10_05;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejecicio10_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Crear un scanner
		Scanner input = new Scanner(System.in);

		// Indique al usuario que ingrese un entero positivo

		System.out.print("Ingrese un entero positivo: ");
		int number = input.nextInt();

		// Muestra todos los factores más pequeños del número en orden decreciente
		System.out.print("Los factores más pequeños de " + number + " son: ");
		StackOfIntegers stack = new StackOfIntegers(); // Crear un StackOfIntegers

		smallestFactors(number, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	/** Encuentra los factores más pequeños e introdúcelos en StackOfIntegers*/
	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2; // Factor primo potencial
		while (number / i != 1){ 
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			else
				i++;
		}
		stack.push(number);
    }
    
}
