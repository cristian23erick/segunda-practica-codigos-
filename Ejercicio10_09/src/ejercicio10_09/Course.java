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
class Course {
       private String courseName;
	private String[] students = new String[1];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		// Aumenta automáticamente el tamaño de la matriz

		if (numberOfStudents == students.length) {
			String[] a = new String[students.length + 1];
			for (int i = 0; i < numberOfStudents; i++) {
				a[i] = students[i];
			}
			students = a;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	/** Eliminar un estudiante de un curso*/
	public void dropStudent(String student) {
		int index = findStudent(student);
		if (index >= 0) {
			dropStudent(index);
		}
		else {
			System.out.println(student + " is not in the course: " + courseName);
		}
	}

	/** eliminar estudiante */
	private void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		for (int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index) {
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numberOfStudents--;
	}

	/**elimina a todos los estudiantes del curso */
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}

	/** Devuelve el índice si se encuentra un alumno. De lo contrario devuelve -1 */
	private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
}
