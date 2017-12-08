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
class Queue {
        //Campos de información

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;

	/**Construya un objeto Queue con capacidad predeterminada */
	Queue() {
		elements = new int[DEFAULT_CAPACITY];
	}

	/**Agrega v en la cola*/
	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}

	/** Quita y vuelve a colocar el elemento de la cola */
	public int dequeue() {
		int v = elements[0];
		int[] temp = new int[elements.length];
		System.arraycopy(elements, 1, temp, 0, size);
		elements = temp;
		size--;
		return v;
	}

	/** Devuelve true si la cola está vacía*/
	public boolean empty() {
		return size == 0;
	}

	/** Tamaño de devolución */
	public int getSize() {
		return size;
	}
    
}
