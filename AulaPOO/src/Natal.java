
public class Natal extends Cartaoweb {
	
	public Natal(String destinatario) {
		super(destinatario);
	}
	
	public  String retornarMensagem(String  remetente) {
		return "feliz Natal" + getDestinatario() + " do seu amigo " + remetente;
		
	}
}
