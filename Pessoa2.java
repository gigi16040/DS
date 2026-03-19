package javaapplication1;


public class Pessoa {
   
    int idade;
    String nome;
    String CPF;
    boolean vivo;
    
    void recuperaNome() {
        System.out.print("Nome do cara é:" + nome);        
    }
    void alteraNome (String nome2){
        nome = nome2;
    }
    void recuperaCPF(){
        System.out.print("O cpf do cara é:" + CPF);
    }
    void alteraCPF (String CPF2){
        CPF = CPF2;
    }
    void recuperaIdade (){
        System.out.print("A idade do cara é:" + idade);
    }
    void alteraIdade (String idade2){
        idade = idade2;
    }
}


    

