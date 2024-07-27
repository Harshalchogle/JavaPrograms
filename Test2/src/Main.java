//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[])
    {
        int n=3443;
        String s = String.valueOf(n);
        StringBuilder sb=new StringBuilder(s);
        String rev = sb.reverse().toString();
        Integer i = Integer.valueOf(rev);
        if(n==i){
            System.out.println("Pallindrome");
        }else {
            System.out.println("not pallindrome");
        }

    }}