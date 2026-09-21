// =====================================================
// CLASSE FILA
// =====================================================

class Fila {

    private No inicio;
    private No fim;
    private int tamanho;

    public Fila() {

        inicio = null;
        fim = null;
        tamanho = 0;
    }

    // Adiciona um cliente ao final da fila
    public void enfileirar(Cliente cliente) {

        No novoNo = new No(cliente);

        if (inicio == null) {

            inicio = novoNo;
            fim = novoNo;

        } else {

            fim.proximo = novoNo;
            fim = novoNo;
        }

        tamanho++;
    }

    // Remove o primeiro cliente da fila
    public Cliente desenfileirar() {

        if (estaVazia()) {
            return null;
        }

        Cliente cliente = inicio.cliente;

        inicio = inicio.proximo;

        tamanho--;

        if (inicio == null) {
            fim = null;
        }

        return cliente;
    }

    // Consulta o primeiro cliente sem removê-lo
    public Cliente primeiro() {

        if (estaVazia()) {
            return null;
        }

        return inicio.cliente;
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {

        return inicio == null;
    }

    // Retorna a quantidade de clientes
    public int tamanho() {

        return tamanho;
    }

    // Exibe todos os clientes da fila
    public void mostrarFila() {

        if (estaVazia()) {

            System.out.println("Fila vazia.");
            return;
        }

        No atual = inicio;

        while (atual != null) {

            System.out.println(atual.cliente);

            atual = atual.proximo;
        }
    }
}