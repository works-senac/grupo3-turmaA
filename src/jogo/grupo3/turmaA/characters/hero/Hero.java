package jogo.grupo3.turmaA.characters.hero;

import java.util.Scanner;

public class Hero {
    public static void main(String[] args) throws InterruptedException {
        Scanner hero = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String name = hero.next();
        System.out.println(
                name + ", ve sua vila infectada, porém como ainda era um jovem aprendiz de curandeiro ele acaba não conseguindo fazer nada.");
        System.out.println(name + " estava no seu treinamneto de curandeiro, no hospital da vila, quando derrepente...");
        Thread.sleep(1000);
        System.out.println("Seus amigos te chamam apavorados!");
        Thread.sleep(1000);
        System.out.println("Amigos: - " + name + " precisamos que você venha com a gente AGORA!!");
        Thread.sleep(1000);
        int decision1;

        while (true) {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Correr até sua casa com seus amigos");
            System.out.println("2. Ficar no treinamento de curandeiro");
            System.out.print("Digite o número da sua escolha: ");
            decision1 = hero.nextInt();

            switch (decision1) {
                case 1:
                    System.out.println("Você corre com eles até sua casa, e se depara com uma cena lamentável.");
                    Thread.sleep(2000);
                    System.out.println("Sua mãe contraiu o vírus!");
                    Thread.sleep(1000);
                    System.out.println(name + " faz os primeiros socorros e pede ao amigo para encontrar seu mestre!");
                    Thread.sleep(1000);
                    System.out.println("Seu mestre chega e usa seus poderes para salvá-la momentaneamente.");
                    Thread.sleep(1000);
                    System.out.println(name + " estava injuriado com o ocorrido.");
                    Thread.sleep(1000);
                    System.out.println(name
                            + ": - Mestre! Preciso fazer algo para resolver essa situação, a vila toda está morrendo!");
                    Thread.sleep(1000);
                    System.out.println(
                            "Mestre: - " + name + ", existe um jeito de conseguir salvar sua mãe e essa vila! ");
                    Thread.sleep(1000);
                    System.out.println(
                            name + ": - Como mestre? Diga-me para que possamos resolver isso de uma vez por todas!");
                    Thread.sleep(1000);
                    System.out.println(
                            "Mestre: - " + name
                                    + ", Existe uma lenda de uma flor curandeira que pode curar qualquer tipo de doença! ");
                    Thread.sleep(1000);
                    System.out.println(name
                            + ": - Então tomei minha decisão! Irei atrás da flor mágica, mestre, peço que cuide de minha mãe e da vila até eu encontra-la!");
                    Thread.sleep(1000);
                    System.out.println(
                            "Mestre: - " + "Mas calma garoto, você precisará disso para os desafios no caminho!");
                    Thread.sleep(1000);
                    System.out.println("Mestre entrega o livro de mágias para " + name);
                    Thread.sleep(1000);
                    System.out.println(
                            "Mestre: - Pronto agora você terá como encontrar a flor mágica , boa sorte em sua jornada, estaremos te esperando.");
                    Thread.sleep(1000);
                    System.out.println("Oh não! " + name
                            + " encontra o primeiro monstro! Pelo visto é um tipo de monstro de fogo! ");
                    Thread.sleep(1000);
                    int decision2;

                    while (true) {
                        System.out.println("Escolha uma ação:");
                        System.out.println("1. Abrir o livro de mágias e usar os golpes");
                        System.out.println("2. Correr e se esconder");
                        System.out.print("Digite o número da sua escolha: ");
                        decision2 = hero.nextInt();

                        switch (decision2) {
                            case 1:

                                System.out.println("Abre o livro de mágias, qual mágia você usará?");
                                // pegar as magias no outro código e usar aqui
                                // Fazer um if, caso a mágia esteja certa ou errada.
                                Thread.sleep(1000);
                                // Caso correta
                                System.out.println(name + ", ataca! ");
                                Thread.sleep(2000);
                                System.out.println("O monstro cai e você finaliza.");
                                Thread.sleep(1000);
                                System.out.println(
                                        name + ": - Ufaa! Ainda bem que consegui pegar certo, se não eu ia de ralo.");
                                Thread.sleep(1000);
                                System.out.println(name + " continua sua jornada em busca da flor!");
                                Thread.sleep(1000);
                                System.out.println(name + " encontra uma placa");
                                // usar o modelo de texto com tabelas
                                Thread.sleep(1000);
                                System.out.println("Caminhos rochosos <--");
                                System.out.println("Penhasco de Prata -->");
                                System.out.println("Escolha uma ação:");
                                System.out.println("1. Caminhos rochosos ");
                                System.out.println("2. Penhasco de Prata ");
                                System.out.print("Digite o número da sua escolha: ");
                                int decision3 = hero.nextInt();
                                switch (decision3) {

                                    case 1:

                                        System.out.println(name + ", segue pelos caminhos rochosos.");
                                        System.out.println("E então " + name + " escuta um estrondo!!!");
                                        Thread.sleep(2000);
                                        System.out.println("O montro de pedra surge em sua frente");
                                        Thread.sleep(1000);
                                        System.out.println(name
                                                + ": - Esse é muito maior que o outro! Será que terei poder suficiente?");
                                        Thread.sleep(1000);
                                        System.out.println(name + " abre o livro de mágias");
                                        // Usar o livro de magias
                                        // Caso mágia correta
                                        System.out.println(name + ", usa mágia correta!");
                                        Thread.sleep(2000);
                                        System.out.println("O monstro desvia!");
                                        System.out.println(name + ": - Droga, como esse bicho desviou desse ataque?");
                                        Thread.sleep(1000);
                                        // tenta de novo
                                        System.out.println(name + ", tenta novamente!");
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                        System.out.println("Sucesso!");
                                        Thread.sleep(1000);
                                        System.out
                                                .println("O monstro se esfarela e " + name + " continua seu caminho.");
                                        break;

                                    case 2:
                                        System.out.println(name + ", segue pelo Penhasco de Prata!");
                                        System.out.println("Seguindo seu caminho, ele sente um cheiro desagradavel!");
                                        System.out.println("Um bicho brilhante estava devorando uma vaca!");
                                        System.out.println(name+": - Um bicho feito totalmente de prata?");
                                        System.out.println(name+": - Como posso derrota-lo? Já sei precisarei de ataque do tipo fogo!");
                                        System.out.println(name+": - Assim poderei derrete-lo para continuar!");
                                        System.out.println(name+", abre o livro de mágia.");
                                        //Encontrar o livro do tio fogo no livro de mágia
                                        System.out.println(name+" usa o ataque do tipo fogo!");
                                        System.out.print(".");
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                        Thread.sleep(1000);
                                        System.out.print(".");
                                        Thread.sleep(1000);
                                        System.out.println(" O monstro cai!");
                                        System.out.println(name+": - Receba seu doce!");
                                        System.out.println(name+", após vencer o monstro de prata segue seu caminho.");
                                        System.out.println("Continuando sua jornada, "+name+" encontra o penhasco, porém ele encontra uma ponte!");
                                        System.out.println(name+" : - Droga! essa ponte me parece meio bamba, será que devo arriscar?");
                                        while (true) {
                                            System.out.println("Escolha uma ação:");
                                            System.out.println("1. Atravessar a ponte");
                                            System.out.println("2. Tentar dar a volta");
                                            System.out.print("Digite o número da sua escolha: ");
                                            int decision4 = hero.nextInt();

                                            switch (decision4) {
                                                case 1:

                                                    System.out.println(name+", atravessa a ponte!");
                                                    System.out.println(name+": - UoU! Quase que eu caio.");
                                                    System.out.println("Uma madeira quebrou, quase rompendo a corda!");
                                                    while (true) {
                                                        System.out.println("Escolha uma ação:");
                                                        System.out.println("1. Concertar a madeira");
                                                        System.out.println("2. Seguir sem arrumar a corda");
                                                        System.out.print("Digite o número da sua escolha: ");
                                                        int decision5 = hero.nextInt();

                                                        switch (decision5){
                                                            case 1:
                                                                System.out.println(name+", arruma a madeira e segue seu caminho.");
                                                                break;
                                                            case 2:
                                                                System.out.println(name+"");
                                                        }
                                                    }


                                                case 2:


                                                    break;
                                                case 3:
                                                    hero.close();
                                                    return;
                                                default:
                                                    System.out.println("Você inseriu um valor errado, tente novamente.");
                                            }


                                        }
                                }

                                break;
                            case 2:

                                System.out.println(name + " corre e se esconde no arbusto!");
                                System.out.println("O monstro o encontra, e tenta te atacar.");
                                System.out.println(name + " corre, e ao tentar olhar para trás, cai de um penhasco!");
                                System.out.println("Fim do jogo.");

                                break;
                            case 3:
                                hero.close();
                                return;
                            default:
                                System.out.println("Você inseriu um valor errado, tente novamente.");
                        }

                        // Pergunta ao usuário se ele quer voltar ao menu ou sair
                        System.out.println("Deseja voltar ao menu ou sair? (v para voltar / s para sair)");
                        String escolha = hero.next().toLowerCase();

                        if (escolha.equals("s")) {
                            System.out.println("Saindo do jogo. Até mais!");
                            break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("Você não vai com eles e fica no treinamento de curandeiro.");
                    System.out.println("Sua mãe chega infectada pelo vírus, quase sem vida.");
                    System.out.println("Porém o seu mestre não estava no momento, e você não conseguiu fazer nada.");
                    break;
                case 3:
                    System.out.println("Era sua mãe infectada pelo vírus necessitando dos primeiros socorros.");
                    System.out.println("Ela acaba não suportando!");
                    hero.close();
                    return;
                default:
                    System.out.println("Você inseriu um valor errado, tente novamente.");
            }

            // Pergunta ao usuário se ele quer voltar ao menu ou sair
            System.out.println("Deseja voltar ao menu ou sair? (v para voltar / s para sair)");
            String escolha = hero.next().toLowerCase();

            if (escolha.equals("s")) {
                System.out.println("Saindo do jogo. Até mais!");
                break;
            }
        }
        hero.close();
    }
}