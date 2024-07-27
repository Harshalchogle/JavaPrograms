public class ImmutableCheck {
    public static void main(String[] args) {
        String s1="Java";
        String s2=s1;
        System.out.println(s1 == s2);
        s1="Phthon";
        System.out.println(s2);

        if(s1==s2){
            System.out.println("s1==s2"+ s1+" "+s2);
        }
        else if(s1.equals(s2)){
            System.out.println("s1.equals(s2)"+s1+" "+s2);
        }
        else {
            System.out.println("Nothing == or equals " + s1 + " " + s2);
        }
    }
}
