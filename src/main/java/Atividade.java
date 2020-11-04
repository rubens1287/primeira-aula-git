
import java.util.Scanner;
import java.util.Calendar;

public class Atividade {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Calendar c = Calendar.getInstance();

        int anoDeNascimento;

        System.out.println("Data/Hora atual: "+c.getTime());
        System.out.println("Ano atual: "+c.get(Calendar.YEAR));

        System.out.println("\nInforme seu ano de nascimento: ");
        anoDeNascimento = leitor.nextInt();

        System.out.println("Sua idade é: "+ (c.get(Calendar.YEAR)-anoDeNascimento));

        if (c.get(Calendar.YEAR)-anoDeNascimento < 18) {
            System.out.println("\nVocê é menor de idade");
        }
        else {
            System.out.println("\nVocê é maior de idade");
        }

    }


}