package exercícios;
import java.util.Scanner;

public class Quest3_Idade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int idade;

        System.out.print("Digite a sua idade: ");
        idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("Você é Maior de idade");
        }
        else{
            System.out.print("\n Você é Menor de idade: ");
        }

        scan.close();
    }
}
