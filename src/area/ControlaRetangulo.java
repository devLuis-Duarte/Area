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
public class ControlaRetangulo {
 public Retangulo informaRetangulo(){
     Retangulo r = new Retangulo();
     
     r.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do retangulo:")));
     r.setBase(Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do retangulo:")));
     r.setArea(r.getAltura() * r.getBase());
     
     return r;
     
 }   
}
