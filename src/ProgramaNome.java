import java.util.Scanner;

public class ProgramaNome {

	public static void main(String[] args) {
		//Scanner � um class que existe dentro da bibliota padrao do java que � respons�vel pro fazer leituras de texto
		Scanner leitor = new Scanner(System.in);
		String nome;
		
		System.out.println("Por favor, digite o seu nome:");
		//SCANNER LEITOR: � o objeto que recebe o valor digitado pelo usuario;
		nome = leitor.next();
		//nome = leitor.nextLine(); -- Para lermos texto com espa�o utilizamos o nextLine.
	
		System.out.println("Que legal que o seu nome �: " + nome);
		
		System.out.println(nome + ", fico feliz que voc� esteja usando o meu programa");
		//Comando utilizado para finalizar o leitor ap�s terminar de utiliza-lo.
		leitor.close();
	}

}
