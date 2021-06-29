import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//inserindo os valores
		System.out.print("Insira o primeiro valor: ");
		double primeiroValor = leitor.nextDouble();
		System.out.print("Insira o segundo valor: ");
		double segundoValor = leitor.nextDouble();
		
		//menu de operações
		System.out.println("Escolha a operação a ser feita: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
		int operacao = leitor.nextInt();
		
		//atribuição de método à variável
		double somar = soma(primeiroValor, segundoValor);
		double subtrair = subtracao(primeiroValor, segundoValor);
		double multiplicar = multiplicacao(primeiroValor, segundoValor);
		double dividir = divisao(primeiroValor, segundoValor);
		
		//realizar a operação selecionada
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
				System.out.println("Operação inválida.");
		}
	}
	//operação de soma
	public static double soma(double x, double y) {
		return x + y;
	}
	//operação subtração
	public static double subtracao(double x, double y) {
		return x - y;
	}
	//operação multiplicação
	public static double multiplicacao(double x, double y) {
		return x * y;
	}
	//operação divisão
	public static double divisao(double x, double y) {
		if (y <= 0) {
			System.out.println("Insira um divisor maior que 0");
		}
		return x / y;
	}
}
