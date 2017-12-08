/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_09;

/**
 *
 * @author user
 */
public class Ejercicio10_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Crear un curso
		Course math101 = new Course("math101");

		// Agrega tres estudiantes

		math101.addStudent("Mark");
		math101.addStudent("Tom");
		math101.addStudent("Joan");

		// eliminar un estudiante

		math101.dropStudent("Tom");

		// Muestra a los estudiantes en el curso

		System.out.println("\nThe students in the course " + 
			math101.getCourseName() + ":");
		String[] students = math101.getStudents();
		for (int i = 0; i < math101.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
    }
    
}
