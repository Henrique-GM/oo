/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_Exercicio_3;

/**
 *
 * @author Henrique
 */
public class Entidades_Exercicio_3 {
    
    public String nome;
    public double salarioBruto;
    public double imposto;
    
    public double salarioLiquido() {
        return salarioBruto - imposto;
    }
    
    public void acrescentarSalario(double porcentagem) {
        salarioBruto +=  salarioBruto * porcentagem / 100.0; 
    }
    
    public String toString() {
        return nome
            + ", $" + String.format("%.2f", salarioLiquido());
    }
}
