package exercícios;
import java.util.Scanner;

public class Quest5_NumNeg {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        if(num > 0){
            System.out.println(" " + num + " é positivo");
        }
        else if(num == 0){
            System.out.println(" " + num + " é Zero");
        }
        else{
            System.out.println(" " + num + " é negativo");
        }

        scan.close();
    }
}