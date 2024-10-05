package propriedades;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private int quantidadeRodas = 0;

    public Veiculo() {
    }

    public Veiculo(String tipo, String cor, int quantidadeRodas) {
        this.tipo = tipo;
        this.cor = cor;
        this.quantidadeRodas = quantidadeRodas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas= quantidadeRodas;
    }

    @Override
    public String toString(){
        return "Veículo [Tipo: " + tipo + ", Cor: " + cor + ", Quantidade de Rodas: " + quantidadeRodas + "]";
    }
}
