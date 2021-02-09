/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import entidades_Exercicio_1.Entidades;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Entidades entidades = new Entidades();
        
        System.out.println("Entre com os dados produto: ");
        
        System.out.print("Nome: ");
        entidades.name = sc.nextLine();       
        System.out.print("Preço: ");
        entidades.preco = sc.nextDouble();      
        System.out.print("Quantidade no estoque: ");
        entidades.quantidade = sc.nextInt();
        
        System.out.println();
        System.out.println("Informações do produto: " + entidades.toString());
                
        System.out.println();
        System.out.print("Entre com o número de produtos para ser adicionado no estoque: ");
        int quantidade = sc.nextInt();
        entidades.adicionarProdutos(quantidade);
        
        System.out.println();
        System.out.println("Informações do produto: " + entidades.toString());
        
        System.out.println();
        System.out.print("Entre com o número de produtos para ser removidos do estoque: ");
        quantidade = sc.nextInt();
        entidades.removerProdutos(quantidade);
        
        System.out.println();
        System.out.println("Informações do produto: " + entidades.toString());
        
        sc.close();
    }
}
