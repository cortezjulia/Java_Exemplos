
public class exe_matrizes {

    public static void main(String[] args) {
        int[][] mat = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = j;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i+ " - " + mat[i][j]);
                
            }
        }

    }

}