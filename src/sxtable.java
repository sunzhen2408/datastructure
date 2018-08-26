import com.sun.xml.internal.bind.v2.model.core.NonElement;

import java.util.Scanner;
class DATA{ //节点数据结构
 String Key;
 String Name;
 int Age;

}
class SLType {  //顺序表类型
	static final int MAXLEN = 100;
	DATA[] ListData = new DATA[MAXLEN + 1];//ListData 存储数据节点
	int ListLen;//已存节点数量

	//初始化
	void SLInit(SLType SL) {

		SL.ListLen = 0;

	}

	//插入
	int SLInsert(SLType SL, int n, DATA data) {
		if (SL.ListLen <= SL.MAXLEN) {//考虑表长度不越界
			if (n >= 1 || n <= MAXLEN ) {//考虑插入的节点的校验
				for (int i = SL.ListLen ; i > n ; i--) {
					SL.ListData[i + 1] = SL.ListData[i];

				}
				SL.ListData[n] = data;
				SL.ListLen++;
				return 1;
			} else {
				System.out.println("插入节点坐标错误");
				return 0;
			}

		} else {
			System.out.print("顺序表已经满了");
			return 0;
		}
	}

	void SLAdd(SLType SL, DATA data) {
		if (SL.ListLen > SLType.MAXLEN) {
			System.out.println("顺序表越界");

		}
		SL.ListData[SL.ListLen + 1] = data;
		SL.ListLen++;
		//return SL;
	}

	void SLlistAll(SLType SL) {
		for (int i = 1; i <=SL.ListLen; i++) {

			//System.out.println("删除之后");
			System.out.printf("(%s,%s,%d)\n", SL.ListData[i].Key, SL.ListData[i].Name, SL.ListData[i].Age);
			//return 0;
		}
	}

	void SLDelete(SLType SL, int n){//长度也要跟着删除1
		if(n>SL.ListLen && n<1)
		{
			System.out.println("n不符合规范");
		}
		for(int i = n+1;i<=SL.ListLen;i++){
			SL.ListData[i-1] = SL.ListData[i];
		}
		SL.ListLen--;
		//return 1;
	}
	DATA SLFindByNum(SLType SL, int n){
		if(n<1 || n>SL.ListLen){
			System.out.println("error");
			return null;//类型数据结构返回null
		}
		for(int i = 1; i<=SL.ListLen; i++){
			if(i==n){
				//SLlistAll(SL)
				System.out.println(SL.ListData[i].Key);
				return SL.ListData[n];
			}
		}
		return SL.ListData[1];
	}
    DATA SLFindByKey(SLType SL, String Key){
		for(int i=1;i<=SL.ListLen;i++){
			if(Key == SL.ListData[i].Key){
				System.out.println(Key);
				return SL.ListData[i];//返回节点的数据（结构）
			}else{

				System.out.println("have no this key");
				return null;
			}


		}
		return null;
	}

}


//以上定义节点类型和顺序表类型，顺序表类型中定义了一系列方法和成员变量\
//准备节点数据结构--顺序表数据结构----顺序表初始化------新增----插入---删除--查找
//数组越界的问题、输入坐标是否在合理范围之内等等
	public class sxtable{
		public static void main(String[] args) {
			//	int i;
			//定义顺序表
			SLType SL = new SLType();
			//定义节点引用变量
			DATA somedata;
			//初始化
			SL.SLInit(SL);
			//添加节点
			//定义节点对象
			DATA sdata = new DATA();
			sdata.Key = "imp";
			sdata.Name = "sunzhen";
			sdata.Age = 23;
			SL.SLAdd(SL, sdata);
			//插入节点
			//显示所有节点
			//System.out.println(SL.ListData[1].Age);
			System.out.println("输出全部节点");
			SL.SLlistAll(SL);
			SL.SLFindByNum(SL, 1);
			SL.SLFindByKey(SL, "imp");
			SL.SLDelete(SL,1);
			System.out.println("删除之后");
			if(SL.ListLen == 0){
				System.out.println("None");
			}


		}

	}


