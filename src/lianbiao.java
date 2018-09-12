
class  DATA2{
    String key;
    String name;
    int age;
        }
class CLType{
    DATA2 nodeData = new DATA2();
    CLType nextnode;//CLType类型的引用变量，此处是指包含指针地址、、所有节点存储独立而顺序表是数组形式，所有节点紧紧相依

    //添加节点
CLType  Addnode(CLType head,DATA2 nodeData){
    CLType node = new CLType();//分配内存空间
    node.nodeData = nodeData;
    node.nextnode = null;
    //以上制造新的节点
    //以下遍历链表 找到链尾
    //以下错误，不能修改head的结构
    //while(head.nextnode!=null){
    //定义一个temp临时存储
    CLType temp;
    temp = head;
       while(temp!=null){
            //temp.nodeData= temp.nextnode.nodeData;
            //temp.nextnode= temp.nextnode.nextnode;
           temp= temp.nextnode;
    }
    temp.nextnode=node;//将上面封好的节点接上去
    return head;
  //  return null;
}
//插入头结点
CLType insertHeadNode(CLType head,DATA2 nodeData){
    CLType node =  new CLType();
    node.nodeData = nodeData;
    //head 为链表头引用，本身就只有一个地址，没有nodedata
    node.nextnode=head;
    head= node;
    return head;//以上执向新增节点，此处是对真实内存空间作用，所以不用返回整个链表
    //return null;
}

//查找节点//只需要传入head节点即可，因为是引用吧，可以直接通过地址查到其他数据
    //遍历寻找，比对值，如何遍历呢，就是  temp= temp.nextnode；
CLType searchNode(CLType head,String key){
    CLType node,temp;
    //从头结点开始
    temp = head;
    //while(temp.nextnode!=null){  错误 因为head是没有nextnode属性的，所以  直接就是看看head是否为null
    while(temp!=null){
        if(temp.nodeData.key==key){
            return temp;
        }
        temp = temp.nextnode;
    }

    return null;
    }
//插入节点\
    //分配空间
    //插入  后面一个给temp。temp给前一个
    //参数是  head链表   关键字查找到相应位置  待插入数据
 //注意越界问题、新建node为空问题、search函数返回值为空问题
    //程序主体功能完成，也要考虑越界问题
CLType insertNode(CLType head,String key,DATA2 nodeData){
    CLType node,temp;
    //节点空间
    node = new CLType();
    node.nodeData = nodeData;
    temp=searchNode(head, key);
    node.nextnode = temp.nextnode;
    temp.nextnode = node;

return head;
}


//删除节点！！！
    //查找     删除
void deleteNode(CLType head,String key){
    CLType node ,temp;
   // node =  new CLType();
    //需要同时知道两个节点的位置才能完成删除，即前面一个节点和待删除节点
    node = head;
    temp = head;
    while(temp!=null){
        if(temp.nodeData.key==key){
            node.nextnode=temp.nextnode;
        }
        //node在temp前面一个
        node = temp;
        temp = temp.nextnode;
    }


}

//计算链表长度
int lenCL(CLType head){
    int len=0;
    CLType temp;
    temp = head;
    while(temp!=null) {
        len++;
        temp = temp.nextnode;
    }
    return len;
}

//显示所有节点
void showAll(CLType head){
    CLType temp;
    temp = head;
    DATA2 nodedata;
    while(temp!=null){
        nodedata = temp.nodeData;
        System.out.printf("(%s%s%d)\n",nodeData.key,nodeData.name,nodeData.age);
        temp = temp.nextnode;
    }
}
}
//准备数据000追加节点000插入头结点000查找节点000插入节点000删除节点000计算长度000显示所有节点 、、删除时   head不为空是删除的前提
public class lianbiao {
    public static void main(String[] args){
        CLType head = null;
        CLType CL = new CLType();
        DATA2 nodeData = new DATA2();
        nodeData.age = 11;
        nodeData.name = "suznhen";
        nodeData.key = "abcd";
        CL =  CL.Addnode( head,nodeData);
        System.out.println(CL.nodeData.name);
        //return head;
    }

}
