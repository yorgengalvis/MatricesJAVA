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
public class Main {
    public static void main(String[] args){
        Mundo m=new Mundo();
        m.llenar();
        int[] resu=m.sumaPorMarca();
        for (int i = 0; i < resu.length; i++) {
            System.out.println("Marca "+(i+1)+": "+resu[i]);
        }
        ArrayList<Integer> ago=m.marcasAgotadas();
        System.out.println("Las marcas agotada son: ");
        for (int i = 0; i < ago.size(); i++) {
            System.out.println("Marca #"+((ago.get(i)+1)));
        }
        System.out.println("La marca menos vendida fue la marca #"+(m.menosVendida()+1));
        System.out.println("Mes con mayor venta para la Marca 3 fue "+m.getNameMes((m. mesMasVentaMarca(3)+1)));
        System.out.println("Mes con mayor venta para la Marca 6 fue "+m.getNameMes((m. mesMasVentaMarca(6)+1)));
        System.out.println("Total ventas en los seis meses: "+m.totalVentas());
        System.out.println("Mes con mayor venta: "+m.getNameMes((m.mesMayorVenta()+1)));
        
    }
}
