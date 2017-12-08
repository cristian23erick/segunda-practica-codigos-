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
public class BMI {
    private String nombre;
    private int años;
    private double peso; // en libras
    private double altura; //en pulgadas
    public static final double  KILOGRAMOS_POR_LIBRA=0.45359237;
    public static final double METROS_POR_PULGADA=0.0254;
    public static final int PULGADA_POR_PIE=12;

    public BMI(String nombre, int años, double peso, double altura) {
           this.nombre=nombre;
           this.años=años;
           this.peso=peso;
           this.altura=altura;
    }
    
    public BMI(String nombre, double altura, double peso){
               this(nombre, 20,altura,peso);
        
    }
    
    
    
     public BMI(String nombre,int años, double altura, double pies,double pulgadas){
               this(nombre, años,altura,pulgadas+pies*12);
     }
     
     public double getBMI(){
         double bmi=altura*KILOGRAMOS_POR_LIBRA/
                 ((peso*METROS_POR_PULGADA)*(peso*METROS_POR_PULGADA));
         return Math.round(bmi*100)-100.0;
     }
     
     public String getStatus(){
         double bmi=getBMI();
         if(bmi<18.5)
             return "peso bajo";
         else if(bmi<25)
             return "Normal";
         else if (bmi<30)
             return "Exceso de peso";
         else 
             return "obeso";
     }
     
     public String getNombre(){
         return nombre;
     }
     public int getAños(){
         return años;
     }
     public double getAltura(){
     return altura;
     }
     public double getPeso(){
         return peso;
     }
    
}
