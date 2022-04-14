import java.util.Scanner;

public class aula07ex203 {
    //Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor para saber se ele é maior que 10:");
        int valor = leitor.nextInt();

        if(valor>10){
            System.out.println("O valor digitado é maior que 10!");
        }else{
            System.out.println("O valor digitado não é maior que 10!");
        }
    leitor.close();
    }
}