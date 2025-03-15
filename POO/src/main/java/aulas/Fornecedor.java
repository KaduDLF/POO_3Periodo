/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

/**
 *
 * @author Cliente
 */
public class Fornecedor extends Pessoa {
    
    private String cnpj;
    private int valProduto;
    private int imposto;

    public float getValProduto() {
        return valProduto;
    }

    public void setValProduto(int valProduto) {
        this.valProduto = valProduto;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }
    
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void imprimirFornecedor(){
        System.out.println("O nome do Fornecedor : " + getNome());
        System.out.println("O CNPJ do Fornecedor: "+ getCnpj());
        System.out.println("A idade do Fornecedor: " + getIdade());
        System.out.println("O endereço do Fornecedor: " + getEndereco());
    }
    public float valorProdutoImp() {
        float impostoCalculado = (this.imposto / 100.0f) + 1; 
        return this.valProduto * impostoCalculado;
    }

}
