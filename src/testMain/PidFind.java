package testMain;

import java.util.Scanner;

import bean.Account;
import bean.Custnfo;

public class PidFind {
	public static void main(String[] args) {
		System.out.println("输入身份证号:");
		Scanner scan=new Scanner(System.in);
		String pid=scan.next();
		Custnfo c=new Custnfo();
		System.out.println("姓名  "+"身份证"+"手机号"+"地址");
		System.out.println(c.toString(pid));
		
	}
	//根据身份证号返回Account数组对象
	public Account[] getAccount(String personalId){
			Account a[] = new Account[1];
			return a;
	}
	//根据银行卡号存款
	public void saveMoney(String bankAccount){
			
	}

}
