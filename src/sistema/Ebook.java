package sistema;

public class Ebook extends Livro {

	private int numeroPagina;
	private String link;
	
	public Ebook(String codigounico, String titulo, String autor, int numeroPagina, String link) {
		super(codigounico, titulo, autor);
		this.numeroPagina = numeroPagina;
		this.link = link;
	}
	
	public int getNumeroPagina() {
		return numeroPagina;
	}
	
	public String getLink() {
		return link;
	}
	
	@Override
	public void exibirDados() {

		super.exibirDados();
		
		System.out.println("Numero de páginas do livro: " + getNumeroPagina());
		
		System.out.println("Link para download do livro: " + link);

	}
	
	
}
