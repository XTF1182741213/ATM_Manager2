package testMain;

import java.util.Scanner;

import bean.Account;

public class QueryBalance {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("输入你要查询的账号:");
		String acct = scan.next();
		Account a=new Account();

		System.out.println("该账号的余额为:" + a.queryBalance(acct));

	}

}
