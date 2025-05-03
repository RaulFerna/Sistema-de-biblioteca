package sistema;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList <LivroF> listadeLivro = new ArrayList<LivroF>();
	
	public void Cadastrar(LivroF dados) {
		if(dados != null) {
			listadeLivro.add(dados);
			System.out.println("Livro adicionado na lista com sucesso");
		} else {
			System.out.println("Dados incorretos. Por favor, tente novamente");
		}	
	}
	
	
	
	
}
