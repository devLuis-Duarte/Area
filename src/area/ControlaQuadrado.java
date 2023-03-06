/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

import javax.swing.JOptionPane;

/**
 *
 * @author salda
 */
public class ControlaQuadrado {
    public Quadrado informaQuadrado(){
        Quadrado q = new Quadrado();
        q.setLado1(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado 1")));
        q.setLado2(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado 2")));
        q.setArea(q.getLado1() * q.getLado2());
        
        return q;
        
    }
}
