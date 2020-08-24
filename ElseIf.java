public class ElseIf {
    public void elseIF() {
        int puntuacion = 3;//declara una variable de tipo entero 
        char grupo ='C';//declara una variable de caracter  
        //valida una condicion, si 'puntuacion' es mayor a 5 imprime una serie de mensajes
        if (puntuacion >= 5) {
           System.out.println("¡Enhorabuena, has aprobado! ");
           System.out.println("Tu nota final es: " + puntuacion);
           grupo = 'A';
        }
        else { //imprime una serie de mensajes en caso de que no se cumpla la condicion evaluada anteriormente
           System.out.println("¡Lo Siento, has suspendido! ");
           System.out.println("Tu nota final es: " + puntuacion);
           grupo = 'B';
        
        }
        System.out.println("Formas parte del Grupo: "+ grupo);//muestra en que grupo se encuentra 
    }
}







