package com.dio.ContaBanco;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main (String [] args){
        // Criando o objeto sc do Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número agência: ");
        int numeroAgencia = sc.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = sc.next();


        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = sc.nextLine();


        System.out.println("Digite o saldo do banco: ");
        Double saldo = sc.nextDouble();

        System.out.print("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é:" + agencia + ", conta:" + "e seu saldo" + saldo + "já está disponível para saque");
    }

}
