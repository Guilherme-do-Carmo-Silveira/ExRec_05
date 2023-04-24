package controller;

public class DigitosController {

	public DigitosController() {
		super();
	}

	public int Digitos(String[] vt, int tamvt, int digitos) {
		if(tamvt == 0) {
			return digitos;
		}else {
			tamvt--;
			digitos++;
			return Digitos(vt, tamvt, digitos);
		}
	}
}
