/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

import entidades_Exercicio_4.Entidades_Exercicios_4;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Entidades_Exercicios_4 entidades_exercicios_4 = new Entidades_Exercicios_4();

        System.out.print("Digite o nome do aluno(a): ");
        entidades_exercicios_4.nome = sc.nextLine();

        System.out.print("Digite a primeira nota do trimestre: ");
        entidades_exercicios_4.primeiraNota = sc.nextDouble();

        System.out.print("Digite a segunda nota do trimestre: ");
        entidades_exercicios_4.segundaNota = sc.nextDouble();

        System.out.print("Digite a terceira nota do trimestre: ");
        entidades_exercicios_4.terceiraNota = sc.nextDouble();

        System.out.print(entidades_exercicios_4.toString());

        if (entidades_exercicios_4.notaFinal() < 60.0) {
            System.out.println("\nREPROVADO");

            System.out.print(entidades_exercicios_4.toString2());
            
        } else {
            System.out.println("APROVADO");
        }

        sc.close();
    }

}
