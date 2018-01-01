public class CompareToChallenge {
    public static void main(String[] args){
        System.out.print("Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);

        String dog = "dog";
        String dog2 = "dog";
        System.out.print("Comparing \"dog\" with \"dog\" produces ");
        i = dog.compareTo(dog2);
        System.out.println(i);

        System.out.print("Comparing \"dogs\" with \"dog\" produces ");
        i = "dogs".compareTo("dog");
        System.out.println(i);

        System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
        i = "applebee's".compareTo("apple");
        System.out.println(i);

        System.out.print("Comparing \"bee\" with \"gee\" produces ");
        int k = "bee".compareTo("gee");
        System.out.println(k);

        System.out.print("Comparing \"A\" with \"B\" produces ");
        int a = "A".compareTo("B");
        System.out.println(a);

        System.out.print("Comparing \"B\" with \"A\" produces ");
        int b = "B".compareTo("A");
        System.out.println(b);

        System.out.print("Comparing \"A\" with \"C\" produces ");
        int c = "A".compareTo("C");
        System.out.println(c);

        System.out.print("Comparing \"C\" with \"A\" produces ");
        c = "C".compareTo("A");
        System.out.println(c);

        System.out.print("Comparing \"a\" with \"A\" produces ");
        c = "a".compareTo("A");
        System.out.println(c);

        System.out.print("Comparing \"ab\" with \"ac\" produces ");
        c = "ab".compareTo("ac");
        System.out.println(c);
    }
}
