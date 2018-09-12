//temp
//时间换空间
//先遍历加
//再遍历减
public class isequals2 {
    public static void compare(String s1, String s2){
       byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        int[] bCount = new int[256];
        for(int i =0;i<256;i++){
            bCount[i]=0;
        }
        for(int i=0;i<b1.length;i++){
            bCount[b1[i]-'0']++;
        }
        for(int i=0;i<b2.length;i++){
            bCount[b2[i]-'0']--;
        }
        for(int i=0;i<256;i++){
            if(bCount[i]!=0) {
                System.out.println("有不同字符");
                return;
            }


        }
        System.out.println("相同字符");
    }
    public static  void main(String[] args){
        String s1 = "abcd";
        String s2 = "abcd";
        compare(s1,s2);

    }
}
