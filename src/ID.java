import java.util.Scanner;
public class ID {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temp_id = sc.nextInt();
        int temp_p = temp_id/1000;
        //System.out.println(temp_p);
        int temp_n = temp_id%1000;
        System.out.println(temp_n);
        int[] temp_p_t= {temp_p/100,temp_p%100/10,temp_p%10};
        int[] temp_id_t= {temp_n/100,temp_n%100/10,temp_n%10};
        //int cha = temp_p-temp_n;
        int sum1 =0;
        int sum2 =0;
        for(int i = 0;i<temp_p_t.length;i++){
            sum1 += temp_p_t[i];
        }
        for(int i = 0;i<temp_id_t.length;i++){
            sum2 += temp_id_t[i];
        }
        System.out.println(sum1);
        System.out.println(sum2+"sum2");
        int cha = Math.abs(sum1-sum2);
        if(cha<=9){
            int final_re = 1;
            System.out.println(final_re);
        }else if(cha>9 && cha<=18){
            int final_re = 2;
            System.out.println(final_re);
        }else {
            int final_re = 3;
            System.out.println(final_re);
        }
    }
}
