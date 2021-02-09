/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

import entidades_Exercicio_2.Entidade_Exercicio_2;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_2 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Entidade_Exercicio_2 entidade_exercicio_2 = new Entidade_Exercicio_2();
        
        System.out.print("Digite a largura: ");
        entidade_exercicio_2.largura = sc.nextDouble();
        
        System.out.print("Digite à altura: ");
        entidade_exercicio_2.altura = sc.nextDouble();
        
        System.out.println();
        System.out.println(entidade_exercicio_2.toString());
        
        sc.close();
    }
}
