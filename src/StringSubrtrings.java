public class StringSubrtrings {
    // StringSubrtrings

    public static void main(String[] args) {
        /////0123456789

        String  string1 = "Hello World";
        System.out.println(string1.substring(6)); //world
        System.out.println(string1.substring(0,1));
        System.out.println(string1.substring(6,7));

        String initial ="Micheal Jackson";

        System.out.println(initial.substring(0,1) + initial.substring(8,9));
        System.out.print(initial.substring(0,1) + "." + initial.substring(8,9)+ ".");
        System.out.println();


        String stringg= "the quick brown fox jums over the lazy dog.";
        System.out.println(stringg.substring(10,25));


    }
}
