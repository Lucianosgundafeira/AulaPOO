
public class ProdutoTest {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(123,"seu lunga",12.99,"materias de construçao");
		Livro l1 = new Livro (1234,"seu lunga",9.99,"101 lugares para fazer amor antes de morrer","mateus santos");
		System.out.println("o segmento do produto é "+ p1.getDescrição ());
		System.out.println("seja bem vindo a loja "+p1.getNomeLoja());
		System.out.println("o codigo de barra é "+p1.getCodigo());
		p1.setPreço(20);
		System.out.println(p1.getPreço());
		
		System.out.println("\n"+"o livro  é "+  l1.getDescrição ());
		System.out.println("seja bem vindo a loja "+l1.getNomeLoja());
		System.out.println("o codigo de barra é "+l1.getCodigo());
		System.out.println(l1.getPreço());
	
		if (p1.equals(l1)) {
			System.out.println("\n"+"os objetos sao iguais !");
		}else {
				System.out.println("\n"+"os objetos nao sao iguais !");
		}
	if (p1.equals(p1)) {
		System.out.println("\n"+"os objetos sao iguais !");
	}else {
			System.out.println("\n"+"os objetos nao sao iguais !");
	}
	System.out.println(p1.toString());
	
}
	
	

}