package exercícios;
import java.util.Scanner;

public class Quest4_NotasMedia {
    public static void main(String[] args) {
        
        int nota;
        int soma = 0;
        float media = 0;
        int qtd = 0;
        Scanner scan = new Scanner(System.in); 

        for(int i = 0; i < 3; i++){
            System.out.print("Digite a sua " + (i + 1) + "° Nota: ");
            nota = scan.nextInt();

            soma = soma + nota;
            qtd++;
        } 

        media = (float) soma/qtd;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        scan.close();
    }
}
