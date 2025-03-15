/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

public class Heranca {
    
    public static void main(String[] args) {
        Cliente oCliente = new Cliente();
        oCliente.setNome("Carlos");
        oCliente.setCpf("313.323.323-23");
    
        oCliente.imprimirCliente();
        
        Fornecedor oForn = new Fornecedor();
        oForn.setCnpj("12313.31231.313213.222");
        oForn.setNome("luiz");
        
        oForn.imprimirFornecedor();
    }
}
