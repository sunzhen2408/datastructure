//回溯思路是：填空完成len=0
//递归，正想思维时，可以反向来看看什么时候终止
//subset1是挨个放入法，subset2是集合求子集法；
//https://blog.csdn.net/abc7845129630/article/details/52734148
public class subset {
    public static  void Selectallsun(char[] c,int begin, int len, StringBuffer sb){
//        终止条件：分为123长度，长度为0代表已经填满
        if(len == 0){
            System.out.println(sb+" ");
            return;
        }
        if(begin == c.length){
//            System.out.println("结束");
            return;
        }
// 将当前元素添加进list中
//        求子串的子集合
//        不需要当前元素的话，删除第一个，
//        求接下来几个元素的子集合

        sb.append(c[begin]);
//        System.out.println(len);
        Selectallsun(c,begin+1,len-1,sb);
//        System.out.println(len);
        sb.deleteCharAt(sb.length()-1);
        Selectallsun(c,begin+1,len,sb);//begin向后，但是len不变，意思就是不放入

    }
    public static  void main(String[] args){
        String s = "abc";
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer("");
        int len = c.length;
        for (int i=1; i<=len;i++){
            Selectallsun(c,0,i,sb);

        }




    }

}
