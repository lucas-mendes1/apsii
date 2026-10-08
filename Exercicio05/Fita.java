public class Fita {

    public static final int NORMAL = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;

    // Refatoração 1: uso de final.
    // O título não é alterado após a criação da fita.
    private final String titulo;

    private int codigoDePreco;

    public Fita(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigoDePreco() {
        return codigoDePreco;
    }

    // Refatoração 2: Rename Method.
    // "setcodigoDePreco" foi ajustado para seguir o padrão camelCase.
    public void setCodigoDePreco(int codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }
}