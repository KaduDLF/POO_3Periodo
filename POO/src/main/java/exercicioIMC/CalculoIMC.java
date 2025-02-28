/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioIMC;

/**
 *
 * @author Carlos
 */
public class CalculoIMC {
    
    
    public double calcular(Pessoa pessoa){
        
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    };
    
    public String verificar(double imc){
        
        if(imc >= 18.50 && imc <= 24.99){
            return "Peso normal!";
        }else if(imc >= 25.00 && imc <= 29.99){
            return "Pré obesidade";
        }else if(imc >= 30.00 && imc <= 34.99){
            return "Obesidade grau 1";
        }else if(imc >= 35.00 && imc <= 39.99){
            return "Obesidade grau 2";
        }else if(imc >= 40.00){
            return "Obesidade grau 3";
       }else{
            return "menor que 18.50";
        }
        
    }
}
