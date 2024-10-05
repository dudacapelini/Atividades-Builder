package propriedades;

import builders.VeiculoBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Builder();
    }

    public static void Builder() {
        Veiculo carro = new VeiculoBuilder()
                .setTipo("Palio")
                .setCor("Prata")
                .setQuantidadeRodas(4)
                .build();

        Veiculo moto = new VeiculoBuilder()
                .setTipo("Biz")
                .setCor("Vermelha")
                .setQuantidadeRodas(2)
                .build();
        System.out.println(carro.toString());
        System.out.println(moto.toString());
    }
}