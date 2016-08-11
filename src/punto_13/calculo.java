/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_13;

import java.util.Scanner;

/**
 *
 * @author Vanegas
 */
public class calculo {
    Scanner lector = new Scanner(System.in);
    private int serie,a=0,b=1,i,n;
    
    public void calcular(){
        System.out.println("Ingrese N: ");
        n = lector.nextInt();
        
    for(i=1;i<=n;i++){
        serie=a+b;
        b=a;
        a=serie;
        System.out.println(""+serie);
    }
    }
}
