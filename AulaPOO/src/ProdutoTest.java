
public class ProdutoTest {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(123,"seu lunga",12.99,"materias de constru�ao");
		Livro l1 = new Livro (1234,"seu lunga",9.99,"101 lugares para fazer amor antes de morrer","mateus santos");
		System.out.println("o segmento do produto � "+ p1.getDescri��o ());
		System.out.println("seja bem vindo a loja "+p1.getNomeLoja());
		System.out.println("o codigo de barra � "+p1.getCodigo());
		p1.setPre�o(20);
		System.out.println(p1.getPre�o());
		
		System.out.println("\n"+"o livro  � "+  l1.getDescri��o ());
		System.out.println("seja bem vindo a loja "+l1.getNomeLoja());
		System.out.println("o codigo de barra � "+l1.getCodigo());
		System.out.println(l1.getPre�o());
	
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