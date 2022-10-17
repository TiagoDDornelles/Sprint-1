package com.mycompany.pergunta7;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Tiago Dornelles
 */
public class Pergunta7 {

    public static void main(String[] args) {

        // utilizado método Calendar para realizar a validação das horas
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);

        //Arrays utilizado para validar o usario, senha e as horas acessadas
        String[] usuario = {"admin"};
        String[] senha = {"123456"};
        String[] mensagem = {"Bom dia, você se logou ao nosso sistema.",
            "Boa tarde, você se logou ao nosso sistema",
            "Boa noite, você se logou ao nosso sistema",
            "Boa madrugada você se lou ao nosso sistema",
            "Usuário e/ou senha incorretos."};
        String user, pass;
        boolean isValid = false;

        // Realização das perguntas de usuario e senha
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        user = input.nextLine();

        System.out.println("Digite sua senha: ");
        pass = input.nextLine();

        // Nesta parte ele vai validar o usuario e a senha se estão corretos, caso esteja correto ele vai percorrer o if caso esteja incorreto vai cair no else final retornado com erro ao acessar 
        for (int i = 0; i < usuario.length; i++) {
            if (usuario[i].equals(user) && senha[i].equals(pass)) {
                isValid = true;
                if (hora > 6 && hora < 12) {

                    System.out.println(mensagem[0]);
                   

                } else if (hora > 12 && hora < 18) {
                    System.out.println(mensagem[1]);

                } else if (hora > 18 && hora < 24) {
                    System.out.println(mensagem[2]);
                   
                } else if (hora > 24 && hora < 6) {
                    System.out.println(mensagem[3]);
                   
                }
            } else {
                System.out.println(mensagem[4]);
                
            }
        }

    }
}
