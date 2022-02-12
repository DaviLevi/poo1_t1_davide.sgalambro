package lab06.ex06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FaceFriend {


    public static void main(String[] args){

        Contato[] contatos = new Contato[]{
                new Amigos("Dade", "Davide Sgalambro",
                        "davide.sgalambro@gmail.com",
                        LocalDate.of(1995, 04, 07),
                        1)
        };

        Menu menu = new Menu();

        boolean continua = menu.executa();

        while(continua){
            continua = menu.executa();
        }
    }


    private static class Menu{
        private Contato[] contatos;

        private static final int INSERIR_CONTATO=1,
                           IMPRIMIR_TODOS_CONTATOS=2,
                           IMPRIMIR_FAMILIARES=3,
                           IMPRIMIR_AMIGOS=4,
                           IMPRIMIR_COLEGAS_TRABALHO=5,
                           IMPRIMIR_MELHORES_AMIGOS_IRMAOS_COLEGAS_TRABALHO=6,
                           IMPRIMIR_CONTATO=7,
                           SAIR=8;

        private Menu(){
            this.contatos = new Contato[1000];
        }

        public boolean executa(){
            Scanner teclado = new Scanner(System.in);
            System.out.print(String.format("\033[2J"));
            System.out.println("=== MENU AGENDA FACE FRIEND ===");

            System.out.println("Por favor, selecione uma opcao:");
            System.out.println("1 - Inserir um contato");
            System.out.println("2 - Imprimir todos os contatos");
            System.out.println("3 - Imprimir familiares");
            System.out.println("4 - Imprimir amigos");
            System.out.println("5 - Imprimir colegas de trabalho");
            System.out.println("6 - Imprimir melhores amigos, irmaos e colegas de trabalho");
            System.out.println("7 - Imprimir contato");
            System.out.println("8 - Sair do Menu");

            System.out.print("Opcao escolhida : ");

            int opcaoEscolhida = teclado.nextInt();
            switch (opcaoEscolhida){
                case INSERIR_CONTATO: {
                    inserirContato(teclado);
                    return true;
                }
                case IMPRIMIR_TODOS_CONTATOS: {
                    imprimirTodosContatos(teclado);
                    return true;
                }
                case IMPRIMIR_FAMILIARES: {
                    imprimirFamiliares(teclado);
                    return true;
                }
                case IMPRIMIR_AMIGOS: {
                    imprimirAmigos(teclado);
                    return true;
                }
                case IMPRIMIR_COLEGAS_TRABALHO: {
                    imprimirColegasTrabalho(teclado);
                    return true;
                }
                case IMPRIMIR_MELHORES_AMIGOS_IRMAOS_COLEGAS_TRABALHO: {
                    imprimirMelhoresAmigosIrmaosEColegasTrabalho(teclado);
                    return true;
                }
                case IMPRIMIR_CONTATO: {
                    System.out.print("Digite o indice do contato : ");
                    int indice = teclado.nextInt();
                    imprimirContato(indice, teclado);
                    return true;
                }
                case SAIR: return false;
            }
            return false;
        }

        private void inserirContato(Scanner teclado){
            System.out.print(String.format("\033[2J"));
            System.out.println("=== ADICAO CONTATO FACE FRIEND ===");


            System.out.print("Digite o subtipo de contato : ");

            String subtipo = teclado.next();

            Contato novoContato = leContato(teclado, subtipo);


            int indiceLivre = buscaPrimeiroIndiceLivre(contatos);

            contatos[indiceLivre] = novoContato;

            System.out.print("Pressione ENTER para voltar ao menu");
            teclado.nextLine(); teclado.nextLine();
        }

        private int buscaPrimeiroIndiceLivre(Contato[] contatos){
            int indiceAtual = 0;

            while(indiceAtual < contatos.length){

                Contato contato = contatos[indiceAtual];
                if(contato == null) return indiceAtual;
                indiceAtual++;
            }

            return contatos.length;
        }

        private Contato leContato(Scanner teclado, String subtipo){
            System.out.print("Digite o apelido : ");
            String apelido = teclado.next();
            System.out.print("Digite o nome : ");
            String nome = teclado.next();
            System.out.print("Digite o email : ");
            String email = teclado.next();
            System.out.print("Digite a data de aniversario : ");
            String stringAniversario = teclado.next();
            LocalDate aniversario = LocalDate.parse(stringAniversario, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            switch (subtipo){
                case "amigos":
                    System.out.print("Digite o grau de amizade : ");
                    int grauAmizade = teclado.nextInt();
                    return new Amigos(apelido, nome, email, aniversario, grauAmizade);
                case "familiares":
                    System.out.print("Digite o parentesco : ");
                    String parentesco = teclado.next();
                    return new Familia(apelido, nome, email, aniversario, parentesco);
                case "trabalho":
                    System.out.print("Digite o tipo : ");
                    String tipo = teclado.next();
                    return new Trabalho(apelido, nome, email, aniversario, tipo);
            }

            throw new IllegalArgumentException("Subtipo invalido!");
        }

        private void imprimirTodosContatos(Scanner teclado){
            System.out.print(String.format("\033[2J"));
            System.out.println("=== IMPRESSAO TODOS CONTATOS FACE FRIEND ===");

            int indiceAtual = 0;

            while(indiceAtual < contatos.length){

               Contato contatoAtual = contatos[indiceAtual];

               if(contatoAtual == null) return;

               contatoAtual.imprmirContato();

               indiceAtual++;
            }

            System.out.print("Pressione ENTER para voltar ao menu");
            teclado.nextLine(); teclado.nextLine();
        }

        private void imprimirFamiliares(Scanner teclado){
            System.out.print(String.format("\033[2J"));
            System.out.println("=== IMPRESSAO FAMILIARES FACE FRIEND ===");

            int indiceAtual = 0;

            while(indiceAtual < contatos.length){

                Contato contatoAtual = contatos[indiceAtual];

                if(contatoAtual == null) return;
                if(contatoAtual instanceof Familia) contatoAtual.imprmirContato();

                indiceAtual++;
            }

            System.out.print("Pressione ENTER para voltar ao menu");
            teclado.nextLine(); teclado.nextLine();
        }

        private void imprimirAmigos(Scanner teclado){
            System.out.print(String.format("\033[2J"));
            System.out.println("=== IMPRESSAO AMIGOS FACE FRIEND ===");

            int indiceAtual = 0;

            while(indiceAtual < contatos.length){

                Contato contatoAtual = contatos[indiceAtual];

                if(contatoAtual == null) return;
                if(contatoAtual instanceof Amigos) contatoAtual.imprmirContato();

                indiceAtual++;
            }

            System.out.print("Pressione ENTER para voltar ao menu");
            teclado.nextLine(); teclado.nextLine();
        }

        private void imprimirColegasTrabalho(Scanner teclado){
            System.out.print(String.format("\033[2J"));
            System.out.println("=== IMPRESSAO COLEGAS TRABALHO FACE FRIEND ===");

            int indiceAtual = 0;

            while(indiceAtual < contatos.length){

                Contato contatoAtual = contatos[indiceAtual];

                if(contatoAtual == null) return;
                if(contatoAtual instanceof Trabalho && ((Trabalho)contatoAtual).ehColega()) contatoAtual.imprmirContato();

                indiceAtual++;
            }

            System.out.print("Pressione ENTER para voltar ao menu");
            teclado.nextLine(); teclado.nextLine();
        }

        private void imprimirMelhoresAmigosIrmaosEColegasTrabalho(Scanner teclado){
            System.out.print(String.format("\033[2J"));
            System.out.println("=== IMPRESSAO MELHORES AMIGOS FACE FRIEND ===");

            int indiceAtual = 0;

            while(indiceAtual < contatos.length){

                Contato contatoAtual = contatos[indiceAtual];

                if(contatoAtual == null) return;
                if(contatoAtual instanceof Trabalho && ((Trabalho)contatoAtual).ehColega()) contatoAtual.imprmirContato();

                indiceAtual++;
            }

            System.out.print("Pressione ENTER para voltar ao menu");
            teclado.nextLine(); teclado.nextLine();
        }

        private void imprimirContato(int index, Scanner teclado){
            if(index < 0 || index >= contatos.length) throw new IllegalStateException("Indice invalido!");

            System.out.print(String.format("\033[2J"));
            System.out.println("=== IMPRESSAO CONTATO FACE FRIEND ===");

            Contato contatoAtual = contatos[index];
            if(contatoAtual != null) {
                System.out.println("Tipo : " + contatoAtual.getClass().getSimpleName());
                contatoAtual.imprmirContato();
            }

            System.out.print("Pressione ENTER para voltar ao menu");
            teclado.nextLine(); teclado.nextLine();
        }
    }

}
