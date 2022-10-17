package com.mycompany.pergunta8;

import java.util.Scanner;

/**
 *
 * @author Tiago Dornelles
 */
public class Pergunta8 {

    public static void main(String[] args) {

        
        //Inicialização do meu Scanner para este método
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de Cadastro de Funcionario: ");
        int qtdFuncionarios = Integer.valueOf(scanner.nextLine());

        // Definido meus Arrays
        String[] nome = new String[qtdFuncionarios];
        Double[] salario = new Double[qtdFuncionarios];

        // Nesta parte será armazenado a quantidade de cadastros dos funcionarios com seu respectivo nome e salario
        for (int i = 0; i < qtdFuncionarios; i++) {
            System.out.println("Informe o nome do Funcionario [" + i + "]");
            nome[i] = scanner.nextLine();
            System.out.println("Informe o salario do " + nome[i]);
            salario[i] = Double.valueOf(scanner.nextLine());
        }

        // Aqui sera feito o calculo conforme o cadastro dos funcionarios 
        for (int i = 0; i < qtdFuncionarios; i++) {

            if (salario[i] < 1000.00) {
                System.out.println("\r\nFuncionário " + nome[i]);
                System.out.println("Salário: " + salario[i]);
                double bonus = salario[i] * 0.20;
                System.out.println("Bônus: " + bonus);
                System.out.println("Salário Liquido: " + (salario[i] + bonus) + "\r\n");
            } else if (salario[i] >= 1000.00 && salario[i] < 2000.00) {
                System.out.println("\r\nFuncionário " + nome[i]);
                System.out.println("Salário: " + salario[i]);
                double bonus = salario[i] * 0.10;
                System.out.println("Bônus: " + bonus);
                System.out.println("Salário Liquido: " + (salario[i] + bonus) + "\r\n");

            } else if (salario[i] > 2000.00) {
                System.out.println("\r\nFuncionário " + nome[i]);
                System.out.println("Salário: " + salario[i]);
                double desconto = salario[i] * 0.10;
                System.out.println("Desconto: " + desconto);
                System.out.println("Salário Liquido: " + (salario[i] + desconto) + "\r\n");
            }

        }
    }

}
