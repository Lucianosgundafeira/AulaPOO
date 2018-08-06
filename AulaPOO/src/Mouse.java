
public class Mouse extends Produto {

	private String tipo;

	public Mouse(int codigo, String nomeLoja, double preço, String descrição, String tipo) {
		super(codigo, nomeLoja, preço, descrição);
		this.tipo = tipo;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
