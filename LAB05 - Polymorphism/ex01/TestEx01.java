package lab05.ex01;

import lab05.ex01.bidimensional.Circulo;
import lab05.ex01.bidimensional.FormaBidimensional;
import lab05.ex01.bidimensional.Quadrado;
import lab05.ex01.bidimensional.Triangulo;
import lab05.ex01.tridimensional.Cubo;
import lab05.ex01.tridimensional.Esfera;
import lab05.ex01.tridimensional.FormaTridimensional;
import lab05.ex01.tridimensional.Tetraedro;

public class TestEx01 {


    public static void main(String[] args){
        Forma[] formas = new Forma[]{
                new Circulo(2),
                new Quadrado(2),
                new Triangulo(1, 2),
                new Cubo(2),
                new Esfera(2),
                new Tetraedro(2, 3)
        };

        int quantidadeFormas = formas.length;
        int cont = 0;

        while(cont < quantidadeFormas){

            Forma forma = formas[cont];

            System.out.print(forma.descreve());

            if(forma instanceof FormaBidimensional){
                double area = ((FormaBidimensional) forma).obterArea();
                System.out.println(" com uma area de " + area);
            }else
            if(forma instanceof FormaTridimensional){
                double area = ((FormaTridimensional) forma).obterArea();
                double volume = ((FormaTridimensional) forma).obterVolume();
                System.out.println(" com uma area de " + area + " e um volume de " + volume);
            }

            cont++;
        }

    }

}
