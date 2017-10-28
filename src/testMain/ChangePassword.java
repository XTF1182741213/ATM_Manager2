package testMain;

import java.util.Scanner;

import bean.Account;

public class ChangePassword {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入卡号:");
		String act=scan.next();
		System.out.println("输入新密码:");
		int newpassword=scan.nextInt();
		Account a=new Account();
		if(a.changePassword(act, newpassword))
		{
			System.out.println("密码修改成功");
		}else{
			System.out.println("密码修改失败");
		}

	}

}
