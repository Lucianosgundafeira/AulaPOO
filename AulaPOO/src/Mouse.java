
public class Mouse extends Produto {

	private String tipo;

	public Mouse(int codigo, String nomeLoja, double pre�o, String descri��o, String tipo) {
		super(codigo, nomeLoja, pre�o, descri��o);
		this.tipo = tipo;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
