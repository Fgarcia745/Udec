public class Tiempo {
     public void tiempo() {
         float fah = 86;
         System. out. println( fah + " grados Fahrenheit son . . .");
         // Para convertir de Fahrenheit a Celsius
         // Empezamos por restar 32
         fah = fah - 32;
         // Dividimos el resultado por 9
         fah = fah / 9;
         // Multiplicamos el resultado por 5
         fah = fah * 5;
         System. out.println(fah + " grados Celsius\n");
         float cel = 33;
         System. out.println(cel + " grados Celsius son . . . ") ;
         // Para convertir de Fahrenheit a Celsius
         // Empezamos por restar 9
         cel = cel * 9;
         // Dividimos el resultado por 5
         cel = cel / 5;
         // A�adimos 32 al resultado
         cel = cel + 32;
         System. out.println(cel + " grados Fahrenheit") ;
     }
 }