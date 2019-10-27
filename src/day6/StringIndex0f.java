package day6;

public class StringIndex0f {
    // Searching in String with index0f()
    public static void main(String[] args) {
        //01234
        String  s1= "hello";
        System.out.println(s1.indexOf("ello"));
        System.out.println("==============");
        // lenght index
        // techno
        // 012345

        String  s2= "Techno Study";
        int indexs2 = s2.indexOf("ech");
        System.out.println(indexs2);

        String str= "techno study";
        int index= str.indexOf("e");//1
        int length= str.length();//12
        int sum = length + index;


        System.out.println(sum);







    }
}
