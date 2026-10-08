import java.util.*;

public class Cliente {

    private String nome;
    private final List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Refatoração 1: Rename Method.
    // O nome foi ajustado para representar melhor a ação realizada.
    public void adicionarAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        double valorTotal = 0;
        int pontosDeAlugadorFrequente = 0;

        String resultado = "Registro de Alugueis de " + getNome() + "\n";

        for (Aluguel aluguel : alugueis) {

            // Refatoração 2: Extract Method.
            // O cálculo foi separado para reduzir a complexidade do método extrato().
            double valorCorrente = calcularValorAluguel(aluguel);

            // Refatoração 3: Extract Method.
            // A regra de pontuação foi isolada para facilitar a manutenção.
            pontosDeAlugadorFrequente += calcularPontos(aluguel);

            resultado += "\t" + aluguel.getFita().getTitulo()
                    + "\t" + valorCorrente + "\n";

            valorTotal += valorCorrente;
        }

        resultado += "Valor total devido: " + valorTotal + "\n";
        resultado += "Você ganhou " + pontosDeAlugadorFrequente
                + " pontos de alugador frequente";

        return resultado;
    }

    private double calcularValorAluguel(Aluguel aluguel) {
        double valor = 0;

        switch (aluguel.getFita().getCodigoDePreco()) {

            case Fita.NORMAL:
                valor += 2;

                if (aluguel.getDiasAlugados() > 2) {
                    valor += (aluguel.getDiasAlugados() - 2) * 1.5;
                }
                break;

            case Fita.LANCAMENTO:
                valor += aluguel.getDiasAlugados() * 3;
                break;

            case Fita.INFANTIL:
                valor += 1.5;

                if (aluguel.getDiasAlugados() > 3) {
                    valor += (aluguel.getDiasAlugados() - 3) * 1.5;
                }
                break;
        }

        return valor;
    }

    private int calcularPontos(Aluguel aluguel) {
        int pontos = 1;

        if (aluguel.getFita().getCodigoDePreco() == Fita.LANCAMENTO
                && aluguel.getDiasAlugados() > 1) {
            pontos++;
        }

        return pontos;
    }
}