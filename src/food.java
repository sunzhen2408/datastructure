//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
///**
// * @author cgh
// */
//public class food {
//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int m = s.nextInt();
//        int p = s.nextInt();
//        Integer[] temp_array = new Integer[n];
//        for (int i = 0; i < n; i++){
//            temp_array[i] = s.nextInt();
//        }
//        s.nextLine();
//        for (int j = 0; j < m; j++){
//            String str = s.nextLine();
//            String[] ss = str.split(" ");
//            if (ss[0].equals("A")){
//                A[Integer.valueOf(ss[1]) - 1]++;
//            }else {
//                A[Integer.valueOf(ss[1]) - 1]--;
//            }
//        }
//        int cur = A[p - 1];
//        Arrays.sort(A, new Comparator<Integer>(){
//            public int compare(Integer o1, Integer o2) {
//                if(o1 < o2){
//                    return 1;
//                }else if(o1 == o2){
//                    return 0;
//                }else{
//                    return -1;
//                }
//            }});
//        int res = two(A,0,A.length - 1, cur);
//        System.out.println(res + 1);
//    }
//
//    public static int  two(Integer[] arr, int l, int h, int target){
//        int mid;
//        while (l < h){
//            mid = (l + h)/ 2;
//            if (arr[mid] > target){
//                l = mid + 1;
//            }else {
//                h = mid;
//            }
//        }
//        if (arr[l] == target){
//            return l;
//        }else {
//            return -1;
//        }
//    }
//}
