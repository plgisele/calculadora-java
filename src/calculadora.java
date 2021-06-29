import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//inserindo os valores
		System.out.print("Insira o primeiro valor: ");
		double primeiroValor = leitor.nextDouble();
		System.out.print("Insira o segundo valor: ");
		double segundoValor = leitor.nextDouble();
		
		//menu de opera��es
		System.out.println("Escolha a opera��o a ser feita: \n 1 - Soma \n 2 - Subtra��o \n 3 - Multiplica��o \n 4 - Divis�o");
		int operacao = leitor.nextInt();
		
		//atribui��o de m�todo � vari�vel
		double somar = soma(primeiroValor, segundoValor);
		double subtrair = subtracao(primeiroValor, segundoValor);
		double multiplicar = multiplicacao(primeiroValor, segundoValor);
		double dividir = divisao(primeiroValor, segundoValor);
		
		//realizar a opera��o selecionada
		switch(operacao) {
			case 1:
				System.out.println(somar);
				break;
			case 2:
				System.out.println(subtrair);
				break;
			case 3:
				System.out.println(multiplicar);
				break;
			case 4:
				System.out.println(dividir);
				break;
			default:
				System.out.println("Opera��o inv�lida.");
		}
	}
	//opera��o de soma
	public static double soma(double x, double y) {
		return x + y;
	}
	//opera��o subtra��o
	public static double subtracao(double x, double y) {
		return x - y;
	}
	//opera��o multiplica��o
	public static double multiplicacao(double x, double y) {
		return x * y;
	}
	//opera��o divis�o
	public static double divisao(double x, double y) {
		if (y <= 0) {
			System.out.println("Insira um divisor maior que 0");
		}
		return x / y;
	}
}
