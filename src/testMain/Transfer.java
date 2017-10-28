package testMain;

import java.util.Scanner;

import bean.Account;

public class Transfer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("输入本银行卡的账号:");
		String first = scan.next();
		System.out.println("输入对方银行卡的账号:");
		String second = scan.next();
		System.out.println("输入所转金额:");
		double toMoney = scan.nextFloat();
		Account att = new Account();
		if (att.transferMoney(first, second, toMoney))
			System.out.println("转账成功!");
		else
			System.out.println("转账失败！");

	}

}
