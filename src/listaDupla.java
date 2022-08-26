
public class listaDupla {
	private No Referencia;
	
	public listaDupla() {
		this.setReferencia(null);
	}

	public No getReferencia() {
		return Referencia;
	}

	public void setReferencia(No referencia) {
		Referencia = referencia;
	}

	public void inserir(int info) {
		if(listaVazia()) {
			No no = new No(Referencia, info, null);
			this.setReferencia(no);
			return;
		}
		No no = new No(null, info, Referencia);
		this.getReferencia().setPre(no);
		this.setReferencia(no);
		
	}

	public boolean listaVazia() {
		return this.getReferencia() == null;
	}

	public void imprimir() {
		if (listaVazia()) {
			System.out.println("Lista vazia!");
			return;
		}
		No moonWalk = null;

		for (No aux = this.Referencia; aux != null; aux = aux.getNext()) {
			if(aux.getPre() != null) {
				System.out.print("<Ant>   " +  aux.getPre().getInfo()+"   ");
			}else {
				System.out.print("<Ant>  " +  aux.getPre()+" ");
			}
			System.out.print("<Info>   " + aux.getInfo()+"   ");
			if(aux.getNext() != null) {
				System.out.print("<Next>   " + aux.getNext().getInfo() + "\n");
			}else {
				System.out.println("<Next>  " + aux.getNext() + "\n");
			}
			
			moonWalk = aux;
		}
		/*for (No aux = moonWalk; aux != null; aux = aux.getPre()) {
			if(aux.getPre() != null) {
				System.out.print("<Ant>   " +  aux.getPre().getInfo()+"   ");
			}else {
				System.out.print("<Ant>  " +  aux.getPre()+" ");
			}
			System.out.print("<Info>   " + aux.getInfo()+"   ");
			if(aux.getNext() != null) {
				System.out.print("<Next>   " + aux.getNext().getInfo() + "\n");
			}else {
				System.out.println("<Next>  " + aux.getNext());
			}

		}*/
		
	}

	public void remove(int info) {
		if (listaVazia()) {
			System.out.println("Lista vazia!");
			return;
		}
		No first = this.Referencia;
		if(first.getInfo() == info && first.getNext() != null) {
			this.setReferencia(first.getNext());
			first.getNext().setPre(null);
			return;
		}else if(first.getInfo() == info && first.getNext() == null) {
			this.setReferencia(null);
			return;
		}
		for (No aux = this.Referencia; aux != null; aux = aux.getNext()) {
			if(aux.getInfo() == info && aux.getNext() != null){
				aux.getPre().setNext(aux.getNext());
				aux.getNext().setPre(aux.getPre());
				return;
			}else if(aux.getInfo() == info && aux.getNext() == null) {
				aux.getPre().setNext(null);
				return;
			}
		}

	}
	public void busca(int info) {
		int i = 0;
		if (listaVazia()) {
			System.out.println("\n   <Posicao>   : ["+-1+"] :   <Posicao>");
			return;
		}
		No first = this.Referencia;
		if(first.getInfo() == info) {
			System.out.println("\n   <Posicao>   : ["+i+"] :   <Posicao>");
			return;
		}
		for (No aux = this.Referencia; aux != null; aux = aux.getNext()) {
			if(aux.getInfo() == info){
				System.out.println("\n   <Posicao>   : ["+i+"] :   <Posicao>	");
				return;
			}
			i++;
		}
		System.out.println("\n   <Posicao>   : ["+-1+"] :   <Posicao>");

	}
}
