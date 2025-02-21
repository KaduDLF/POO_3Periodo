
package aulas;

import java.util.Date;
import java.util.Scanner;

public class Aula01 {
    
    
    public static void data(){
        Date objData = new Date();
        System.out.println("A data de hoje em mili segundos é " + objData.getTime());
    }
    
    public static void main(String[] args) {
        data();
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite 1 numero!");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero");
        int num2 = scan.nextInt();
        verificar(num1,num2);
       
    }
    
    public static void verificar(int n1, int n2){
        if(n1 > n2){
            System.out.println("O número 1 é maior que o numero 2");
        }else{
            System.out.println("O número 2 é maior que o numero 1");
        }
    }
}
