import java.util.Scanner;

public class aula07ex208 {
    //8. Faça um programa que receba 6 números e exiba se: A é igual a B; C é diferente D; E é maior F.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[6];

        System.out.println("Atribua um número para cada letra: \nA: ");
        numeros[0] = leitor.nextInt();
        System.out.println("B: ");
        numeros[1] = leitor.nextInt();
        System.out.println("C: ");
        numeros[2] = leitor.nextInt();
        System.out.println("D: ");
        numeros[3] = leitor.nextInt();
        System.out.println("E: ");
        numeros[4] = leitor.nextInt();
        System.out.println("F: ");
        numeros[5] = leitor.nextInt();

        if(numeros[0] == numeros[1]){
            System.out.println("A é igual a B;");
        }else{
            System.out.println("A é diferente de B;");
        }

        if(numeros[2] != numeros[3]){
            System.out.println("C é diferente de D;");
        }else{
            System.out.println("C é igual a D;");
        }

        if(numeros[4] > numeros[5]){
            System.out.println("E é maior que F.");
        }else{
            System.out.println("E é menor que F.");
        }
    leitor.close();
    }
}
