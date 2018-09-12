public class subset3 {
    public static void Combine(char[] c){
        if(c == null)
            return;
        int len = c.length;
        boolean used[] =new boolean[len];//false
      // System.out.println(used[2]);
        char cache[] = new char[len];
        int result =len;
        while(true){
            int index = 0;
            while (used[index]){
                used[index] = false;
                ++result;
                if(++index == len){
                    return;
                }
            }
            System.out.println(index);
            used[index] = true;
            System.out.println(c[index]);
            cache[--result] = c[index];
            //System.out.println(cache[--result]);
            //System.out.print(new String(cache).substring(result)+" ");
        }
    }
    public static void main(String[] args){
        String s = "abc";
        char[] c = s.toCharArray();
        Combine(c);
    }
}
