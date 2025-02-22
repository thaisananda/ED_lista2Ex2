package Exercicios;

import javax.swing.JOptionPane;

import controller.Controller08;

public class Exercicio08 {

	public static void main (String[] args) {
		
		Controller08 contarDigito = new Controller08();
		
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 999999: "));
        int digito = Integer.parseInt(JOptionPane.showInputDialog("Digite o dígito que deseja contar (0 a 9): "));

        // Validação da entrada
		
		if (n1 < 10 || n1 > 999999 || digito < 0 || digito > 9) {
            JOptionPane.showMessageDialog(null, "Entradas inválidas! Verifique os valores e tente novamente.");
            return;
        }
		
		 int resultado = contarDigito.QuantDigitos(n1, digito);
		 
		 JOptionPane.showMessageDialog(null, "O dígito " + digito + " aparece " + resultado + " vezes no número " + n1 + ".");

	}
}
