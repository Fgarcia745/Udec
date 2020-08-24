/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Luis Laiton
 */
public class MatrizClass {
    //Método que imprime un array bidimensional de tipo int
    public void imprimeArray(int array[][], int fila, int colum){
        for (int fil = 0; fil < array.length; fil++) {
            System.out.println("");
            for (int col = 0; col < array.length; col++) {
                System.out.print("[" + array[fil][col] + "]\t");
            }
        }
    }
    //Método que carga una array bidimensional de tipo int con un rango de números
    public void cargarArray(int array[][], int minRandom, int maxRandom, int fila, int colum) {
        for (int fil = 0; fil < fila; fil++) {
            for (int col = 0; col < colum; col++) {
                array[fil][col] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
            }
        }
        imprimeArray(array, fila, colum);
    }
    //Ordenamiento por intercambio para una matriz
    public void ordIntercambioArray(int array[][], boolean ord, int fila, int colum) {
        for (int i = 0; i < fila; i++) {//ordena la matriz de abajo hacia arriba
            for (int j = 0; j < colum; j++) {
                for (int x = 0; x < fila; x++) {
                    for (int y = 0; y < colum; y++) {
                        if(ord == true){
                            if ((array[x][y] > array[i][j])) {
                                cambioDato(array,i,j,x,y);
                            }
                        }else{
                            if (array[x][y] < array[i][j]) {
                                cambioDato(array,i,j,x,y);
                            }
                        }
                    }
                }
            }
        }
        imprimeArray(array, fila, colum);
    }
    public void cambioDato(int array[][], int i, int j, int x, int y){
        int aux;
        aux = array[i][j];
        array[i][j] = array[x][y];
        array[x][y] = aux;
    }
    //Metodo que suma las posiciones de un array bidimencional de tipo int
    public int sumaArray(int array[][], int fila, int colum){
        int sumArray = 0;
        for (int i = 0; i < fila ; i++) {
            for (int j = 0; j < colum ; j++){
                sumArray = sumArray + array[i][j]; //sumArray+=array[i][j];
            }
        }   
        return sumArray;
    }
    //Ordenamiento por burbuja para una matriz
    public void burbuja(int A[][], int fila, int colum){
        int h;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < fila-i-1; j++) {
                for (int x = 0; x < colum; x++){
                    for (int y = 0; y < colum-x-1; y++){
                        if (A[j+1][y+1]<A[j][y]) {
                            h=A[j+1][y+1];
                            A[j+1][y+1]=A[j][y];
                            A[j][y]=h;
                        }
                    }
                }
            }
        }
        imprimeArray(A, fila, colum);
    }
    //Ordenamiento por insercion para una matriz
    public void Insercion(int A[][], int fila, int colum){
        int h,k,l;
        for (int i = 1; i < fila; i++) {
            for (int j = 1; j < colum; j++){
                k=A[i][j];
                h=i-1;
                l=j-1;
                while(h>=0 && l>=0 && k<A[h][l]){
                    A[h+1][l+1]=A[h][l];
                    h--; 
                    l--;
                }
                A[h+1][l+1]=k;
            }
        }
        imprimeArray(A, fila, colum);
    }
    //Ordenamiento por seleccion para una matriz
    public void Seleccion(int A[][], int fila, int colum){
         int k;
         for (int i = 0; i < fila-1; i++) {
             for (int j = i+1; j <= fila-1; j++) {
                for (int x = 0; x < colum-1; x++){
                    for (int y = x+1; y <= colum-1; y++){
                        if (A[j][y]<A[i][x]) {
                            if (j!=i && y!=x) {
                                k=A[j][y];
                                A[j][y]=A[i][x];
                                A[i][y]=k;
                            }
                        }
                    }
                }
             }
         }
         imprimeArray(A, fila, colum);
    }
    //Método que halle el numero mayor dentro de un array bidimencional
    
    public int numeroMayor(int array[][], int fila, int colum){
        int numMayor = array[0][0];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++) {
                if( numMayor < array[i][j]){
                    numMayor = array[i][j];
                }
            }
        }
        return numMayor;
    }
    //Método que halle el numero menor dentro de un array bidimencional 
    public int numeroMenor(int array[][], int fila, int colum){
        int numMenor = array[0][0];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colum; j++){
                if( numMenor > array[i][j]){
                    numMenor = array[i][j];
                }
            }
        }
        return numMenor;
    }
    public void ShellSort(int A[][], int fila, int colum){
         int aux;
         boolean cambios;
         for (int i = fila/2; i != 0; i/=2) {
             for (int x = colum/2; x !=0; x/=2){
                cambios= true;
                while(cambios){
                    cambios= false;
                    for (int j = i; j < fila; j++) {
                        for (int y = x; y < colum; y++){
                             if (A[j-i][y-x]>A[j][y]) {
                                 aux=A[j][y];
                                 A[j][y]=A[j-i][y-x];
                                 A[j-i][y-x]=aux;
                                 cambios=true;
                             }
                        }
                     }
                 }
             }
         }
         imprimeArray(A, fila, colum);
     }
}
