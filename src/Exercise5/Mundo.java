/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5;

/**
 *
 * @author YorgenGalvis
 */
public class Mundo {
    public int[][] recursoHumano=new int[8][7];

    public Mundo() {
    }
    
    public void llenarVector(){
this.recursoHumano[0][0]=2;this.recursoHumano[0][1]=4;this.recursoHumano[0][2]=2;this.recursoHumano[0][3]=5;this.recursoHumano[0][4]=2;this.recursoHumano[0][5]=6;this.recursoHumano[0][6]=4;
this.recursoHumano[1][0]=2;this.recursoHumano[1][1]=5;this.recursoHumano[1][2]=5;this.recursoHumano[1][3]=1;this.recursoHumano[1][4]=5;this.recursoHumano[1][5]=4;this.recursoHumano[1][6]=9;
this.recursoHumano[2][0]=4;this.recursoHumano[2][1]=5;this.recursoHumano[2][2]=0;this.recursoHumano[2][3]=2;this.recursoHumano[2][4]=3;this.recursoHumano[2][5]=5;this.recursoHumano[2][6]=4;
this.recursoHumano[3][0]=5;this.recursoHumano[3][1]=7;this.recursoHumano[3][2]=4;this.recursoHumano[3][3]=2;this.recursoHumano[3][4]=1;this.recursoHumano[3][5]=12;this.recursoHumano[3][6]=4;
this.recursoHumano[4][0]=8;this.recursoHumano[4][1]=7;this.recursoHumano[4][2]=4;this.recursoHumano[4][3]=1;this.recursoHumano[4][4]=2;this.recursoHumano[4][5]=2;this.recursoHumano[4][6]=15;
this.recursoHumano[5][0]=5;this.recursoHumano[5][1]=6;this.recursoHumano[5][2]=5;this.recursoHumano[5][3]=2;this.recursoHumano[5][4]=0;this.recursoHumano[5][5]=5;this.recursoHumano[5][6]=11;
this.recursoHumano[6][0]=1;this.recursoHumano[6][1]=1;this.recursoHumano[6][2]=2;this.recursoHumano[6][3]=4;this.recursoHumano[6][4]=1;this.recursoHumano[6][5]=24;this.recursoHumano[6][6]=12;
this.recursoHumano[7][0]=1;this.recursoHumano[7][1]=2;this.recursoHumano[7][2]=5;this.recursoHumano[7][3]=1;this.recursoHumano[7][4]=2;this.recursoHumano[7][5]=5;this.recursoHumano[7][6]=1;
    }
    
    public int menorAsistenciaDepartamento(){
        int[] sua=getSumaPorDepartamentos();
        int pos=-1;
        int menor=sua[0];
        for (int i = 0; i < sua.length; i++) {
            if(sua[i]<menor){
                menor=sua[i];
                pos=i;
            }
        }
        pos++;
        return pos;
    }
    
    public int cantidadTrabajadoresdia(int pos){
        int suma=0;
        pos--;
        for (int i = 0; i < this.recursoHumano.length; i++) {
            suma+=this.recursoHumano[i][pos];
        }
        return suma;
    }
    
    public int mayorAsistenciaDepartamento(){
        int[] sua=getSumaPorDepartamentos();
        int mayor=sua[0];
        int pos=-1;
        for (int i = 0; i < sua.length; i++) {
            if(mayor<sua[i]){
                mayor=sua[i];
                pos=i;
            }
        }
        pos++;
        return pos;
    }
    
    public int[] getSumaPorDepartamentos(){
        int[] sumaPo=new int[8];
        for (int i = 0; i < this.recursoHumano.length; i++) {
            int suma=0;
            for (int j = 0; j < this.recursoHumano[i].length; j++) {
               suma +=this.recursoHumano[i][j];
               sumaPo[i]=suma;
            }
        }
        return sumaPo;
    }
    
    public int[] cantTrabajoresPorDia(){
        int[] nul=new int[7];
        for (int i = 0; i < this.recursoHumano[0].length; i++) {
            int suma=0;
            for (int j = 0; j < this.recursoHumano.length; j++) {  
                suma+=this.recursoHumano[j][i];
                nul[i]=suma;
            }
        }
        return nul;
    }
    
    public String getDia(int dia){
        String ms="";
        switch (dia) {
            case 1: ms = "Lunes";
            break;
            case 2: ms = "Martes";
            break;
            case 3: ms = "Miercoles";
            break;
            case 4: ms = "Jueves";
            break;
            case 5: ms = "Viernes";
            break;
            case 6: ms = "Sabado";
            break;
            case 7: ms = "Domingo";
            break;
        }
        return ms;
    }
    
    
    
    
    
}
