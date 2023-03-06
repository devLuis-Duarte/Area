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
public class ControlaTriangulo {
    public Triangulo informaTriangulo(){
        Triangulo t = new Triangulo();
        t.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triangulo:")));
        t.setLargura(Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do triangulo:")));
        t.setArea(t.getAltura() * t.getLargura());
        
        return t;
        
    }
}
