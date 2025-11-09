public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        setCilindrada(cilindrada);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("Cilindrada deve ser positiva.");
        }
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return String.format(
            "Moto: %s %s (%d) - %dcc",
            marca, modelo, getAno(), cilindrada
        );
    }
}
