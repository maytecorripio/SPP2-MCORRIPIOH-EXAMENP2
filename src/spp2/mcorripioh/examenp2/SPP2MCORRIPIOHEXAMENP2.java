/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.examenp2;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2MCORRIPIOHEXAMENP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz= new int [5][5];
        int minimo;
        double promedio;
        matriz=llenarMatriz();
        promedio= obtenerPromedio(matriz);
        minimo= obtenerMinimo(matriz);
        System.out.println("Promedio = " + promedio + "minimo= " + minimo);
    }
    
    public static int[][] llenarMatriz(){
        int[][] m = new int [5][5];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j]= solicitarEntero();
            }
        }
        return m;
    }
    
    public static int solicitarEntero(){
        Scanner kb= new Scanner (System.in);
        int n=0;
        boolean flag=true;
        do{
            System.out.println("Introduce un entero");
            try{
               n=kb.nextInt();
               flag=false;
            }catch (Exception ex){
                System.out.println("Vuelve a intentarlo");
                kb.next();
            }
        }while(flag);
        return n;
    }
    
    public static double obtenerPromedio(int[][]matriz){
        int promedio, suma=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                suma= suma + matriz[i][j];
            }
        }
        promedio= suma/matriz.length*matriz.length;
        return promedio;
    }
    public static int obtenerMinimo(int[][]matriz){
        int minimo= matriz[0][0];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j]<minimo){
                    minimo=matriz[i][j];
                }
            }
        }
        return minimo;
    }
}
