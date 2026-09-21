// =====================================================
// CLASSE CLIENTE
// =====================================================

class Cliente {

    private String nome;
    private int senha;
    private int prioridade;

    public Cliente(String nome, int senha, int prioridade) {

        this.nome = nome;
        this.senha = senha;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getSenha() {
        return senha;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDescricaoPrioridade() {

        if (prioridade == 1) {
            return "ALTA";

        } else if (prioridade == 2) {
            return "MEDIA";

        } else {
            return "NORMAL";
        }
    }

    @Override
    public String toString() {

        return "Senha: " + senha +
                " | Nome: " + nome +
                " | Prioridade: " + getDescricaoPrioridade();
    }
}
