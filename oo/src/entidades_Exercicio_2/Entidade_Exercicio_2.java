/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_Exercicio_2;

/**
 *
 * @author Henrique
 */
public class Entidade_Exercicio_2 {

    public double largura;
    public double altura;

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return (2 * (largura + altura));
    }

    public double diagonal() {
        double diagonal = Math.sqrt(((altura * altura) + (largura * largura)));
        return diagonal;
    }
    
    public String toString() {
        return String.format("AREA = %.2f\n", area())
            +  String.format("PERIMETRO = %.2f\n", perimetro())
            +  String.format("DIAGONAL = %.2f\n", diagonal());            
    }
}
