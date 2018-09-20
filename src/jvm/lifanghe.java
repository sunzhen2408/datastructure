import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class lifanghe
{
    //完美立方

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int M=sc.nextInt();
             double N = Math.pow(M,(double)1/3);
            int count = 0;
            HashSet<Integer> hashSet = new HashSet<Integer>();
            int temp = 0;
            for(int a=1;a<=N;a++) {

                for (int b = 1;b<=N ;b++)
                    if(a!=b){
                    for (int c = 1; c<=N; c++)
                        if(  a!=c&& b!=c) {
                            for (int d = 1;d<=N ; d++)
                                if (a!=d&&b!=d&&c!=d){
                                    if (a * a * a + b * b * b ==c * c * c + d * d * d){
                                        if(temp<M) {
                                            temp = a * a * a + b * b * b;
//                                           hashset用add方法实现数值的去重添加
                                            hashSet.add(temp);
                                            // count++;
                                        }} }}}
        }
            System.out.println(hashSet.size());
           // System.out.println(count);
        }

    }


