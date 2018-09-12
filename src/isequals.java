import java.util.Arrays;
public class isequals {
    public static void compare(String s1,String s2){
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        Arrays.sort(b1);
        Arrays.sort(b2);
        s1 = new String(b1);
        s2 = new String(b2);
        if(s1.equals(s2)){
            System.out.println("两字符串相等");
        }else{
            System.out.println("两字符串不等");
        }

    }
    public static void  main(String[] args){
        String s1 = "abcd";
        String s2 = "bcad";
        compare(s1,s2);

    }
}
