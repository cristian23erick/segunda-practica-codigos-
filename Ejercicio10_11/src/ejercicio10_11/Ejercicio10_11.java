/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_11;

/**
 *
 * @author user
 */
public class Ejercicio10_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Create a Circle2D object
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		// Display results
		System.out.println("Circle1 area: " + c1.getArea()); 
		System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
		System.out.println(
			"Does circle1 contain the point (3, 3)? " + c1.contains(3, 3)); 
		System.out.println(
			"Does circle1 contain the circle centered at (4, 5) and radius 10.5? " 
			+ c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(
			"Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " 
			+ c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
    
}
