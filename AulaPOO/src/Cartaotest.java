
public class Cartaotest {

	public static void main(String[] args) {
		
		Natal n1 = new Natal(" Leonardo!"); 
		Aniversario a1 = new Aniversario(" Leonardo!");
		DiaDosNamorados ddn1 = new DiaDosNamorados(" Leonardo!");
		
		System.out.println(n1.retornarMensagem("Ramon"));
		System.out.println(a1.retornarMensagem(" Ramon"));
		System.out.println(ddn1.retornarMensagem(" Ramon"));
		
		

	}

}
