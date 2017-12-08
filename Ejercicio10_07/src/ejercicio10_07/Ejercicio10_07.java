/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_07;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio10_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // Crear un Scanner
		Scanner input = new Scanner(System.in);

		// Crea diez cuentas en un array
		Account[] accounts = new Account[10];

		// Inicializar cuentas con saldo
		initialBalance(accounts);
		
		// Una vez que el sistema comienza, no se detendrá
		do {
			// Indicar al usuario que ingrese una identificación
			System.out.print("Enter an id: ");
			int id = input.nextInt();

			if (isValidID(id, accounts)) {
				int choice;
				do {	
		// Obtener la elección del usuario
			choice = displayMainMenu(input);
			if (isTransaction(choice)) {
			executeTransaction(choice, accounts, id, input);
			}
		} while (choice != 4); // Si 4 sale del menú principal
			}
	// Una vez que salga, el sistema solicitará una identificación nuevamente
		} while (true); 
	}

	/** Initialize accounts with balance of 100 */
	public static void initialBalance(Account[] a) {
		int initialBalance = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = new Account(i, initialBalance);
		}
	}

	/** Return true if choice is a transaction */
	public static boolean isTransaction(int choice) {
		return choice > 0 && choice < 4;
	}

	/** Return true if ID is valid */
	public static boolean isValidID(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId())
				return true;
		}
		return false;
	}

	/** Display main menu */
	public static int displayMainMenu(Scanner input) {
		System.out.print(
			"\nMain menu\n1: check balance\n2: withdraw" +
			"\n3: deposit\n4: exit\nEnter a choice: ");
		return input.nextInt();
	}

	/** Execute a Transaction */
	public static void executeTransaction(
		int c, Account[] a, int id, Scanner input) {
		switch (c) {
			case 1: // Viewing the current balance
					  System.out.println("The balance is " + a[id].getBalance());
					  break;
			case 2: // Withdraw money
					  System.out.print("Enter an amount to withdraw: "); 
					  a[id].withdraw(input.nextDouble());
					  break;
			case 3: // Deposit money
					  System.out.print("Enter an amount to deposit: "); 
					  a[id].deposit(input.nextDouble());
		}
	}

    }