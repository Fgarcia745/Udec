public class IfBloque {
    //adfged
    public void ifbloque() {
        int puntuacion = 7;//declara una variable tipo entero 'int' asignada con 7
        char grupo ='C';//declara una varivle de tipo caracter 'char' asignada con 'C'
        if (puntuacion >= 5) {//valida la condicion de la variable 'puntuacion' e imprime una serie de mensajes 
           System.out.println("¡Enhorabuena, has aprobado! ");
           System.out.println("Tu nota final es: " + puntuacion);
           grupo = 'A';//reasigna la variable 'grupo' con el caracter 'A'
        }
        System.out.println("Formas parte del Grupo: "+ grupo);//muestra en que grupo se encuentra 
    }
}







