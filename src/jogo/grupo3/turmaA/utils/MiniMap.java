package jogo.grupo3.turmaA.utils;

public class MiniMap {
    private static final int LINHAS = 5;
    private static final int COLUNAS = 7;
    private final char[][] mapa = new char[LINHAS][COLUNAS];
    private int jogadorLinha = 2;
    private int jogadorColuna = 3;

    public MiniMap() {
        inicializarMapa();
        adicionarObstaculos();
        atualizarPosicaoJogador();
    }

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

    public void moverJogador(int novaLinha, int novaColuna) {
        if (novaLinha < 0 || novaLinha >= LINHAS || novaColuna < 0 || novaColuna >= COLUNAS) {
            System.out.println("Movimento inválido! Fora dos limites do mapa.");
            return;
        }

        if (mapa[novaLinha][novaColuna] == '#') {
            System.out.println("Movimento bloqueado! Obstáculo encontrado na posição (" + novaLinha + ", " + novaColuna + ").");
            return;
        }

        mapa[jogadorLinha][jogadorColuna] = '.';

        jogadorLinha = novaLinha;
        jogadorColuna = novaColuna;
        atualizarPosicaoJogador();
    }

    public void exibirMapa() {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // public static void main(String[] args) {
    //     MiniMap minimap = new MiniMap();
    //     minimap.exibirMapa();
    //
    //     System.out.println("\nMovendo o jogador...\n");
    //     minimap.moverJogador(0, 6);
    //     minimap.exibirMapa();
    //
    //     System.out.println("\nTentando mover para um obstáculo...\n");
    //     minimap.moverJogador(3, 4);
    //     minimap.exibirMapa();
    // }
}
