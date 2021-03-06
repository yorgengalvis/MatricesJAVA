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
    this.inventario[6][0]=3;this.inventario[6][1]=4;this.inventario[6][2]=0;this.inventario[6][3]=1;this.inventario[6][4]=2;this.inventario[6][5]=9;
    this.inventario[7][0]=11;this.inventario[7][1]=4;this.inventario[7][2]=0;this.inventario[7][3]=1;this.inventario[7][4]=2;this.inventario[7][5]=12;
    this.inventario[8][0]=12;this.inventario[8][1]=14;this.inventario[8][2]=0;this.inventario[8][3]=1;this.inventario[8][4]=2;this.inventario[8][5]=2;
    
    }
    
    public ArrayList<Integer> marcasAgotadas(){
        ArrayList<Integer> marcas=new ArrayList<Integer>();
        int[] sumaDeMarcas=sumaPorMarca();
            for (int j = 0; j < sumaDeMarcas.length; j++) {
                if(sumaDeMarcas[j]>=30){
                    marcas.add(j);
                }
            }
        return marcas;
    }
    public String getNameMes(int mes){
        String ms="";
        switch(mes){
            case 1: ms="Enero";
            break;
            case 2: ms="Febrero";
            break;
            case 3: ms="Marzo";
            break;
            case 4: ms="Abril";
            break;
            case 5: ms="Mayo";
            break;
            case 6: ms="Junio";
            break;
        }
        return ms;
    }
    
    public int mesMayorVenta(){
        int[] smeses=this.sumaPorMeses();
        int mayor=smeses[0];
        int pos=0;
        for (int i = 0; i < smeses.length; i++) {
            if(mayor<smeses[i]){mayor=smeses[i]; pos=i;}
        }
        return pos;
    }
    
    public int[] sumaPorMeses(){
        int[] suma=new int[6];
        for (int i = 0; i < 6; i++) {
            int sumas=0;
            for (int j = 0; j < 10; j++) {
                sumas+=this.inventario[j][i];
                suma[i]=sumas;
            }
        }
        return suma;
    }
    
    public int totalVentas(){
        int suma=0;
        for (int i = 0; i < this.inventario.length; i++) {
           for (int j = 0; j < this.inventario[0].length; j++) {
               suma+=this.inventario[i][j];
           } 
        }
        return suma;
    }
    public int mesMasVentaMarca(int marca){
        marca-=1;
        int mayor=this.inventario[marca][0];
        int pos=0;
        for (int i = 0; i < this.inventario[marca].length; i++) {
            if(mayor<this.inventario[marca][i]){mayor=this.inventario[marca][i]; pos=i;}
        }
        return pos;
    }
    
    
    public int menosVendida(){
        int[] suma=sumaPorMarca();
        int menor=suma[0];
        for (int i = 0; i < suma.length; i++) {
            if(menor<suma[i])menor=i;
        }
        return menor;
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
