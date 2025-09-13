package exercícios;

import java.util.Scanner;

public class Quest08_Fat {
    public static void main(String[] args) {
        
        double num;
        double mult = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = scan.nextInt();

        while(num >= 1){
            mult = mult * num;
            num--;  
        }
        
        System.out.println("Resultado: " + mult);
        
        scan.close();

    }
}
