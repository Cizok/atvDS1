/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lanchonete;

/**
 *
 * @author Admin
 */
public class Lanchonete {
    //abstrato, oque eu trouxe do mundo real

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mesa mesa1 = new Mesa("1");
        //instancia/classe que vai receber todos os atributos
        
        mesa1.seção = "A La Carte";
        mesa1.lugares = "4 Lugares";
        mesa1.atendente = "Victor";
        
        Mesa mesa2 = new Mesa("2");
        mesa2.seção = "A La Carte";
        mesa2.lugares = "2 Lugares";
        mesa2.atendente = "Jennifer";
        
        Mesa mesa3 = new Mesa("3");
        mesa3.seção = "Rodizio";
        mesa3.lugares = "6 Lugares";
        mesa3.atendente = "Vitoria";
        
        Mesa mesa4 = new Mesa("4");
        mesa4.seção = "A La Carte";
        mesa4.lugares = "4 Lugares";
        mesa4.atendente = "Victor";
        
        System.out.println("Mesa:" +mesa1.coman+"; Seção: " +mesa1.seção+ "; Qtd. Lugares:" +mesa1.lugares+ "; Atendente: "+mesa1.atendente);
        System.out.println("Mesa:" +mesa2.coman+"; Seção: " +mesa2.seção+"; Qtd. Lugares:"  +mesa2.lugares+ "; Atendente: "+mesa2.atendente);
        System.out.println("Mesa:" +mesa3.coman+"; Seção: " +mesa3.seção+ "; Qtd. Lugares:" +mesa3.lugares+"; Atendente: " +mesa3.atendente);
        System.out.println("Mesa:" +mesa4.coman+"; Seção: " +mesa4.seção+"; Qtd. Lugares:" +mesa4.lugares+"; Atendente: " +mesa4.atendente);
        //comando que vai imprimir todas as informações
    }
    
}
