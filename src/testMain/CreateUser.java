package testMain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import bean.Account;
import bean.Custnfo;

public class CreateUser {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		String acct = scan.next();//卡号
		
		int passwd = scan.nextInt();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String rdate = df.format(new Date());// 读取现在系统时间
		System.out.println(rdate);
		double balance = scan.nextDouble();//余额
		int status = scan.nextInt();//卡的状态
		String addressCard = scan.next();//开卡地址
		String blank1=scan.next();//所属银行
		int    card1=scan.nextInt(); //7表示信用卡，8表示储蓄卡
		Account ac = new Account();
		// 输入账号信息
		ac.setAcct(acct);
		ac.setPasswd(passwd);
		ac.setRdate(rdate);
		ac.setBalance(balance);
		ac.setStatus(status);
		ac.setAddressCard(addressCard);
		ac.setBlank(blank1);
		ac.setCard(card1);
				
		// 输入用户信息
		String name = scan.next();//姓名
		String sex=scan.next();//性别
		String pid = scan.next();//身份证
		String phone = scan.next();//手机号
		String address = scan.next();
		Custnfo information = new Custnfo();
		if (ac.create(acct, passwd, rdate, balance, status, addressCard,blank1,card1)
				&& information.createInfo(acct,name,sex, pid, phone, address)) {
		
			System.out.println("开户成功！");
		} else {
			System.err.println("开户失败！");
		}
	}

}
