
public class Livro extends Produto{
	
	private String autor;

	public Livro(int codigo, String nomeLoja, double pre�o, String descri��o, String autor) {
		super(codigo, nomeLoja, pre�o, descri��o);
		this.autor=autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
