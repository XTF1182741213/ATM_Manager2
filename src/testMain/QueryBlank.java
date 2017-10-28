package testMain;

import java.util.Scanner;

import bean.Account;

public class QueryBlank {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String acct=scan.next();
		Account a=new Account();
		if(a.queryBlank(acct)){
			System.out.println("本账号为中国银行账号！");
		}else{
			System.out.println("其他银行账号！");
		}

	}

}
