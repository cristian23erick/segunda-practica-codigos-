/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_15;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio10_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create 5 x 2 matrix
		double[][] points = new double[5][2];

		// Prompt the user to enter five points
		System.out.print("\nEnter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D r1 = MyRectangle2D.getRectangle(points);

		System.out.println("The bounding rectangle's center (" + r1.getX() + ", " + 
			r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
	
    }
    
}
