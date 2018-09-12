public class reverse {
    public static void swap(char[] cArr,int front,int end){
        while(front<end){
            char tmp = cArr[end];
            cArr[end] = cArr[front];
            cArr[front] = tmp;
            front ++;
            end --;
        }
    }
    public static String swapSentence(String s){
        char[] cArr = s.toCharArray();
        //System.out.println(cArr);
        swap(cArr,0,cArr.length-1);
        //System.out.println(cArr);
        int begin=0;
        for(int i=1;i<cArr.length;i++){
            if(cArr[i]==' '){
                swap(cArr,begin,i-1);
                begin = i+1;
            }
        }

        swap(cArr,begin,cArr.length-1);
        //swap(cArr,begin,cArr.length-1);
        System.out.println(cArr);
        String str = new String(cArr);
        return str;
    }
    public static  void main(String[] args){
        String str = "how are you";
        String str_final = new String();
        str_final = swapSentence(str);
        System.out.println(str_final);
    }
}
