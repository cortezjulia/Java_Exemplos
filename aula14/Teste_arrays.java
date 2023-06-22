import java.util.ArrayList;

class Teste_arrays {

    public static void main(String[] args) {

        ArrayList<String> bandas = new ArrayList<String>();

        bandas.add("Kiss");
        bandas.add("Natiruts");
        bandas.add("Jota Quest");

        System.out.println(bandas);
        bandas.add(bandas.indexOf("Kiss"), "Capital Inicial");

        System.out.println(bandas);

        bandas.remove("Kiss");
        System.out.println(bandas);

        bandas.clear();
        System.out.println(bandas);
    }
}