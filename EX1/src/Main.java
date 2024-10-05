import builder.PizzaBuilder;
import propriedades.Pizza;

public class Main{
        public static void main(String[] args) {
            comBuilder();
        }
        public static void comBuilder(){
            Pizza peperoni = new PizzaBuilder()
                    .setMassa("Napolitana")
                    .setTamanho("Pequena")
                    .setIngrediente("Calabresa")
                    .build();

            Pizza calabresa = new PizzaBuilder()
                    .setMassa("Siciliana")
                    .setTamanho("Grande")
                    .setIngrediente("Frango")
                    .build();
            System.out.println(peperoni.toString());
            System.out.println(calabresa.toString());
        }


    }