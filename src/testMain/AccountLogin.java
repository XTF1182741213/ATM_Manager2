package testMain;

import java.util.Scanner;

import bean.Account;
import bean.Admin;

public class AccountLogin {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("卡号:");
		String userAccount = scan.next();
		System.out.print("该卡密码:");
		int userpassword = scan.nextInt();
		Account account = new Account();
		account.setAcct(userAccount);
		account.setPasswd(userpassword);
		/*
		 * 该方法是检测输入的管理员账号密码是否正确 如果管理员账号和密码正确，能进行管理员操作 adm.check(adminAccount,
		 * adminpassword);
		 */
		if (Account.checkAccount(userAccount, userpassword)) {
			System.out.println("成功客户卡号:" + account.getAcct());
		} else {
			System.err.println("登陆失败，输入账号或密码不正确?");
		}

	}

}
