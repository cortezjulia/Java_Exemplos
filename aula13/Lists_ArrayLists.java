import java.util.ArrayList;

class Lists_ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> estados = new ArrayList<String>();

        estados.add("Espírito Santo");
        estados.add("Ceará");
        estados.add("Rio de Janeiro");
estados.remove("Ceará");
if (estados.contains("RS"))
{
    System.out.println("Contém");
}

System.out.println(estados);
    }
}