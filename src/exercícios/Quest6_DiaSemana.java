package exercícios;

import java.util.Scanner;

public class Quest6_DiaSemana {
    public static void main(String[] args) {
        int dia = 0;
        Scanner scan = new Scanner(System.in);

        //System.out.println("Exemplo: 1 = Domingo, 2 = Segunda, etc....");

        System.out.print("Ditgite o número de um dia da semana (1 á 7),\nExemplo: 1 = Domingo, 2 = Segunda, etc.... : ");
        dia = scan.nextInt();

        switch (dia) {
            case 1:
               System.out.print(" Domingo"); 
            break;

            case 2:
               System.out.print("Segunda-feira"); 
            break;

            case 3:
               System.out.print("Terça-feira"); 
            break;

            case 4:
               System.out.print("Quarta-feira"); 
            break;

            case 5:
               System.out.print("Quinta-feira"); 
            break;

            case 6:
               System.out.print(" Sexta-feira"); 
            break;

            case 7:
               System.out.print("Sábado"); 
            break;
        
            default:
               System.out.println("Número Invalido: Escreva um número entre 1 e 7!");
            break;
        }

        scan.close();
    }
}
