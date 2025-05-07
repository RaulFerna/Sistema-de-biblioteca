package sistema;

public class Audiobook extends Livro {
	
	private double duracaoAudio;
	private String linkAudio;
	

	public Audiobook(String codigounico, String titulo, String autor, double duracaoAudio, String linkAudio) {
		super(codigounico, titulo, autor);
		this.duracaoAudio = duracaoAudio;
		this.linkAudio = linkAudio;
	}
	
	public double getDuracaoAudio() {
		return duracaoAudio;
	}
	
	
	public String getLinkAudio() {
		return linkAudio;
	}
	
	@Override
	public void exibirDados() {
		
		super.exibirDados();
		System.out.println("Duração do Livro: " + duracaoAudio);
		
		System.out.println("Link para download do Audiobook: " + linkAudio);
		
	}

}
