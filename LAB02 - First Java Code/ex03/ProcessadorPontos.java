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
        
        Ponto pontoMultiplicado = p1.multiplica(3);

        // altera estado interno
        p1.multiplicaVoid(3);

        Ponto[] arrayponto = {p1,p2};

        Pontos pontos = new Pontos(arrayponto);


        // calcla o ponto mais a direita
        Ponto pontoMaisADireita = pontos.pontoMaisADireita();


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
