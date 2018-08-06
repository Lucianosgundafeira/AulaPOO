
public class Livro extends Produto{
	
	private String autor;

	public Livro(int codigo, String nomeLoja, double preço, String descrição, String autor) {
		super(codigo, nomeLoja, preço, descrição);
		this.autor=autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
