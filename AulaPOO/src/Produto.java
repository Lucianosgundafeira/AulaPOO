
public class Produto {
	private int codigo;
	 private String nomeLoja;
	 private double pre�o;
	 private String descri��o;
	
	 public Produto(int codigo, String nomeLoja, double pre�o, String descri��o) {
		super();
		this.codigo = codigo;
		this.nomeLoja = nomeLoja;
		this.pre�o = pre�o;
		this.descri��o = descri��o;
		
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

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
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
		return "Produto [codigo=" + codigo + ", nomeLoja=" + nomeLoja + ", pre�o=" + pre�o + ", descri��o=" + descri��o
				+ "]";
	}
	 
	 
	 
}
