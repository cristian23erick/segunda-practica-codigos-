/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio10_05;

/**
 *
 * @author user
 */
class StackOfIntegers {
     private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	/** Construye una pila con la capacidad predeterminada 16 */
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}

	/** Construye una pila con la capacidad máxima especificada */
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

        /** Insertar un nuevo entero en la parte superior de la pila */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	/** Retorna y elimina el elemento superior de la pila */

	public int pop() {
		return elements[--size];
	}

	/**Devuelve el elemento superior de la pila*/
	public int peek() {
		return elements[size - 1];
	}

	/** Comprobar si la pila está vacía */
	public boolean empty() {
		return size == 0;
	}

	/** Devuelve la cantidad de elementos en la pila */
	public int getSize() {
		return size;
    
}
        }
        
