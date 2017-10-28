package testMain;

//4.取款，5.	存款，6.	转出,7.转进

import java.text.DateFormat;
import java.util.Scanner;

import bean.Deal;

public class DealLog {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入查找交易记录的卡号：");
		String account = scan.next();
		Deal deal = new Deal();
		
		
		deal.dealLog(account);// 打印交易记录
		

	}

}
