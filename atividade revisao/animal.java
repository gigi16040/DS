package revisão;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class animal {
String nome; 
 float peso;
 String tipo;
 public animal(String nome, float peso, String tipo){
     this.nome = nome;
     this.peso = peso;
     this.tipo = tipo;
 }
    public void getinfo(){
        System.out.println("nome:" + nome);
        System.out.println("peso" + peso);
        System.out.println("tipo"+ tipo);
    }
}
