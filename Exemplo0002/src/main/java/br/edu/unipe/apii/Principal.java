package br.edu.unipe.apii;

public class Principal {

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        Pista pista = new Pista();

        System.out.println(pista.inciarCorrida(carro));
        System.out.println(pista.inciarCorrida(bicicleta));
    }
}
