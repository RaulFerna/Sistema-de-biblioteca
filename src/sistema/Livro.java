package sistema;

public class Livro {
	
	 private String codigounico;

	 private String titulo;

	 private String autor;
	 
		public Livro(String codigo, String titulo, String autor) {
			super();
			this.codigounico = codigo;
			this.titulo = titulo;
			this.autor = autor;
		}
		public String getCodigo() {
			return codigounico;
		}
		public void setCodigo(String codigo) {
			this.codigounico = codigo;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}

		public void exibirDados() {

			System.out.println("Dados de livros");

			System.out.println();

			System.out.println("Codigo ISBN: " + codigounico);

			System.out.println("Titulo do livro: " + titulo);

			System.out.println("Nome do autor: " + autor);
		}
		
}
