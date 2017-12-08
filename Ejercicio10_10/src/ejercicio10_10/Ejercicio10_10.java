/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_10;

/**
 *
 * @author user
 */
public class Ejercicio10_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //Crear un objeto Queue

		Queue queue = new Queue();

		// Agrega 20 números del 1 al 20 en la cola

		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);
		}

		// Elimina estos números y los muestra

		while (!queue.empty()) {
			System.out.print(queue.dequeue() + " ");
		}
		System.out.println();
    }
    
}
