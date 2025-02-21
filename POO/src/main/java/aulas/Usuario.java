package aulas;

import java.util.Scanner;


public class Usuario {
    private int id;
    private String nome, endereco, email;
    private byte receita;

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public byte getReceita() {
        return receita;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setReceita(byte receita) {
        this.receita = receita;
    }
    
    public void consultaMedicamento(){
        System.out.println("Consulta de medicamento");
    }
    
    public void comprarMedicamento(){
        System.out.println("compra de medicamento");
    }
    
    public void efetuaPagamento(){
        System.out.println("efetuar");
    }
    
    public void calculo(int valorMedicamento){
        
        if(valorMedicamento > 100){
            System.out.println("15% O valor do imposto é de: " + (valorMedicamento * 0.15));
            int valorMedNovo = (int) (valorMedicamento * 1.15);
            System.out.println("o novo valor do medicamento é de: " + valorMedNovo);
        }else{
            System.out.println("10% O valor do imposto é de: " + (valorMedicamento * 0.10));
            int valorMedNovo = (int) (valorMedicamento * 1.10);
            System.out.println("o novo valor do medicamento é de: " + valorMedNovo);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Usuario usu = new Usuario();
        
        System.out.println("Insira o valor do medicamento");
        int valorMed = scan.nextInt();
        
        usu.calculo(valorMed);
    }
}
