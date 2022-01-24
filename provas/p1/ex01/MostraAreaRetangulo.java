package ex01;

import java.util.Scanner;

public class MostraAreaRetangulo {
    public static void main(String[] args){


        Retangulo retangulo = leRetangulo();
        
        System.out.println("A area do retangulo eh igual a : " + retangulo.getArea());
    }


    private static Retangulo leRetangulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro ponto do retangulo");
        System.out.print("Digite o valor da coordenada x : ");
        double x1 = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada y : ");
        double y1 = teclado.nextDouble();

        System.out.println("Digite o segundo ponto do retangulo");
        System.out.print("Digite o valor da coordenada x : ");
        double x2 = teclado.nextDouble();
        System.out.print("Digite o valor da coordenada y : ");
        double y2 = teclado.nextDouble();

        Ponto p1 = new Ponto(x1, y1);
        Ponto p2 = new Ponto(x2, y2);

        return new Retangulo(p1, p2);
    }
}
