// =====================================================
// CLASSE NÓ
// =====================================================

class No {

    Cliente cliente;
    No proximo;

    public No(Cliente cliente) {

        this.cliente = cliente;
        this.proximo = null;
    }
}
