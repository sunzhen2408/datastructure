
import java.util.*;
//for(int i =0;i<List.size();i++){
//输入多行          while(sc.hasNext()){
//            int temp = sc.nextInt();
//            List.add(temp);
//        }
//思想：
//1）确定需要关键变量：left right mid  根据比较改变left right
//2）终止条件  ： 就是left>right
// 核心就是默认数组有序，从小到大，通过  拿key与mid去比较，key大于mid就缩小左边界，key小于mid就缩小右边界
public class binary_search {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          ArrayList<Integer> List =  new ArrayList<Integer>();
          String s = sc.nextLine();//一行数据给字符串
          String[] c = s.split("\\s+");//分割转化成数组
          for(int i = 0;i<c.length;i++){
              List.add(Integer.parseInt(c[i]));
          }
//          System.out.println(List);
          int gogal = sc.nextInt(); //再单独输出数字

          int result = BinarySearch( List,List.size(),gogal);
        System.out.println(result);
    }
    public static int BinarySearch(ArrayList<Integer> List,int size,int gogal){
        int left = 0;
        int right = List.size()-1;
        int mid = (left+right)/2;
        while(left<right){
             mid = (left+right)/2;
             if(gogal>List.get(mid)){
                 left = mid+1;
             }else if(gogal<List.get(mid)){
                 right = mid -1;
             }else{
                 return mid;
             }
        }
        return -1;
    }
}
