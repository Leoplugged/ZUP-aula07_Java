import java.util.Scanner;
public class aula07ex207 {
    //Faça um programa que receba a idade de um usuário e diga se ele é maior de idade ou não.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos anos tem o usuário?");
        int idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("O usuário é maior de idade.");
        }else{
            System.out.println("O usuário não é maior de idade.");
        }
    leitor.close();
    }
}
