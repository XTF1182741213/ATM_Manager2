package testMain;

import java.util.Scanner;

import bean.Account;

public class Withdrawals {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入取款卡号:");
		String accounts = scan.next();
		System.out.println("输入取出金额:");
		double moneyed = scan.nextDouble();
		Account acts = new Account();

		if (acts.withDrawals(accounts, moneyed))
			System.out.println("取款成功!");
		else
			System.out.println("取款失败！");

	}

}
