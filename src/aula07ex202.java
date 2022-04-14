import java.util.Scanner;

public class aula07ex202 {
/*  Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba sua classificação. OBS: Fórmula: IMC = peso/ (altura x altura), a classificação se encontra na tabela abaixo:
IMC		        |	CLASSIFICAÇÃO	|	OBESIDADE (GRAU)
MENOR QUE 18,5 		MAGREZA 		    0
ENTRE 18,5 E 24,9 	NORMAL 		    	0
ENTRE 25,0 E 29,9 	SOBREPESO 	    	I
ENTRE 30,0 E 39,9 	OBESIDADE 	    	II
MAIOR QUE 40,0 		OBESIDADE GRAVE	    III*/
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("CALCULADORA CLASSIFICATÓRIA DE IMC\nDigite sua altura: ");
        Double altura = leitor.nextDouble();

        System.out.println("Digite seu peso: ");
        Double peso = leitor.nextDouble();

        Double resultado = peso/(altura*altura);

        System.out.println("De acordo com a tabela de IMC, sua classificação é: ");

        if(resultado < 18.5){
            System.out.println("MAGREZA - GRAU 0"); 
        }else if(resultado >= 18.5 && resultado < 24.9){
            System.out.println("NORMAL - GRAU 0"); 
        }else if(resultado >= 25 && resultado < 29.9){
            System.out.println("SOBREPESO - GRAU I"); 
        }else if(resultado >= 30 && resultado < 39.9){
            System.out.println("OBESIDADE - GRAU II");
        }else{
            System.out.println("OBESIDADE - GRAU III");
        }
        leitor.close();
    }
    
}
