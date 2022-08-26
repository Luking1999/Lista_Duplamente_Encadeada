import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		listaDupla lista = new listaDupla();
		
	

		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(4);
		lista.inserir(3);
		lista.inserir(0);
		//lista.imprimir();
		System.out.println("\n       >>      "+lista.listaVazia()+"      << \n");
		lista.imprimir();

	}

}
