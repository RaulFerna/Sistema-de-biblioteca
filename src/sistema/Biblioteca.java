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
	
	public void listarLivros(String codigo) { 
		for(int i = 0; i < this.listadeLivro.size(); i++) {
			Livro l = this.listadeLivro.get(i); 
			if(l.getCodigo().equals(codigo)) {
				System.out.println("Livro" + l.getTitulo()+", " + "autor: " + l.getAutor()+ ", " + "código: "+l.getCodigo());
			}else {
				System.out.println("Cadastre o livro primeiro");
			}
		}
	}
	
	/*private Livro verificaExistencia(String codigo) {
		for(int i = 0; i < this.listadeLivro.size(); i++) {
			Livro l = this.listadeLivro.get(i); 
			if(l.getCodigo().equals(codigo)) {
				return l; 
			}
		}
		return null ;
	}*/
	
	
}
