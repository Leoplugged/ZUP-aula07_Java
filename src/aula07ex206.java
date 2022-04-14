import java.util.Scanner;

public class aula07ex206 {
    //Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual nome do time anfitrião?");
        String timeA = leitor.nextLine();
        System.out.println("Qual nome do time visitante?");
        String timeB = leitor.nextLine();
        System.out.println("Quanto(s) gol(is) o "+timeA+" marcou?");
        int golTimeA = leitor.nextInt();
        System.out.println("Quanto(s) gol(is) o "+timeB+" marcou?");
        int golTimeB = leitor.nextInt();

        if(golTimeA > golTimeB) {
            System.out.println("O vencedor foi "+timeA+".");
        }else if(golTimeA < golTimeB) {
        System.out.println("O vencedor foi "+timeB+".");
        }else{ 
        System.out.println("Deu empate!");
        }
    leitor.close();
    }
}
