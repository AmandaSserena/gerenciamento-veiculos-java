// Classe abstrata base
public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
    }

    public abstract String informacoesVeiculo();

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano <= 0) {
            throw new IllegalArgumentException("Ano deve ser positivo.");
        }
        this.ano = ano;
    }
}
