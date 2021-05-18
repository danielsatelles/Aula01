import java.util.Scanner;

public class ProgramaNome {

	public static void main(String[] args) {
		//Scanner é um class que existe dentro da bibliota padrao do java que é responsável pro fazer leituras de texto
		Scanner leitor = new Scanner(System.in);
		String nome;
		
		System.out.println("Por favor, digite o seu nome:");
		//SCANNER LEITOR: é o objeto que recebe o valor digitado pelo usuario;
		nome = leitor.next();
		//nome = leitor.nextLine(); -- Para lermos texto com espaço utilizamos o nextLine.
	
		System.out.println("Que legal que o seu nome é: " + nome);
		
		System.out.println(nome + ", fico feliz que você esteja usando o meu programa");
		//Comando utilizado para finalizar o leitor após terminar de utiliza-lo.
		leitor.close();
	}

}
