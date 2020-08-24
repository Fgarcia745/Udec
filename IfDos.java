public class IfDos {
    public void ifdos() {
        int puntuacion = 7;//declara una variable de tipo entero 'int' asignada con 7 
        if (puntuacion == 7) {//valida si la variable 'puntuacion' es igual al entero 7, he imprime un mensaje 
           System.out.println("¡Tienes un notable! ");
        }//de no cumplir la validacion anterior continua con la siguiente linea
        if (puntuacion == 3) {//valida si la variable 'puntuacion' es igual al entero 3, he imprime un mensaje
           System.out.println("¡Tienes un insuficiente ! ");
        }

        System. out.println("Nota final: " + puntuacion);//imprime que nota final a obtenido de acuerdo a las validaciones anteriores
    }
}


