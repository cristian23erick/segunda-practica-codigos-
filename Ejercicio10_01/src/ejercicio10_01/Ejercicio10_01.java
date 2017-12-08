/********************************************************************************************
*(La clase Time) Diseña una clase llamada Time. La clase contiene:                          *
* ■ Los campos de datos hora, minuto y segundo que representan una hora.                    *
* ■ Un constructor sin argumentos que crea un objeto Time para la hora actual. (Los         *
* los valores de los campos de datos representarán la hora actual.)                         *
* ■ Un constructor que construye un objeto Time con un tiempo transcurrido especificado     *
* desde la medianoche, 1 de enero de 1970, en milisegundos. (Los valores de los datos       *
* los campos representarán esta vez.)                                                       *
* ■ Un constructor que construye un objeto Time con la hora, minutos, especificados         *
*   y segundo.                                                                               *
* ■ Tres métodos getter para los campos de datos hora, minuto y segundo,                     *
* respectivamente.                                                                           *
* ■ Un método llamado setTime (long elapseTime) que establece un nuevo horario               *
* para el objeto que usa el tiempo transcurrido. Por ejemplo, si el tiempo transcurrido es   *
* 555550000 milisegundos, la hora es 10, el minuto es 19, y el segundo es                    *
* 10.                                                                                        *
*                                                                                            *
* Dibuja el diagrama UML para la clase y luego implementa la clase. Escribir                 *
* un programa de prueba que crea dos objetos de tiempo (usando nueva hora () y nueva         *
* Hora (555550000)) y muestra su hora, minuto y segundo en el formato                        *
* hora: minuto: segundo.                                                                     *
* (Sugerencia: los dos primeros constructores extraerán la hora, el minuto y el segundo      *
* del tiempo transcurrido. Para el constructor no-arg, la hora actual puede ser              *
* obtenido utilizando System.currentTimeMillis (), como se muestra en el Listado 2.7,        *
* ShowCurrentTime.java)
************
 * 
 */
package ejercicio10_01;

public class Ejercicio10_01 {
          /**Main metodo*/
    public static void main(String[] args) {
//crear 2 objetos time
           Time time1=new Time();
           Time time2=new Time(555555000);
           
           // Mostrar objetos de hora, hora, minuto y 
          // segundo en el formato hora: minuto: segundo
          System.out.println(time1.getHour() + ":" + time1.getMinute() +
                           ":" + time1.getSecond());
          System.out.println(time2.getHour() + ":" + time2.getMinute() + 
                            ":" + time2.getSecond());
       
    }
    
}
