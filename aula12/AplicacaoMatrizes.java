//Achar o ponto de sela da matriz
public class AplicacaoMatrizes {

    public static void main(String[] args) {
        int[][] mat = { { 4,6,6 }, { 2,1,3 }, { 7,8,4 } };
        int indice_menor_coluna = 0;
        int menor_coluna=0;
        int maior_linha=0;
        int ponto_cela = 0;

        for (int j = 0; j < 3; j++) {
            maior_linha = 0;
            menor_coluna = 10;
            for (int i = 0; i < 3; i++) {
                if (mat[i][j] < menor_coluna) {
                    menor_coluna = mat[i][j];
                    indice_menor_coluna = i;
                }

            }
            for (int k = 0; k < 3; k++) {
                if (mat[indice_menor_coluna][k] > maior_linha) {
                    maior_linha = mat[indice_menor_coluna][k];
                }
            }
            if (menor_coluna == maior_linha) {
                ponto_cela = menor_coluna;
            }
        }
        System.out.printf("O ponto de sela é: %d", ponto_cela);
    }

}