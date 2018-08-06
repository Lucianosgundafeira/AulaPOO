
public class Aniversario extends Cartaoweb{
	
	public Aniversario(String  destinatario){
		super(destinatario);
	}
	
	
	public  String retornarMensagem(String  remetente) {
		return "feliz Aniversario" + getDestinatario() + " do seu amigo " + remetente;
		
	}

	
}


	
