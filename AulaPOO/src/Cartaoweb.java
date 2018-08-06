
public abstract class Cartaoweb {

	public Cartaoweb(String destinatario) {
		super();
		this.destinatario = destinatario;
	}
	
	protected String destinatario;
	public  abstract String retornarMensagem(String  remetente);
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
}
