public class Interfaces {

   //Por “obrigar” que as classes que implementem uma interface, também implementem seus métodos, 
   //as interfaces apenas definem as assinaturas dos métodos (tipo de retorno, nome e parâmetros). 
   //A partir daí, é obrigação da classe que quer implementar esta interface, utilize esta assinatura 
   //e implemente seus métodos. Estes métodos, assim como nas classes abstratas, devem ser abstratos.

   //Além disso, por não ser considerada uma classe, as interfaces não possuem construtores e, por isso,
   // não podem ser instanciadas, como as classes abstratas.

   //Sendo assim, sempre que precisarmos definir um conjunto de métodos que devem ser implementados 
   //por um grupo de classes, utilizamos as interfaces. Se precisarmos determinar uma classe base
   // para outras classes, que herdarão seus atributos e métodos e esta classe não deva ser instanciada, 
   //utilizamos as classes abstratas.
   public static void main(String[] args) {
      Conta cp = new Poupanca();
      cp.depositar(732);
      cp.sacar(8);
      cp.getSaldo();

   };

}