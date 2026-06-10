import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IO.println("Digite o CEP desejado aqui: ");
        String CEP = input.nextLine();
        ConsultaCEP consultaCep = new ConsultaCEP();
        Endereco endereco = consultaCep.buscaEndereco(CEP); // Seu CEP aqui...
        System.out.println(endereco);

    }
}
