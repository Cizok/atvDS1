/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonete;

/**
 *
 * @author Admin
 */
public class Mesa {
    public String lugares;
    public String seção;
    public String atendente;
    public String coman;
    //criando atributos com as inforações das mesas
    
    public Mesa(String comanda){
        this.coman = comanda;
    }
    //contrutor, obrigatório para todas as mesas
    public static String kitmesa = "Ketchup, Maionese, Mostarda, Guardanapo, Cardapio";
}
//atributo estatico, não altera 
