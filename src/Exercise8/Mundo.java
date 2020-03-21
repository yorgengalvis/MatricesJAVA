/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8;

import java.util.ArrayList;

/**
 *
 * @author YorgenGalvis
 */
public class Mundo {
    private int[][] inventario=null;

    public Mundo() {
        this.inventario=new int[10][6];
    }
    
    public void llenar(){
    this.inventario[0][0]=2;this.inventario[0][1]=9;this.inventario[0][2]=5;this.inventario[0][3]=10;this.inventario[0][4]=2;this.inventario[0][5]=2;
    this.inventario[1][0]=0;this.inventario[1][1]=0;this.inventario[1][2]=5;this.inventario[1][3]=1;this.inventario[1][4]=2;this.inventario[1][5]=2;
    this.inventario[2][0]=0;this.inventario[2][1]=1;this.inventario[2][2]=5;this.inventario[2][3]=1;this.inventario[2][4]=2;this.inventario[2][5]=3;
    this.inventario[3][0]=0;this.inventario[3][1]=2;this.inventario[3][2]=0;this.inventario[3][3]=1;this.inventario[3][4]=2;this.inventario[3][5]=4;
    this.inventario[4][0]=0;this.inventario[4][1]=3;this.inventario[4][2]=0;this.inventario[4][3]=8;this.inventario[4][4]=2;this.inventario[4][5]=5;
    this.inventario[5][0]=0;this.inventario[5][1]=6;this.inventario[5][2]=0;this.inventario[5][3]=1;this.inventario[5][4]=2;this.inventario[5][5]=6;
    this.inventario[6][0]=3;this.inventario[6][1]=4;this.inventario[6][2]=0;this.inventario[6][3]=1;this.inventario[6][4]=2;this.inventario[6][5]=7;
    this.inventario[7][0]=11;this.inventario[7][1]=4;this.inventario[7][2]=0;this.inventario[7][3]=1;this.inventario[7][4]=2;this.inventario[7][5]=12;
    this.inventario[8][0]=0;this.inventario[8][1]=14;this.inventario[8][2]=0;this.inventario[8][3]=1;this.inventario[8][4]=2;this.inventario[8][5]=2;
    
    }
    
    public int[] marcasAgotadas(){
        int[] marcas=new int[cantidadAgotada()];
        int[] sumaDeMarcas=sumaPorMarca();
            for (int j = 0; j < sumaDeMarcas.length; j++) {
                for (int i = 0; i < marcas.length; i++) {
                    if(sumaDeMarcas[j]>=30){
                        marcas[i]=j;
                        
                    }
                }
            }
        
        return marcas;
    }
    
    public int cantidadAgotada(){
       int suma=0;
       int[] sumasMarcas=sumaPorMarca();
       for(int i=0;i<sumasMarcas.length;i++){
       if(sumasMarcas[i]>=30) suma++;
       }
       return suma;
   }
    public int[] sumaPorMarca(){
        int[] sumr=new int[10];
        for(int i=0;i<this.inventario.length;i++){
            int suma=0;
            for(int j=0;j<this.inventario[i].length;j++){
                suma+=this.inventario[i][j];
                sumr[i]=suma;
            }
        }
        return sumr;
    }
    
    
}
