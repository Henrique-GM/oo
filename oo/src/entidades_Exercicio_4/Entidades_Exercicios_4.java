/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_Exercicio_4;

/**
 *
 * @author Henrique
 */
public class Entidades_Exercicios_4 {

    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;

    public double notaFinal() {
        return primeiraNota + segundaNota + terceiraNota;
    }

    public double notasPerdidas() {
        return 60.0 - (primeiraNota + segundaNota + terceiraNota) ;
    }

    public String toString() {
        return String.format("NOTA FINAL = %.2f", notaFinal());     
    }
    
    public String toString2() {
         return String.format("NOTAS PERDIDAS = %.2f", notasPerdidas());
    }
}
    