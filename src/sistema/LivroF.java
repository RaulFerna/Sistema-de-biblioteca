package sistema;


public class LivroF extends Livro{

 private int numeroPagina;

 private String numeroEstante;



 public LivroF(String codigo, String titulo, String autor, int numeroPagina, String numeroEstante){

super(codigo,titulo, autor);

 this.numeroPagina = numeroPagina;

 this.numeroEstante = numeroEstante;
 }
 


public int getNumeroPagina() {

	return numeroPagina;

}



public String getNumeroEstante() {

	return numeroEstante;

}


@Override

public void exibirDados() {
	
	super.exibirDados();
	
	System.out.println("Numero de páginas do livro: " + numeroPagina);

	System.out.println("Encontra-se na estante de número: " + numeroEstante);

}

 

 

 

}