import java.util.Scanner;

public class aula07ex204 {
    //Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo;
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a dimensão da base do retângulo? (em cm)");
        int base = leitor.nextInt();

        System.out.println("Qual a dimensão da altura do retângulo? (em cm)");
        int altura = leitor.nextInt();

        int area = (base*altura)/2;

        System.out.println("A área do retângulo com dimensões "+altura+"cm de altura e "+base+"cm de base é de "+area+"cm². ");
        leitor.close();
    }
}
