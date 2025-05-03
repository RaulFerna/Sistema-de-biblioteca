package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList <Livro> listadeLivro = new ArrayList<Livro>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1- Cadastrar");
			System.out.println("2- Remover");
			System.out.println("3- Listar livros");
			System.out.println("1- Informações de cada Livro");
			
			
			int selecionar = Integer.parseInt(scanner.nextLine());
			
			
			switch (selecionar) {
			
			case 1: {
				System.out.println("Digite o nome do livro");
				String nome = scanner.nextLine();
				System.out.println("Digite o nome do autor");
				String autor = scanner.nextLine();
				System.out.println("Digite o ISBN do livro");
				String codigo = scanner.nextLine();
				System.out.println("Digite qual é o tipo de livro:");
				System.out.println("-Livro Fisico");
				System.out.println("-Audio book");
				System.out.println("-Ebook");
				String tipoLivro = scanner.nextLine();
				
				
				
			}
			
			}
		}

	}

}
