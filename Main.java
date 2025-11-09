import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Garante que System.out usa UTF-8:
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));

        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CB500F", 2021, 471);

        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());

        carro.setAno(2023);
        moto.setCilindrada(500);

        System.out.println("Após alterações:");
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
