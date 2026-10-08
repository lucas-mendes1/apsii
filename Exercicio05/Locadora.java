public class Locadora {

    // Refatoração 1: Extract Method.
    // A criação e configuração dos objetos foi separada do main(),
    // reduzindo sua responsabilidade e facilitando a leitura.
    public static void main(String[] args) {
        Cliente cliente = criarCliente();

        System.out.println(cliente.extrato());
    }

    private static Cliente criarCliente() {
        Cliente cliente = new Cliente("Raul");

        Fita fita1 = new Fita("Matrix", Fita.NORMAL);
        Fita fita2 = new Fita("Toy Story", Fita.INFANTIL);
        Fita fita3 = new Fita("Oppenheimer", Fita.LANCAMENTO);

        // Refatoração 2: Rename Method.
        // "adicionaAluguel()" foi substituído por "adicionarAluguel()"
        // para tornar o nome mais claro e padronizado.
        cliente.adicionarAluguel(new Aluguel(fita1, 3));
        cliente.adicionarAluguel(new Aluguel(fita2, 4));
        cliente.adicionarAluguel(new Aluguel(fita3, 2));

        return cliente;
    }
}