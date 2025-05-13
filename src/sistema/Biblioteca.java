package sistema;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList <Livro> listadeLivro = new ArrayList<Livro>();
	
	public void cadastrar(Livro dados) {
		if(dados != null) {
			listadeLivro.add(dados);
			System.out.println("Livro adicionado na lista com sucesso");
		} else {
			System.out.println("Dados incorretos. Por favor, tente novamente");
		}	
	}
	
	public void listarLivros() {
	    if (listadeLivro.isEmpty()) {
	        System.out.println("Nenhum livro cadastrado.");
	    } else {
	        System.out.println("Lista de livros cadastrados:");
	        for (Livro l : listadeLivro) {
	            System.out.println("Título: " + l.getTitulo() +
	                               ", Autor: " + l.getAutor() +
	                               ", Código: " + l.getCodigo());
	        }
	    }
	}
	
	public void removerLivro(String codigo) {
	    for (int i = 0; i < listadeLivro.size(); i++) {
	        Livro l = listadeLivro.get(i);
	        if (l.getCodigo().equals(codigo)) {
	            listadeLivro.remove(i);
	            System.out.println("Livro removido com sucesso: " + l.getTitulo());
	            return;
	        }
	    }
	    System.out.println("Livro com código " + codigo + " não encontrado.");
	}
	
	}
	
	

