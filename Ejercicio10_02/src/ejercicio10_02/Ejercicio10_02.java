/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_02;

/**
 *
 * @author user
 */
public class Ejercicio10_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BMI bmi1=new BMI("Kim Yam ",18,145,5,10);
        System.out.println("El BMI para " +bmi1.getNombre() + "es "
                + bmi1.getBMI() + " " + bmi1.getStatus());
        
        BMI bmi2=new BMI("Susan King ",215,70);
        System.out.println("El BMI para " + bmi2.getNombre()+ "es "
                 +bmi2.getBMI()+ " " + bmi2.getStatus());
    } 
    
}
