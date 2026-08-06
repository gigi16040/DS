package revisão;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class Elefante extends animal {
    String caracteristicas;
    public Elefante(String nome, float peso, String tipo, String caracteristicas) {
        super(nome, peso, tipo);
        this.caracteristicas = caracteristicas;
    }
    
}
