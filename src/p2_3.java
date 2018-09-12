import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

class DATA3{
    String name;
    int age;
        }
class StackType{
    static final int MAXLEN = 50;
    DATA3[] data  = new DATA3[MAXLEN+1];//数据顺序栈是数组
    int top;//栈顶

    //初始化
    StackType STInit(){
        StackType p;
        if((p = new StackType())!=null){//申请栈内存，判断新建的栈对象实例是否为空
            p.top=0;
            return p;
        }else
            return null;
    }
    //判断栈是否为空
    boolean STisEmpty(StackType ST){
        boolean t;
        t=(ST.top==0);
        return t;
    }
    //判断栈是否已满
    boolean STisFull(StackType ST){
        boolean t;
        t = (ST.top==MAXLEN);
        return t;
    }
    //清空栈,还要释放空间
    void deleteAll(StackType ST){
        ST.top = 0;
        if(ST!=null){//释放空间
            ST=null;
        }
    }
    //入栈操作
    int pushST(StackType ST,DATA3 data3){
        if(ST.top>=MAXLEN){
            System.out.println("yichu");
            //break;
            return 0;
        }
        ST.top++;//top属于计数器，自然而然要使用top作为下标 获取data数据
        //栈中是属于数组形式，所以data3存在于数组数据中
        ST.data[ST.top] = data3;
        return 1;
    }
    //出栈操作//加上读取数据
    DATA3 popST(StackType ST){
        if(ST.top<=0){
            System.out.println("越界了");
            System.exit(0);
        }
        ST.top--;

        return ST.data[ST.top];
    }
    //读取栈顶数据
    DATA3 readTop(StackType ST){
        if(ST.top==0){
            System.out.println("weikong");
            System.exit(0);
        }
        return(ST.data[ST.top]);
    }
    //du


}


public class p2_3 {
}
