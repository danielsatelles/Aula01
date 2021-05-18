import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		//Criando uma vareavel capaz de receber valor numero com virgula
		double valor1;
		double valor2;
		double soma, subtracao, multiplicacao, divisao;
		System.out.println("Por favor, digite o primeiro valor:");
		valor1 = leitor.nextDouble();
		System.out.println("Por favor, digite o segundo valor:");
		valor2 = leitor.nextDouble();
		//Vareavel soma fazendo o calculo da vareavel valor1 + valor2 e salvando a soma
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		divisao = valor1 / valor2;
		multiplicacao = valor1 * valor2;
		
		System.out.println("Valor dos valores informados é: " + soma);
		System.out.println("A subtração entre os dois valores informados é: " + subtracao);
		System.out.println("A subtração entre os dois valores informados é: " + divisao);
		System.out.println("A subtração entre os dois valores informados é: " + multiplicacao);
		
		leitor.close();
	}

}
