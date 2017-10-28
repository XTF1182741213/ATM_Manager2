package testMain;

import java.util.Scanner;

import bean.Admin;

//管理员通过输入管理员账号，密码进行登录
public class AdminLogin {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("管理员账号:");
		long adminAccount = scan.nextLong();
		System.out.print("管理员密码:");
		int adminpassword = scan.nextInt();
		Admin adm = new Admin();
		adm.setAdminID(adminAccount);
		adm.setAdminPassword(adminpassword);
		/*
		 * 该方法是检测输入的管理员账号密码是否正确 如果管理员账号和密码正确，能进行管理员操作 adm.check(adminAccount,
		 * adminpassword);
		 */
		if (adm.check(adminAccount, adminpassword)) {
			System.out.println("成功登陆管理员账号" + adm.getAdminID());
		} else {
			System.err.println("登陆失败，管理员账号密码是否正确?");
		}

	}

}
