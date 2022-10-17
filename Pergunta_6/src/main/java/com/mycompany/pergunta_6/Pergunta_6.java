package com.mycompany.pergunta_6;

import java.util.Scanner;

/**
 *
 * @author tiago_Dornelles
 */
public class Pergunta_6 {

    public static void main(String[] args) {
        //realizado a inicialização do Scanner
        Scanner scanner = new Scanner(System.in);
        String user;
        
        //Arrays das perguntas e respostas 
        String[] pergunta = {"O sucessor de 2^3 é: \r\n A) 3^2 \r\n B) 3^4 \r\n C) 3^3 \r\n D) 2^4 \r\n",
            "(Obmep) Lúcia e Antônio disputaram várias partidas"
            + " de um jogo no qual cada um começa com 5 pontos."
            + " Em cada partida, o vencedor ganha 2 pontos e o derrotado"
            + " perde 1 ponto, não havendo empates. Ao final, Lúcia ficou"
            + " com dez pontos e Antônio ganhou exatamente três"
            + " partidas. Quantas Partidas eles disputaram ao todo? \r\n A) 6 \r\n B) 7 \r\n C) 8 \r\n D) 9 \r\n",
            "(SARESP)O instrumento de medida mais adequado para medir as dimensões de um apartamento é: \r\n A) régua \r\n B) esquadro \r\n C) trasferidor \r\n D) trena \r\n",
            "A unidade de medida mais apropriada para medir o comprimento de uma caneta é: \r\n A) centímetro \r\n B) metro \r\n C) milímetro \r\n D) quilômetro \r\n",
            "O número formado por 1 centena de milhar mais 4 milhares mais 7 dezenas é: \r\n A) 140700 \r\n B) 140070 \r\n C) 104700 \r\n D) 104070 \r\n"};
        String[] corretas = {"D", "B", "D", "A", "D"};

        System.out.println("Digite seu nome : ");
        user = scanner.nextLine();
        int acertos = 0;

        // Aqui vai ser feito a inicialização das perguntas, onde vai ser passado pelo array cada pergunta respondida.
        for (int i = 0; i < pergunta.length; i++) {
            System.out.println(pergunta[i]);
            String resp = scanner.nextLine();

            if (resp.equalsIgnoreCase(corretas[i])) {
                acertos++;
                System.out.println("Acertou! \r\n");
            }else{
                System.out.println("Errou! \r\n");
            }
        }
        
        // Resultado das perguntas respondidas
        System.out.println("Usuário " + user);
        System.out.println("Acertos" + acertos);
        System.out.println("erros" + (pergunta.length - acertos));

    }

}
