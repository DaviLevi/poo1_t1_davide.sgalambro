package ex01;

import java.util.Scanner;

public class MostraMaiorAreaRetangulo {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Retangulo[] arrayRetangulos = leNRetangulos(teclado);
        
        Retangulos retangulos = new Retangulos(arrayRetangulos);

        System.out.println("O valor da maior area eh : " + retangulos.calculeMaiorArea());

    }

    private static Retangulo[] leNRetangulos(Scanner teclado){
        System.out.print("Informe a quantidade n de retangulos a serem lidos : ");
        int quantidadeRetangulosDesejados = teclado.nextInt();
        int quantidadeRetangulosLidos = 0;
        Retangulo[] retangulosLidos = new Retangulo[quantidadeRetangulosDesejados];
        while(quantidadeRetangulosLidos < quantidadeRetangulosDesejados){
            Retangulo retanguloLido = leRetangulo(teclado);
            retangulosLidos[quantidadeRetangulosLidos] = retanguloLido;
            quantidadeRetangulosLidos++;
        }
        return retangulosLidos;
    }

    private static Retangulo leRetangulo(Scanner teclado){
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
