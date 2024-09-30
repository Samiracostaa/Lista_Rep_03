/*2. Dada a seguinte série: 1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, . . ., escreva um programa que seja capaz de
gerar os primeiros n−ésimos termos da mesma. Esse número n deve ser lido do teclado. No
exemplo citado, n = 4
*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        int valor = 1;
        int count = 0;
        
        while (count < n) {
            System.out.print(valor + " " + valor + " ");
            count += 2; 
            valor++;  
        }
        scanner.close();
    }
}
