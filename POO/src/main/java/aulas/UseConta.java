/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class UseConta {
    
    public static void menu(){
        System.out.println("    --------- menu  ---------");
        System.out.println(" 0 -  sair ");
        System.out.println(" 1 -  Operarr ");
        System.out.println("escolha um numero     ");
    }
    
    public static void main(String[] args) {
        Conta conta1 = new Conta();
       // Conta conta2 = new Conta();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        
        
        conta1.setNome(nome);
      //  conta2.setNome("Felipe");
      
        
        
        menu();
        int numero = scan.nextInt();
        
        while(numero != 0 ){
            
            switch(numero){
                    case 1:
                        System.out.println("Digite o valor a ser depositado!");
                        double valor = scan.nextDouble();
        
                        System.out.println("Digite a porcentagem que você Quer!");
                        int porcentagem = scan.nextInt();
        
                        conta1.depositar(valor,porcentagem);
                        System.out.println("Conta 1: " + conta1.getNome() + " - R$"  + conta1.getSaldo());
                        
                        break;
                    default:
                        System.out.println("Valor invalido!");
                        break;
            }
            menu();
            numero = scan.nextInt();
             
        }
        
        
        
   //     System.out.println("Conta 2: " + conta2.getNome() + " - R$"  + conta2.getSaldo());
    }
}
