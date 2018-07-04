/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseprimitiva;

/**
 *
 * @author PC
 */
public class ClasePrimitiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte variableByte = 100;
        short variableShort = 250; //lowerCarmelCase 
        double variableDouble = 0.5;
        float decimales2 = 0.5f;
        float decimales3 = (float)0.5;//cast
        char arroba = '@';
        char letraA = 65;
        boolean verdadero = true;
        boolean falso = false;
        
        int uno = 1;
        int dos = 2;
        int suma = uno + dos;
        uno = dos % 2 == 0 ? 1 : 0;//operador ternario
        
        int[][] matriz = new int[4][4];
        //llenado de la matriz
        
        for(int i=0; i<matriz[0].length; i++){
            for(int j=0; j<matriz[0].length; j++){
                 if((i==0 || i==3) && j==0){
                     matriz[i][j] = 1; 
                 }else if((i==0 || i==3) && j== 3){
                     matriz[i][j] = 4; 
                 }else if((i==1 || i==2) && j== 1){
                     matriz[i][j] = 2;
                 }else if((i==1 || i==2) && j== 2){
                     matriz[i][j] = 3;
                 }else{
                     matriz[i][j] = 0;
                 }
            }
        }
        //impresion
        for(int i=0; i<matriz[0].length; i++){
            for(int j=0; j<matriz[0].length; j++){
                 System.out.print(matriz[i][j]);
                 System.out.print(' ');
            }
            System.out.println("");
        }
        
        System.out.println("La suma es");
        System.out.println(suma);
    }
    
}
