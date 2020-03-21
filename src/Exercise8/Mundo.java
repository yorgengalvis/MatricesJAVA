/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8;

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
    this.inventario[0][0]=2;this.inventario[0][1]=4;this.inventario[0][2]=5;this.inventario[0][3]=10;this.inventario[0][4]=2;this.inventario[0][5]=2;
    this.inventario[1][0]=0;this.inventario[1][1]=4;this.inventario[1][2]=5;this.inventario[1][3]=1;this.inventario[1][4]=2;this.inventario[1][5]=2;
    this.inventario[2][0]=0;this.inventario[2][1]=4;this.inventario[2][2]=5;this.inventario[2][3]=1;this.inventario[2][4]=2;this.inventario[2][5]=12;

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
