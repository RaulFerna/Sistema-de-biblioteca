package sistema;

public class Audiobook extends Livro {
	
	private int duracaoAudio;
	private String narrador;
	private String linkAudio;
	

	public Audiobook(String codigounico, String titulo, String autor, int duracaoAudio, String narrador, String linkAudio) {
		super(codigounico, titulo, autor);
		this.duracaoAudio = duracaoAudio;
		this.narrador = narrador;
		this.linkAudio = linkAudio;
	}
	
	public int getDuracaoAudio() {
		return duracaoAudio;
	}
	
	public String getNarrador() {
		return narrador;
	}
	
	public String getLinkAudio() {
		return linkAudio;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Dados do livro");

		System.out.println();

		System.out.println("Codigo ISBN: " + getCodigo());

		System.out.println("Titulo do livro: " + getTitulo());

		System.out.println("Nome do narrador: " + narrador);

		System.out.println("Duração do Livro: " + duracaoAudio);
		
		System.out.println("Link para download do Audiobook: " + linkAudio);
		
	}

}
