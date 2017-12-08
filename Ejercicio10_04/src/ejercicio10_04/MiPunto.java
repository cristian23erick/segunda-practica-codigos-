/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_04;

/**
 *
 * @author user
 */
class MiPunto {
    //campos de informacion
    private double x;
    private double y;
    
    //crear un contructor punto
    MiPunto(){
        this(0,0);
    }
    
    //Construye un punto con coordenadas especificadas
    MiPunto(double x, double y){
        this.x=x;
        this.y=y;
    }

    MiPunto(int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //retorna x
    public double getX(){
        return x;
    }
    //retorna 
    public double getY(){
        return x;
    }
      public double distancia(MiPunto miPunto) {
   	return Math.sqrt(Math.pow(miPunto.getX() - x, 2) + 
   			 Math.pow(miPunto.getY() - y, 2));
   }
     public double distancia(double x, double y) {
 		return distancia(new MiPunto(x, y));
     }
    
}
