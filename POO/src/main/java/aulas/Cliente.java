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
    private float salario, ir;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getIr() {
        return ir;
    }

    public void setIr(float ir) {
        this.ir = ir;
    }
    
    

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
    
    public float valorSalario(){
        return this.salario - ir;
    }
}
