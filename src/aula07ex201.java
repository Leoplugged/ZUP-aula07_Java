import java.util.Scanner;

public class aula07ex201 {
    //Crie um algoritmo que receba 4 notas de um aluno, calcule a média e exiba se o aluno foi aprovado ou não. Obs: a média de aprovação é 7.
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int i = 4;
        Double[] nota = new Double[i];

        System.out.println("Digite primeira nota do aluno: ");
        nota[0] = leitor.nextDouble();
        System.out.println("Digite segunda nota do aluno: ");
        nota[1] = leitor.nextDouble();
        System.out.println("Digite terceira nota do aluno: ");
        nota[2] = leitor.nextDouble();
        System.out.println("Digite última nota do aluno: ");
        nota[3] = leitor.nextDouble();

        double resultado = (nota[0]+nota[1]+nota[2]+nota[3])/i;

        System.out.println("Média do aluno é: "+resultado+".");
        leitor.close();
    }
}
