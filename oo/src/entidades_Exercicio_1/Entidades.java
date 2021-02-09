/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_Exercicio_1;

/**
 *
 * @author Henrique
 */
public class Entidades {
    
    public String name;
    public double preco;
    public int quantidade;
    
    public double valorTotalDoEstoque() {
        return preco * quantidade;
    }
    //diferenciando ambiguidades
    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }
    
    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    } 
    
    public String toString() {
         return name
             + ", $"
             + String.format("%.2f", preco)
             + ", "
             + quantidade
             + " unidades, Total: $ "
             + String.format("%.2f", valorTotalDoEstoque());
    }
}
