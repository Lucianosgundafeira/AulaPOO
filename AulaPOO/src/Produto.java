
public class Produto {
	private int codigo;
	 private String nomeLoja;
	 private double preço;
	 private String descrição;
	
	 public Produto(int codigo, String nomeLoja, double preço, String descrição) {
		super();
		this.codigo = codigo;
		this.nomeLoja = nomeLoja;
		this.preço = preço;
		this.descrição = descrição;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nomeLoja=" + nomeLoja + ", preço=" + preço + ", descrição=" + descrição
				+ "]";
	}
	 
	 
	 
}
