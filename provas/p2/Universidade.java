package p2;

public class Universidade {

    public static void main(String[] args){

        EstudanteGrad davide = new EstudanteGrad("231.123.222-46","12421BSI082","Davide Sgalambro");

        Estudante[] estudantesUniversidade = new Estudante[]{
                new EstudanteGrad("012.123.432-44","12411BSI382","Maria Joaquina"),
                davide,
                new EstudanteGrad("982.147.472-34","12421BSI142","Kokimoto Mishima"),
                new EstudantePosGrad("482.347.472-44","12313CCP105" ,"Cirilo Rivera"),
                new EstudantePosGrad("352.147.482-35","12213CCP055" ,"Valéria Ferreira"),
                new EstudantePosGrad("788.245.742-94","12213CCP048" ,"Helena Fernandes")
        };

        try{
            davide.setCargaHorariaDisciplinas(-1);
        }catch(ValorCargaHorariaInvalidoException e){
            System.out.println("Valor carga horaria invalida");
        }

    }
}
