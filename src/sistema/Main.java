package sistema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1- Cadastrar");
			System.out.println("2- Remover");
			System.out.println("3- Listar livros");
			System.out.println("4- Informações de cada Livro");
			
			
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
				System.out.println("Livro Fisico");
				System.out.println("Audio book");
				System.out.println("Ebook");
				String tipoLivro = scanner.nextLine();
				
				Livro livro = null; 
				
				if(tipoLivro.equalsIgnoreCase("Livro Fisico")) {
					System.out.println("Numero de páginas do livro:");
					int paginas = Integer.parseInt(scanner.nextLine());

					System.out.println("Digite o numero da estante");
					String numeroEstante = scanner.nextLine();
					
				livro = new LivroF(nome, autor, codigo, paginas, numeroEstante);
				}else if(tipoLivro.equalsIgnoreCase("Audio book")) {
					System.out.println("Qual é a duração do livro?");
					double duracao = Double.parseDouble(scanner.nextLine());
					
					System.out.println("Link para download do Audiobook: ");
					String link = scanner.nextLine();
				
					livro = new Audiobook(nome, autor, codigo, duracao, link);	
			}else if(tipoLivro.equalsIgnoreCase("Ebook")) {
				System.out.println("Qual é o numero de páginas do livro?");
				int ebookPaginas = Integer.parseInt(scanner.nextLine());
				
				System.out.println("Link para download do Ebook: ");
				String linkEbook = scanner.nextLine();
				
				livro = new Ebook(nome, autor, codigo, ebookPaginas, linkEbook);
			}else {
				
			}
					biblioteca.cadastrar(livro);
					break;
	    }
			case 2: {
				System.out.println("Informe o código do livro que deseja remover");
				scanner.nextLine();
				break;
			}
	  }
			
    }
  }
	
}
