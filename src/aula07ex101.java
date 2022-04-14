import java.util.Scanner;

public class aula07ex101 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade:");
        int idade = leitor.nextInt();

        System.out.println("Olá, "+nome+"! Você tem "+idade+" anos.");
        leitor.close();
    }
}
