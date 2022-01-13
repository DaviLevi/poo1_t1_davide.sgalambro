package ex03;

import java.util.Scanner;

public class ProcessadorPontos {
    

    public static void main(String[] args){
        
        // soma
        Ponto p1 = lePontoDoTeclado();
        Ponto p2 = lePontoDoTeclado();

        // soma
        Ponto p3 = p1.mais(p2);

        // soma 2 numeros e armazena no terceiro
        Ponto.somaTerceiro(p1, p2, p3);

        Ponto resultadoMultiplicacao = p1.multiplica(3);

        // altera estado interno
        p1.multiplicaVoid(3);

        Ponto p4 = new Ponto(1,2);
        Ponto p5 = new Ponto(2,3);

        Ponto[] arrayponto = {p4, p5};

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
