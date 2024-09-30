/*
3- As regras de transição para aposentadoria estão causando muita dúvida e seus amigos pediram
uma ajuda. Todos eles se encaixam na regra definida a seguir:
• Regra de transição de pontos - Setor Privado: soma-se o tempo de contribuição
com a idade, caso atinja a pontuação mínima exigida para o ano em questão, pode se
aposentar. O cálculo começa no ano de 2019, e a pontuação mínima neste ano é de 96
pontos para os homens e 86 pontos para as mulheres, e é acrescida de um a cada ano,
atingindo o máximo de 105 para homens e 100 para mulheres.
Implemente um programa que realize a simulação do cálculo do ano no qual um amigo poderá
se aposentar. As entradas para o programa são: sexo (1 - feminino e 2 - masculino), tempo de
contribuição em 2019 e a idade em 2019. O programa imprime como resultado uma tabela
com o ano (começando de 2019), a pontuação mínima para o ano e a pontuação obtida no
ano, encerrando quando a pontuação obtida no ano for igual ou superior à pontuação mínima
para este mesmo ano. O amigo, em nenhum momento, interrompe sua contribuição, ou seja,
assim como sua idade, o tempo de contribuição é acrescido de um a cada ano que se passa.
Observe que a pontuação obtida inicialmente é a idade mais o tempo de contribuição (ambos
em 2019), e para cada ano seguinte a pontuação obtida é acrescida de 2 (1 pela idade e 1 pela
contribuição).


*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o sexo (1 para feminino, 2 para masculino): ");
        int sexo = scanner.nextInt();
        System.out.print("Informe sua idade em 2019: ");
        int idade2019 = scanner.nextInt();
        System.out.print("Informe o tempo de contribuição em 2019: ");
        int tempoContribuicao2019 = scanner.nextInt();

       
        int pontosMinimosHomem = 96;
        int pontosMinimosMulher = 86;
        int maxPontosHomem = 105;
        int maxPontosMulher = 100;
        int pontosMinimosAtuais = (sexo == 2) ? pontosMinimosHomem : pontosMinimosMulher;
        int maxPontosAtuais = (sexo == 2) ? maxPontosHomem : maxPontosMulher;
        int ano = 2019;
        int idade = idade2019;
        int tempoContribuicao = tempoContribuicao2019;
        int pontuacaoObtida = idade + tempoContribuicao;

       
        System.out.println("Ano\tPontuação Mínima\tPontuação Obtida");

       
        while (pontuacaoObtida < pontosMinimosAtuais) {
            
            System.out.println(ano + "\t" + pontosMinimosAtuais + "\t\t" + pontuacaoObtida);

           
            ano++;
            idade++;
            tempoContribuicao++;
            pontuacaoObtida = idade + tempoContribuicao;

            
            if (pontosMinimosAtuais < maxPontosAtuais) {
                pontosMinimosAtuais++;
            }
        } 
        System.out.println(ano + "\t" + pontosMinimosAtuais + "\t\t" + pontuacaoObtida);
        System.out.println("Você poderá se aposentar em " + ano + ".");
    }
}
