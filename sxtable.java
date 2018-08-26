import java.util.Scanner;
class DATA{ //节点数据结构
 String Key;
 String Name;
 int Age;

}
class SLType{  //顺序表类型
  static final int MAXLEN = 100;
  DATA[] ListData = new DATA[MAXLEN+1];//ListData 存储数据节点
  int ListLen;//已存节点数量
}
//初始化
void SLInit(SLType SL){

 SL.ListLen = 0;

}

//插入
int SLInsert(SLType SL, int n,DATA data){
  if(SL.ListLen<=SL.MAXLEN){//考虑表长度不越界
	if(n>=0 || n<=MAXLEN-1){//考虑插入的节点的校验
		
	

		}else{
			System.out.println("插入节点坐标错误")

		}	

     }else{
	System.out.print("顺序表已经满了")
	return 0;

}
}


