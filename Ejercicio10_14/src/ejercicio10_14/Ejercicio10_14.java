/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_14;

/**
 *
 * @author user
 */
public class Ejercicio10_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Create two MyDate objects
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(34355555133101L);

		System.out.println("Date1: " + date1.getMonth() + "/" + date1.getDay() + 
			"/" + date1.getYear());
		System.out.println("Date2: " + date2.getMonth() + "/" + date2.getDay() + 
			"/" + date2.getYear());
    }
    
}
