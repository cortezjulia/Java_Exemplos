class AplicacaoVetores {

    public static void main(String[] args) {

        int[] passaros_por_dia = { 5, 1, 10, 3, 6, 12, 2, 9, 4, 20, 2, 21, 6, 1 };

        int var_soma_total = 0;// total de passaros na semana

        for (int i = 0; i < 14; i++) {
            var_soma_total = var_soma_total + passaros_por_dia[i];

        }
        System.out.printf("Total de pássaros contados: %d", var_soma_total);
        System.out.println("\n");

        int var_soma_primeira = 0; // total de passaros na primeira semana
        int var_soma_segunda = 0; // total de passaros na segunda semana

        for (int i = 0; i < 7; i++) {
            var_soma_primeira = var_soma_primeira + passaros_por_dia[i];
        }
        for (int i = 7; i < 14; i++) {
            var_soma_segunda = var_soma_segunda + passaros_por_dia[i];
        }
        System.out.printf("Pássaros na primeira semana: %d", var_soma_primeira);
        System.out.println("\n");
        System.out.printf("Pássaros na segunda semana: %d", var_soma_segunda);
    }

}