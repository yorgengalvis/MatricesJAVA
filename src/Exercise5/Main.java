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
public class Main {
    public static void main(String[] args){
        Mundo mu=new Mundo();
        mu.llenarVector();
        mu.cantTrabajoresPorDia();
        int[] sue=mu.cantTrabajoresPorDia();
        System.out.println("Cantidad trabajadores que laboraron cada dia");
        for (int i = 0; i < sue.length; i++) {
            System.out.println("Para el dia "+mu.getDia((i+1))+" :"+sue[i]);
        }
        System.out.println("=======================");
        System.out.println("Departamento con mayor asistencia es el departamento #"+mu.mayorAsistenciaDepartamento());
        System.out.println("Cantidad que asistieron el sabado: "+mu.cantidadTrabajadoresdia(6));
        System.out.println("Cantidad que asistieron el Domingo: "+mu.cantidadTrabajadoresdia(7));
        System.out.println("Departamento con menor asistencia es el departamento #"+mu.menorAsistenciaDepartamento());
    }
}
