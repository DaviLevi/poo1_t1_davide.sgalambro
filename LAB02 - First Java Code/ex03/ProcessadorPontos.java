package ex03;

import java.util.Scanner;

public class ProcessadorPontos {
    

    public static void main(String[] args){
        
        Ponto p1 = new Ponto(1,2);
        Ponto p2 = new Ponto(2,3);

        Ponto[] arrayponto = {p1,p2};

        Pontos pontos = new Pontos(arrayponto);


        // calcla o ponto mais a direita
        Ponto pontoMaisADireita = pontos.pontoMaisADireita();

        // calcla o ponto mais a esquerda
        Ponto pontoMaisAEsquerda = pontos.pontoMaisAEsquerda();

        // calcla o ponto mais emcima
        Ponto pontoMaisEmCima = pontos.pontoMaisEmCima();

        // calcla o ponto mais embaixo
        Ponto pontoMaisEmbaixo = pontos.pontoMaisEmbaixo();

        System.out.println("Ponto mais a direita : " + pontoMaisADireita);
        System.out.println("Ponto mais a esquerda : " + pontoMaisAEsquerda);
        System.out.println("Ponto mais emcima : " + pontoMaisEmCima);
        System.out.println("Ponto mais embaixo : " + pontoMaisEmbaixo);

    }

    
    private static Ponto lePontoDoTeclado(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        float x = teclado.nextFloat();

        System.out.print("Digite o valor de y: ");
        float y = teclado.nextFloat();

        return new Ponto(x, y);
    }

    

    

}
