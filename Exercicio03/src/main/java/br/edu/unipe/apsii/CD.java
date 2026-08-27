package br.edu.unipe.apsii;

public class CD extends Produto
implements InfoGerais{
    private int numFaixas;

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    @Override
    public void exibeInformações() {
        System.out.println("Nome: " + getNome());
        System.out.println("Número de faixas: " + getNumFaixas());
    }
}
