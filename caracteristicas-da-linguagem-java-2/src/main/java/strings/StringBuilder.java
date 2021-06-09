package strings;

public class StringBuilder {

  public static void main(String[] args) {

    var nome = "André";


    System.out.println("A B C D E F G ".toCharArray());
    System.out.println("Aula de JAVA".split(""));
    System.out.println("Aula".concat(" de java"));
    System.out.println("1234 asda qw".replaceAll("[a-c]", "#"));


   // final var builder = new java.lang.StringBuilder(nome);
   // System.out.println(builder.append("Luis"));

    //final var reverse = builder.reverse();

    //System.out.println(reverse);

   // final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
   // System.out.println(insert);

  }

}
