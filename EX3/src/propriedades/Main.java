package propriedades;

import builders.RelatorioBuilder;
import propriedades.Relatorio;

public class Main{
    public static void main(String[] args) {
        Builder();
    }
    public static void Builder(){
        Relatorio avaliacao = new RelatorioBuilder()
                .setTitulo("Avaliação Trimestral")
                .setCorpo("Aprendeu sobre os princípios de S.O.L.I.D na matéria de programação 3 etc...")
                .setRodape("Faculdade UMFG")
                .build();

        Relatorio palestra = new RelatorioBuilder()
                .setTitulo("Palestra")
                .setCorpo("Introdução: Onde será apresentado o tema, o palestrante e a forma com que o relatório e o tema serão apresentados")
                .setRodape("Faculdade UMFG")
                .build();
        System.out.println(avaliacao.toString());
        System.out.println(palestra.toString());
    }


}