package jogo.grupo3.turmaA.utils;

public class MiniMap {
    // Definindo o tamanho do minimapa
    private static final int LINHAS = 5;
    private static final int COLUNAS = 7;

    // Criando a matriz para representar o mapa
    private final char[][] mapa = new char[LINHAS][COLUNAS];

    // Posição inicial do jogador
    private int jogadorLinha = 2;
    private int jogadorColuna = 3;

    public MiniMap() {
        inicializarMapa();
        adicionarObstaculos();
        atualizarPosicaoJogador();
    }

    // Inicializa o mapa com espaços vazios
    private void inicializarMapa() {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                mapa[i][j] = '.';
            }
        }
    }

    private void adicionarObstaculos() {
        atualizarPosicaoObstaculo(2, 4);
        atualizarPosicaoObstaculo(3, 4);
        atualizarPosicaoObstaculo(4, 4);
        atualizarPosicaoObstaculo(4, 5);
    }

    private void atualizarPosicaoObstaculo(int novaLinhaObst, int novaColunaObst) {
        mapa[novaLinhaObst][novaColunaObst] = '#';
    }

    private void atualizarPosicaoJogador() {
        mapa[jogadorLinha][jogadorColuna] = 'P';
    }

    // Move o jogador no mapa com validação para obstáculos
    public void moverJogador(int novaLinha, int novaColuna) {
        // Verifica se a nova posição está dentro dos limites do mapa
        if (novaLinha < 0 || novaLinha >= LINHAS || novaColuna < 0 || novaColuna >= COLUNAS) {
            System.out.println("Movimento inválido! Fora dos limites do mapa.");
            return;
        }

        // Verifica se a nova posição contém um obstáculo
        if (mapa[novaLinha][novaColuna] == '#') {
            System.out.println("Movimento bloqueado! Obstáculo encontrado na posição (" + novaLinha + ", " + novaColuna + ").");
            return;
        }

        // Limpa a posição atual do jogador
        mapa[jogadorLinha][jogadorColuna] = '.';

        // Atualiza para nova posição
        jogadorLinha = novaLinha;
        jogadorColuna = novaColuna;
        atualizarPosicaoJogador();
    }

    // Imprime o minimapa no console
    public void exibirMapa() {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MiniMap minimap = new MiniMap();
        minimap.exibirMapa();

        System.out.println("\nMovendo o jogador...\n");
        minimap.moverJogador(4, 5); // Exemplo de movimento do jogador
        minimap.exibirMapa();

        System.out.println("\nTentando mover para um obstáculo...\n");
        minimap.moverJogador(3, 4); // Tentativa de mover para um obstáculo
        minimap.exibirMapa();
    }
}
