public class strings {
    public static void main(String [] args)
    {
        String s = "Hello World";
        System.out.println(s);
        System.out.println(s.length());
        // To get char
        System.out.println(s.charAt(6));
        //traversing string
        for (int i=0;i<s.length();i++)
        {
          System.out.println(s.charAt(i));
        }

         char[] arr = s.toCharArray();

        for(char ch : arr) {
            System.out.println(ch);
        }
        String s1="hello";
        System.out.println(s1.equals(s));
        System.out.println("apple".compareTo("banana"));
        //substring 
        String word="programming";
        System.out.println(word.substring(3));
        System.out.println(word.substring(3,8));
        System.out.println(word.contains("gram") );
         System.out.println(word.indexOf('g') );
          System.out.println(word.toUpperCase());
          System.out.println(word.toLowerCase());

        String x = "   hello   ";
        System.out.println(x.trim());
         System.out.println(word.replace('m', 'x'));
         System.out.println(x.isEmpty());

         //Stringbuilder
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        System.out.println(sb.reverse());

        StringBuilder sb2 = new StringBuilder("hello");
        sb2.setCharAt(0, 'H');
        System.out.println(sb2);
        sb2.deleteCharAt(0);
        System.out.println(sb2);


        String result = sb2.toString();
        System.out.println(result);

        int num=Integer.parseInt("123");
        System.out.println(num);

        //Character functions 
        char ch='A';
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isLetterOrDigit(ch));


        char c = 'a'; //Ascii characters
        int ascii = c;
        System.out.println(ascii);
}
    
}
