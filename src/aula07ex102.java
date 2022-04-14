import java.util.Scanner;

public class aula07ex102 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu endereço: ");
        String endereco = leitor.nextLine();

        System.out.println("Seu pacote será enviado para "+endereco+".");
        leitor.close();
    }
}
