package testMain;

import java.util.Scanner;

import bean.Account;

public class Deposit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("输入存款卡号:");
		String account = scan.next();
		System.out.println("输入存款金额:");
		double money = scan.nextDouble();
		Account act = new Account();

		if (act.deposit(account, money))
			System.out.println("存款成功!");
		else
			System.out.println("存款失败！");

	}

}
