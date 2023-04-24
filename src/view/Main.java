package view;

import controller.DigitosController;

public class Main {

	public static void main(String[] args) {
		
		int digitos = 0;
		
		DigitosController control = new DigitosController();
		
		int tamanho = (int) (Math.random() * 1000001 ) + 1;
		String valor = Integer.toString(tamanho);
		String [] vt = valor.split("");
		int tamvt = vt.length;

		int resultado = control.Digitos(vt, tamvt, digitos);
		System.out.println("O valor é: " + valor + "\nQuantidade de digitos: " + resultado);
	}
}