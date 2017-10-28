package testMain;

import java.util.Scanner;

import bean.Account;

//更改状态，即改变status，0.冻结       1.正常	  2.挂失      3.销户
public class ChangeStatus {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("输入要修改状态的卡号:");
		String acct1 = scan.next();
		System.out.println("输入要修改成什么状态:0.冻结 1.正常	2.挂失 3.销户");
		int status = scan.nextInt();
		Account ac = new Account();
		switch (status) {
		case 0:
			if (ac.changeStatus(acct1, status))
				System.out.println("冻结成功！");
			break;
		case 1:
			if (ac.changeStatus(acct1, status))
				System.out.println("解挂/解冻  成功!");
			break;
		case 2:
			if (ac.changeStatus(acct1, status))
				System.out.println("挂失成功!");
			break;
		default:
			if (ac.changeStatus(acct1, status))
				System.out.println("销户成功!");
		}

	}

}
