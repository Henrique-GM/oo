/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

import entidades_Exercicio_3.Entidades_Exercicio_3;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author Henrique
 */
public class Exercicio_3 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Entidades_Exercicio_3 entidades_exercicio_3 = new Entidades_Exercicio_3();
        
        System.out.print("Nome: ");
        entidades_exercicio_3.nome = sc.nextLine();
        
        System.out.print("Salário bruto: ");
        entidades_exercicio_3.salarioBruto = sc.nextDouble();
        
        System.out.print("Imposto: ");
        entidades_exercicio_3.imposto = sc.nextDouble();
        
        System.out.print("A porcentagem que deseja aumentar: ");
        double porcentagem = sc.nextDouble();
        entidades_exercicio_3.acrescentarSalario(porcentagem);
        
        System.out.print("Dados atualizados: ");
        System.out.print(entidades_exercicio_3.toString());
        
        sc.close();
    }
}
