package calculadora;

public class Calculadora {
	private int num1;
	private int num2;

	
	public Calculadora(int a, int b) {
		System.out.println("Hola");
		num1 = a;
		num2 = b;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	public int resta() {
		int resul = num1 - num2;
		return resul;
	}

	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	public int divide() {
		int resul = num1 / num2;
		return resul;
	}
	

	//El m�todo raizNdeX, que calcular� la ra�z en�sima de X por Gaby.
	public double raizNdeX(int x ) {
		double resultado=Math.pow(x, 10);
		return resultado;
	}
	
	//Metodo elaborado por Adrian
	public double elevaXaN(double x, double n) {
		
		double resultado = Math.pow(x, n);
		
		return resultado;
	}

}
