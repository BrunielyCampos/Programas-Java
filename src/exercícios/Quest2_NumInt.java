package exercícios;
import java.util.Scanner;

public class Quest2_NumInt{
    public static void main(String[] args) {

        int num = 0;
        int soma = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            
            System.out.print("Digite o " + (i + 1) + "° Número: ");
            num = scan.nextInt();

            soma = soma + num;
        }

    

        System.out.println("Soma Números Digitados: " + soma);
        

        scan.close();
    }        
}
