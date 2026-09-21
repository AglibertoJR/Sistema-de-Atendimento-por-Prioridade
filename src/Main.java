public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" SISTEMA DE ATENDIMENTO POR PRIORIDADE");
        System.out.println("======================================");

        // Criando as filas
        Fila filaAlta = new Fila();
        Fila filaMedia = new Fila();
        Fila filaNormal = new Fila();

        // Criando clientes
        Cliente joao = new Cliente("João", 1, 3);
        Cliente maria = new Cliente("Maria", 2, 1);
        Cliente pedro = new Cliente("Pedro", 3, 2);
        Cliente ana = new Cliente("Ana", 4, 1);
        Cliente carlos = new Cliente("Carlos", 5, 3);

        // ==============================
        // CADASTRO DOS CLIENTES
        // ==============================

        filaNormal.enfileirar(joao);
        filaAlta.enfileirar(maria);
        filaMedia.enfileirar(pedro);
        filaAlta.enfileirar(ana);
        filaNormal.enfileirar(carlos);

        // ==============================
        // TESTE DAS FILAS
        // ==============================

        System.out.println("\n===== FILA DE PRIORIDADE ALTA =====");
        filaAlta.mostrarFila();

        System.out.println("\n===== FILA DE PRIORIDADE MÉDIA =====");
        filaMedia.mostrarFila();

        System.out.println("\n===== FILA NORMAL =====");
        filaNormal.mostrarFila();

        // ==============================
        // TESTE DE TAMANHO
        // ==============================

        System.out.println("\n===== TESTE DE TAMANHO =====");

        System.out.println("Fila Alta: " + filaAlta.tamanho());
        System.out.println("Fila Média: " + filaMedia.tamanho());
        System.out.println("Fila Normal: " + filaNormal.tamanho());

        // ==============================
        // TESTE DO PRIMEIRO CLIENTE
        // ==============================

        System.out.println("\n===== TESTE PRIMEIRO CLIENTE =====");

        System.out.println("Próximo da fila Alta:");
        System.out.println(filaAlta.primeiro());

        // ==============================
        // TESTE DE ATENDIMENTO
        // ==============================

        System.out.println("\n===== ORDEM DE ATENDIMENTO =====");

        atender(filaAlta, filaMedia, filaNormal);
        atender(filaAlta, filaMedia, filaNormal);
        atender(filaAlta, filaMedia, filaNormal);
        atender(filaAlta, filaMedia, filaNormal);
        atender(filaAlta, filaMedia, filaNormal);

        // ==============================
        // TESTE FILA VAZIA
        // ==============================

        System.out.println("\n===== TESTE FILA VAZIA =====");

        System.out.println("Fila Alta vazia? " + filaAlta.estaVazia());
        System.out.println("Fila Média vazia? " + filaMedia.estaVazia());
        System.out.println("Fila Normal vazia? " + filaNormal.estaVazia());

        System.out.println("\nTodos os clientes foram atendidos.");
    }

    // ==========================================
    // MÉTODO PARA ATENDER O PRÓXIMO CLIENTE
    // ==========================================

    public static void atender(
            Fila filaAlta,
            Fila filaMedia,
            Fila filaNormal) {

        Cliente cliente;

        if (!filaAlta.estaVazia()) {

            cliente = filaAlta.desenfileirar();

        } else if (!filaMedia.estaVazia()) {

            cliente = filaMedia.desenfileirar();

        } else if (!filaNormal.estaVazia()) {

            cliente = filaNormal.desenfileirar();

        } else {

            System.out.println("Não existem clientes aguardando.");
            return;
        }

        System.out.println("Atendendo: " + cliente);
    }
}









