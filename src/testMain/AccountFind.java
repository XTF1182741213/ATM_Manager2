package testMain;

import bean.Account;

public class AccountFind {

	public static void main(String[] args) {
		Account a=new Account();
		System.out.println("账号                  "+"  密码    "  +" 余额           "+"状态");
		System.out.println(a.toString("1"));

	}
	//根据银行卡号返回Account对象
	public Account getAccount(String bankAccount){
		
		return new Account();
	}
	//根据银行卡号存款
	public void saveMoney(String bankAccount){
		
	}
}
