package ado_2;



public class Lista_2 {

	
	private No inicio; // primeiro elemento da lista

	private int tamanho = 0;

	public void geraLista() { // gera a lista null

		inicio = null;

	}

	public void adiciona(String num) {

		No novo = new No(); // obj do tipo Nodo

		novo.setDado(num);;
		novo.setProximo(inicio); // define o proximo elemeto apontando para null
		inicio = novo; // recebe os valores do obj criado apontando para o novo NO

		this.tamanho++;

	}

	public int obterTamanho() {

		return this.tamanho;

	}

	public boolean isEmpty() { // verifica se a lista ligada esta vazia

		return inicio == null;

	}

	public void removeInicio() {

		if (!isEmpty()) {

			this.inicio = inicio.getProximo();

		} else {

			System.out.println("Não ha elementos na lista");

		}

	}

	public void imprimeLista() {

		for (No n = inicio; n != null; n = n.getProximo()) {
			System.out.println(n.getDado());

		}

	}

	public No busca(String elemento) { // outro exemplo de busca

		
		
		
		for (No no = inicio; no != null; no = no.getProximo()) {

			if (no.getDado().equals(elemento)) {// se o elemento for igual ao dado do nó
				return no; // encontrou o elemento
			}

		}
		return null;

	}

	public void free() { // metodo que libera a lista(exclui tds os elementos)

		while (inicio != null) {

			No tmp = inicio.getProximo(); // criando variavel do tipo nodo recendo o prox
			inicio = null; // inicio da lista recebe null
			inicio = tmp; // o proximo tbm sera null

		}

	}

	public void adicionaOrdenado(String elemento) {

		No anterior = null;
		String valor = "";
		No n;

		
		
		for (n = inicio; n != null && valor.compareToIgnoreCase(n.getDado()) < valor.compareToIgnoreCase(elemento) ; n = n.getProximo()) {
			anterior = n; // a cada laço ordena os valores da lista 

		}

		No novo = new No(); // cria o ob do tipo no
		novo.setDado(elemento); // add o elemento

		if (anterior == null) { 
			novo.setProximo(inicio); // novo aponta para null
			inicio = novo; // inicio passa apontar para o novo NO 

		} else {
			novo.setProximo(anterior.getProximo());
			anterior.setProximo(novo);

		}

		tamanho++;
		
	}

	public void remover(String elemento) {

		No anterior = null;
		No n = inicio;

		while (n != null && n.getDado() != elemento) {
			anterior = n;
			n = n.getProximo();

		}

		if (n == null) {

			return;
		}

		if (anterior == null) {
			inicio = n.getProximo();

		} else {

			anterior.setProximo(n.getProximo());

		}

	}
	
}
