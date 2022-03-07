package lab08;

public class Classificador {
    public void ordena(Classificavel[] arr) {
        Classificavel elem, menor;
        int pos;
        for (int i = 0; i < arr.length - 1; i++) {
            elem = arr[i];
            menor = arr[i + 1];
            pos = i + 1;
            for (int j = i + 2; j < arr.length; j++) {

                if (arr[j].ehMenorQue(menor)) {
                    menor = arr[j];
                    pos = j;
                }
            }
            if (menor.ehMenorQue(elem)) {
                arr[i] = arr[pos];
                arr[pos] = elem;
            }
        }
    }
}
