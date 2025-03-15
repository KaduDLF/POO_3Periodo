/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

/**
 *
 * @author Cliente
 */
public class Cliente extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void imprimirCliente(){
        System.out.println("O CPF do cliente :" + getCpf());
        System.out.println("O nome do cliente : "+ getNome());
        System.out.println("A idade do cliente :" + getIdade());
        System.out.println("O endereço do cliente :" + getEndereco());
        
    }
}
