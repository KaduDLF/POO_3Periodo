/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

import java.util.Scanner;

public class Heranca {
    
    public static void main(String[] args) {
        String nome;
        float salario,ir;
        int impo,valPro;
        Scanner scan = new Scanner(System.in);
        Cliente oCliente = new Cliente();
        
         System.out.println("Digite o nome do Cliente:");
         nome = scan.nextLine();
         oCliente.setNome(nome);
         
         System.out.println("Digite o Salario do Cliente!");
         salario = scan.nextFloat();
         oCliente.setSalario(salario);
         
         System.out.println("Digite o imposto de renda em reais");
         ir = scan.nextFloat();
         oCliente.setIr(ir);
         
         System.out.println("O salario do " + oCliente.getNome() + " com imposto debitado é de:  " + oCliente.valorSalario());
         
         scan.nextLine();
         
         
//        oCliente.setNome("Carlos");
//        oCliente.setCpf("313.323.323-23");
//        oCliente.setIdade("22");
//        oCliente.setEndereco("rua 10");
//    
   //     oCliente.imprimirCliente();
        
        Fornecedor oForn = new Fornecedor();
        
       //        oForn.setCnpj("12313.31231.313213.222");
//        oForn.setNome("luiz");
//        oForn.setIdade("25");
//        oForn.setEndereco("rua 220");
//        
//        oForn.imprimirFornecedor();
         System.out.println("Digite o nome do Fornecedor:");
         nome = scan.nextLine();
         oForn.setNome(nome);
         System.out.println("Digite o valor do produto");
         valPro = scan.nextInt();
         oForn.setValProduto(valPro);
         System.out.println("Digite a porcentagem do imposto sobre o produto");
         impo = scan.nextInt();
         oForn.setImposto(impo);
         
         System.out.println("O valor do produto com o imposto é de: " + oForn.valorProdutoImp());
         
         scan.nextLine();




    }
}
