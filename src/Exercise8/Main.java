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
public class Main {
    public static void main(String[] args){
        Mundo m=new Mundo();
        m.llenar();
        int[] resu=m.sumaPorMarca();
        for (int i = 0; i < resu.length; i++) {
            System.out.println("Marca "+(i+1)+": "+resu[i]);
        }
        int[] ago=m.marcasAgotadas();
        System.out.println("Las marcas agotada son: ");
        for (int i = 0; i < ago.length; i++) {
            System.out.println("Marca #"+(ago[i]+1));
        }
    }
}
