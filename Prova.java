/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_2203;

import java.util.Scanner;

/**
 *
 * @author 22200552
 */
public class Prova {
    public static void main(String[] args) {
        String[][] listaInt = new String[11][5];
        String[][] listaGre = new String[11][5];
        Scanner leitura = new Scanner(System.in);
        int opcao, opcao2 = 0;
        int j, h = 0;
        int i = 0;
        do{
            System.out.println("\n1 - Cadastro de Jogadores");
            System.out.println("2 - Lista Time do Inter");
            System.out.println("3 - Lista Time do Gremio"); 
            System.out.println("4 - Lista todos os Jogadores");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(leitura.nextLine());
            
            if (opcao == 1) {
                System.out.println("\nQuer cadastrar o Jogadores do Inter ou do Gremio?");
                System.out.println("1 - Inter");
                System.out.println("2 - Gremio");
                System.out.print("Opção: ");
                opcao2 = Integer.parseInt(leitura.nextLine());
                
            }
            
            if(opcao2 == 1){
                opcao2 = 0;
                j = 0;
                System.out.print("\nDigite o Nome: ");
                listaInt[i][j]=leitura.nextLine();
                j++;
                System.out.print("Digite a Idade: ");
                listaInt[i][j]=leitura.nextLine();
                j++;
                System.out.print("Digite o Peso: ");
                listaInt[i][j]=leitura.nextLine();
                j++;
                System.out.print("Digite a Altura: ");
                listaInt[i][j]=leitura.nextLine();
                j++;
                System.out.print("Digite a Posição: ");
                listaInt[i][j]=leitura.nextLine();
                j++;
                i++;
            }
            if(opcao2 == 2){
                opcao2 = 0;
                j = 0;
                System.out.print("\nDigite o Nome: ");
                listaGre[h][j]=leitura.nextLine();
                j++;
                System.out.print("Digite a Idade: ");
                listaGre[h][j]=leitura.nextLine();
                j++;
                System.out.print("Digite o Peso: ");
                listaGre[h][j]=leitura.nextLine();
                j++;
                System.out.print("Digite a Altura: ");
                listaGre[h][j]=leitura.nextLine();
                j++;
                System.out.print("Digite a Posição: ");
                listaGre[h][j]=leitura.nextLine();
                j++;
                h++;
            }
            if (opcao == 2) {
                System.out.println("\n- Lista de Cadastros Inter -");
                    for (int k = 0; k < i; k++) {
                        j = 0;
                        System.out.print("\nNome: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                        System.out.print("Idade: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                        System.out.print("Peso: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                        System.out.print("Altura: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                        System.out.print("Posição: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                    
                }
            }
            if (opcao == 3) {
                System.out.println("\n- Lista de Cadastros Gremio -");
                    for (int k = 0; k < h; k++) {
                        j = 0;
                        System.out.print("\nNome: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                        System.out.print("Idade: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                        System.out.print("Peso: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                        System.out.print("Altura: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                        System.out.print("Posição: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                }
            }
            if (opcao == 4) {
                System.out.println("\n- Lista de Cadastros Gremio -");
                    for (int k = 0; k < h; k++) {
                        j = 0;
                        System.out.print("\nNome: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                        System.out.print("Idade: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                        System.out.print("Peso: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                        System.out.print("Altura: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                        System.out.print("Posição: ");
                        System.out.println(listaGre[k][j]);
                        j++;
                    }
                    System.out.println("\n- Lista de Cadastros Inter -");
                    for (int k = 0; k < i; k++) {
                        j = 0;
                        System.out.print("\nNome: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                        System.out.print("Idade: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                        System.out.print("Peso: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                        System.out.print("Altura: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                        System.out.print("Posição: ");
                        System.out.println(listaInt[k][j]);
                        j++;
                    }
            }
        }while(opcao != 5);
        System.out.println("\n- Obrigado pela Preferência! -");
    }
}
