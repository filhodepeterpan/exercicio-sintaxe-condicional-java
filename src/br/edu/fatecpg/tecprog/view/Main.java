/*
Faça um programa que mostre o menu de opções a seguir, receba a opção do
usuário e os dados necessários para executar cada operação. Obrigatório o uso
do switch/case.
Menu de opções:
1. Somar dois números.
2. Subtrair dois números
3. Multiplicar dois números
4. Dividir dois números
5. Raiz quadrada de um número
Digite a opção desejada.
 */

package br.edu.fatecpg.tecprog.view;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        int n1 = 0;
        int n2 = 0;
        double resultado = 0.0;
        boolean raizPossivel = true;

        while(true) {
            System.out.println("""
            Menu de opções:
            
            1. Somar dois números.
            2. Subtrair dois números
            3. Multiplicar dois números
            4. Dividir dois números
            5. Raiz quadrada de um número
            
            Digite a opção desejada:
            """);

            opcao = scan.nextInt();

            if(opcao >=1 && opcao <=5){ break; }
        }

        System.out.printf("\nDigite o%s número:\n", opcao != 5 ? " 1º" : "");
        n1 = scan.nextInt();

        if(opcao != 5) {
            System.out.println("\nDigite o 2º numero:\n");
            n2 = scan.nextInt();
        }

        switch(opcao){
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                resultado = (double) n1 / n2;
                break;
            case 5:
                for (int i = 1; i <= n1; i++) {
                    if (i * i == n1) {
                        resultado = i;
                        raizPossivel = true;
                        break;
                    }
                    raizPossivel = false;
                }
                break;
        }

        if(raizPossivel){
            System.out.printf("\nRESULTADO: %.1f", resultado);
        }
        else {
            System.out.println("\nNão foi possível determinar a raiz.");
        }
    }
}
