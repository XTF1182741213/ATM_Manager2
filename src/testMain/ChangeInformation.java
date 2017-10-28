package testMain;

import java.util.Scanner;

import bean.Custnfo;

public class ChangeInformation {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入要修改的卡号：");
		String acct = scan.next();// 要修改的卡号
		System.out.println("输入姓名:");
		String name = scan.next();// 输入要修改成的姓名
		System.out.println("输入手机号:");
		String phone = scan.next();// 输入要修改成的电话号
		System.out.println("输入地址:");
		String address = scan.next();// 输入要修改成的地址
		Custnfo user = new Custnfo();

		
		//user.changeName(acct, name); 修改姓名
		//user.changePhone(acct, phone); 修改电话号
		//user.changeAddress(acct, address); 修改地址
		if(user.changeName(acct, name)&&user.changePhone(acct, phone)&&user.changeAddress(acct, address)){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}

	}

}
