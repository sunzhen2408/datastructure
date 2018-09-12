import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//回溯思路是，挨个子串得到最终结果，起点是null，str.length(_)=0
// 先求出所有子的子集合，然后求出最后一个，判断模式：如果子集合为空，就直接加上这个字符
//一个不为空，就string+这个字符
//https://blog.csdn.net/nupt123456789/article/details/23170979
public class subset2 {
//
//    public static List<String> subSet(String str) {
//        List<String> list = new ArrayList<String>();
////        递归到str待去字符串为0
//        if (str.length() == 0) {//递归结束条件.彻底结束
//            list.add(null);//如果字符串为空，添加一个空集合
//            return list;
//        }
//        List<String> subList = subSet(str.substring(1));
//        System.out.println(subList);
//        for(String string:subList){//将第一个元素添加到所有子串中
//            if(string==null){//如果是空集，用空集去代表不包含该元素，因为空集与任何的交集为该集本身
//                list.add(""+str.charAt(0));
//            }else {
//                list.add(string+str.charAt(0));
//            }
//        }
//        System.out.println(list);
//        list.addAll(subList);//合并这两个部分
//
//        return list;
//
//    }

    public static List<String> subSet(String str) {
        List<String> list = new ArrayList<String>();
        if (str.length() == 0) {//递归结束条件
            list.add(null);//如果字符串为空，添加一个空集合
            return list;
        }
        //获取str中，除去第一个元素后，子串的所有元素的子集
        List<String> subList = subSet(str.substring(1));
        for (String string : subList) {//将第一个元素添加到所有子串中
            if (string == null) {//如果是空集
                list.add("" + str.charAt(0));
            } else {
                list.add(string + str.charAt(0));
            }
        }
        list.addAll(subList);//合并这两个部分
        return list;
    }
        public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> list = subSet("UPUPJD");
       list.remove(null);
       Set<String> set = new HashSet<>(list);
        System.out.println("子集的数目："+set.size());
       // System.out.println(list);
        //for(String string:list){
          //  System.out.println(string);
       // }
    }


}
