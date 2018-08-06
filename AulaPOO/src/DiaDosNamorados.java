
public class DiaDosNamorados extends Cartaoweb {
	
	public DiaDosNamorados(String  destinatario){
		super(destinatario);
	}
	
	
	public  String retornarMensagem(String  remetente) {
		return "feliz Dia dos Namorados" + getDestinatario() + " do seu amigo " + remetente;
		
	}

	
}



