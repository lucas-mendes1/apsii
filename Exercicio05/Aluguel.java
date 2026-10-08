public class Aluguel {

    // Refatoração 1: Rename Variable e Rename Method.
    // Os nomes foram ajustados para maior clareza e consistência.
    private int diasAlugados;

    // Refatoração 2: uso de final.
    // O atributo não é alterado após a criação do objeto.
    private final Fita fita;

    public Aluguel(Fita fita, int diasAlugados) {
        this.fita = fita;
        this.diasAlugados = diasAlugados;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugados() {
        return diasAlugados;
    }
}