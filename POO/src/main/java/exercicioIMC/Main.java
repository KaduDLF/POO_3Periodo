
package exercicioIMC;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Main {
    
    public static void menu(){
        System.out.println("Digite uma opção!            ");
        System.out.println(" -----------------Menu--------------");
        System.out.println(" 1 - fazer um calculo de IMC  ");
        System.out.println(" 2 - sair do programa");
        System.out.println(" ---------------------------------------");
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, cpf;
        float peso, altura;
        CalculoIMC calculo = new CalculoIMC();
        Pessoa pessoa = new Pessoa();
        menu();
        int opc = scan.nextInt();
        while(opc != 2){
               switch (opc){
                   case 1:
                       scan.nextLine();
                       
                       System.out.println("Informe o CPF!");
                       cpf = scan.nextLine();
                       pessoa.setCpf(cpf);
                       System.out.println("Informe o nome!");
                       nome = scan.nextLine();
                       pessoa.setNome(nome);
                       System.out.println("Informe o peso");
                       peso = scan.nextFloat();
                       pessoa.setPeso(peso);
                       System.out.println("Informe a altura");
                       altura = scan.nextFloat();
                       pessoa.setAltura(altura);
                       
                       scan.nextLine();
                       
                       calculo.calcular(pessoa);
                       System.out.println("O IMC de " + nome + " é: " + String.format("%.2f", calculo.calcular(pessoa)) + " e a faixa é : " + calculo.verificar(calculo.calcular(pessoa)) );
                       scan.nextLine();
                       break;
                   case 2:
                       
                       break;
                   default:
                       System.out.println("Opção invalida");
              }
            menu();
            opc = scan.nextInt();
        }
        
        
    }
}
