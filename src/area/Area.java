/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area;

/**
 *
 * @author salda
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlaQuadrado controla = new ControlaQuadrado();
        ControlaTriangulo controle = new ControlaTriangulo();
        ControlaRetangulo control = new ControlaRetangulo();
        
        Triangulo tri = controle.informaTriangulo();
        Quadrado q = controla.informaQuadrado();//armazenando os valores que o usuario preencheu na váriavel objeto "q" da classe "Quadrado", esses valores sao acessados ao chamar o metodo informaQuadrado()
        Retangulo ret = control.informaRetangulo();
                                                
        System.out.println("Altura do triangulo:" +tri.getAltura());
        System.out.println("Largura do triangulo:" +tri.getLargura());
        System.out.println("Area do triangulo:" +tri.getArea());
        
       
        System.out.println("Lado 1 do quadrado:" +q.getLado1());
        System.out.println("Lado 2 do quadrado:" +q.getLado2());
        System.out.println("Area do quadrado:" +q.getArea());
        
        System.out.println("\nAltura do retangulo:" +ret.getAltura());
        System.out.println("Largura do retangulo:" +ret.getBase());
        System.out.println("Area do retangulo:" +ret.getArea());
        
        
        
    }
    
}
