import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pailie
{
    /**
     *
     *
     *全排列（去除重复排序数组的全排序）：——全排列的java实现（无重复元素）
     *
     *需要去除重复的元素；既然元素值是重复的，那么我们可以将问题简化，将问题分解成去除数组中重复元素和全排列数组两部分；
     */

        private static List<String> list = new ArrayList<>();

        public static void doFullArrangement(String[] array) {
            /*
             * 清空list，因为此list是静态的，因此每次排序时都需要清空，否则的话若重复调用排序的方法的话将不会去除重复的排序
             */
            list.removeAll(list);
            int sum = getAllOrder(array, 0, array.length,0);
            System.out.println(sum);
        }

        /**
         *
         * @param start 从start开始，到end结束来全排列数组
         * @param end
         */
        private static int getAllOrder(Object[] array, int start, int end,int count) {


            if(start == end) {
                //将数组转换成字符串，通过判断list中是否包含该字符串（数组的字符串形式） 来 判断该数组有没有被输出过，从而
                //去除重复的数组排序。
                String arrayStr = Arrays.toString(array);
                if(!list.contains(arrayStr)) {
                    list.add(arrayStr);
                } else {
                    for(int i = 0;i<array.length-1;i++){
                        if(array[i]==array[i+1]){
                            break;
                        }
                        if(i==2){
                           count++;
                        }
                    }
                }
                return count ;
            } else {
                for(int i = start; i < end; i++) {
                    swap(array, start, i);
                     count = getAllOrder(array, start + 1, end,count);
                    swap(array, i, start);
                }
                return count ;
            }
        }

        //数组中的两个元素交换位置
        private static void swap(Object[] array, int i, int j) {
            if(i == j) {
                return;
            }
            Object temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<Integer>();
        String s =sc.nextLine();

        String[] temp = s.split("\\s+");
        int count_final = 0;
        for(int i = 0;i<temp.length;i++){
            int temp_1 = Integer.parseInt(temp[i]);
            List.add(temp_1);
        }
        ArrayList<String> List2 = new ArrayList<String>();
        String a= "P";
            String b= "Q";
            String c= "R";
            int count=0;
        for(int i = 0;i<List.size();i++){
            if(i==0){
                for(int j =0;j<List.get(i);j++){
                         List2.add(a);
                         count++;
                }
            }
            if(i==1){
                for(int j =0;j<List.get(i);j++){
                    List2.add(b);
                    count++;
                }
            }
            if(i==2){
                for(int j =0;j<List.get(i);j++){
                    List2.add(c);
                    count++;
                }
            }

        }
        String[] array = new String[count];
            for(int i = 0;i<List2.size();i++){
                 array[i] = List2.get(i);
            }
        doFullArrangement(array);
    }


}
