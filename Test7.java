import java.util.Scanner;
public class Test7 {
	public static void main(String[]args) {
		//break跳转语句
		//一，Math类中random方法是随机生成一个double值 该值大于等于0小于1 
		//若要随机生成1-100之间的数字则 (int)Math.random()*100+1 
		//需要强制转换成int数据 +1是为了输出1-100之间数即该值大于等于1小于等于100 
//		int count = 0;
//		for(int i=1;i<=100;i++){
//			int num = (int)(Math.random()*100)+1;
//			System.out.println(num);
//		    count++;
//		    System.out.println("i = "+i);
//		    
//		    if(num == 97) {
//		    	  System.out.println("在第"+count+"次是97");
//		    	break;
//		    }
//		   	
		//二，1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
		/*分析：1-100之间的数求和 int sum = 0；
		 *     当sum > 20 时跳出循环
		 *     利用for循环实现代码
		 *     将最后的i值打印出来 用int temp = 0来接收
		 * 
		 * 
		 * */
//		int temp = 0;
//		int sum = 0;
//		for(int i = 1;i <= 100;i++) {
//		sum += i;
//		if(sum>20) {
//			System.out.println("和大于20时，当前数i="+i);
//			temp = i;
//			break;
//		  }
//	   }
		
		//三，实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，
		//否则提示还有几次机会，请使用 for+break 完成 
		/* 提示:需要用到String类中的equles方法实现字符串内容比较name.equles"丽华" 
		 * 返回的时布尔值 true or false
		 * 1，创建scanner方法 接收用户输入
		 * 2，定义String name String password 
		 * 3，利用for循环实现 最多三次 
		 * 4，定义变量chance提示还有几次机会
		 * 5,登入成功就跳出break
		 * 代码实现;
		 * */
//		int chance = 3;
//      Scanner myScanner = new Scanner(System.in);   
//      for(int i = 1;i <= 3;i++) {
//    	  System.out.println("请输入名字:");
//    	  String name = myScanner.next();
//    	  System.out.println("请输入密码：");
//    	  String password = myScanner.next();
//    	  if("丁真".equals(name) && "666".equals(password)) {
//    		  System.out.println("登入成功！！");
//    		 break;
//    	  }
//    	  
//    	  chance--; 
//    	  System.out.println("输入错误你还有"+chance+"机会再次输入");
//      }
  	//coutiune控制语句 用于结束当前循环 继续执行到下次循环判断 
//		int i = 1;
//		while(i<=4) {
//	        i++;
//	        if(2 == i) {
//	        	continue;
//	        }
//	        System.out.println(i);//结果为3，4，5
//	        3
//	        4
//	        5
//		}
		
	 double money = 100000;
//	 double i=0.05;
	 int count = 0;
    while(true) {
    	if(money>50000) {
//    		money -= (money*i);
    		money *= 0.95;
    		count++;
    	}
    	else if(money>= 1000 && money<=50000) {
    		money -= 1000;
    		count++;		
    	}else {
    	   
    	   break;
    	}
    	
    }
    System.out.println("该人可以经过"+count+"个路口");
   }
}


