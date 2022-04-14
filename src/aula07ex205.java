import java.util.Scanner;

public class aula07ex205 {
    //Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] valores = new int[2];

        System.out.println("Definir o maior valor sem ser iguais: Digite o primeiro valor: ");
        valores[0] = leitor.nextInt();
        System.out.println("Primeiro valor digitado foi "+valores[0]+". Agora, digite o segundo valor diferente: ");
        valores[1] = leitor.nextInt();

        if(valores[0] == valores[1]){
            System.out.println("Digitou o mesmo valor. Reinicie o programa!");
        }else if (valores[0] > valores[1]) {
            System.out.println("O primeiro valor digitado é maior. Ou seja: "+valores[0]+" > "+valores[1]+".");
        }else if (valores[0] < valores[1]){
            System.out.println("O segundo valor digitado é maior. Ou seja: "+valores[1]+" > "+valores[0]+".");
        }
        leitor.close();
    }
}
