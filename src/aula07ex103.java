import java.util.Scanner;

public class aula07ex103 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite seu saldo atual: ");
        Double saldo = leitor.nextDouble();

        System.out.println("O saldo atual da sua conta é de: R$ "+saldo+"0.");
        leitor.close();
    }
}
