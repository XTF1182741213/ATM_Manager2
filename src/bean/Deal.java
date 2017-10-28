package bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import jdbc.ConnectionFactory;
import jdbc.ControlDB;
import jdbc.DbClose;

public class Deal {
	private String acctothers;
	private String seq;
	private DateFormat rdate;
	private int dtype;
	private float dealmoney;

	public float getDealmoney() {
		return dealmoney;
	}

	public void setDealmoney(float dealmoney) {
		this.dealmoney = dealmoney;
	}

	public DateFormat getRdate() {
		return rdate;
	}

	public void setRdate(DateFormat rdate) {
		this.rdate = rdate;
	}

	public int getDtype() {
		return dtype;
	}

	public void setDtype(int dtype) {
		this.dtype = dtype;
	}

	public String getAcctothers() {
		return acctothers;
	}

	public void setAcctothers(String acctothers) {
		this.acctothers = acctothers;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	// 交易记录，记录：时间，类型，对方账号，流水账，交易金额
	// 4.取款，5. 存款，6. 转出,7.转进
	public void dealLog(String acct) throws Exception {
		
		String sql12 = "select * from a_deal";
		ResultSet rs5 = ControlDB.executeQuery(sql12);
		while(rs5.next()){
		if (rs5.getString("acct").equals(acct) ){
			    String accountOthers = rs5.getString("acctothers");
				String seqEx = rs5.getString("seq");
				Timestamp datetime = rs5.getTimestamp("rdate");
				int type = rs5.getInt("dtype");
				float dmoney = rs5.getFloat("dealmoney");
				
				
				 
				switch (type) {
				case 4:
					System.out.println(datetime + "    " + "取款" + "        "
							+ accountOthers + "     " + seqEx + "       " + dmoney);
					break;
				case 5:
					System.out.println(datetime + "    " + "存款" + "        "
							+ accountOthers + "     " + seqEx + "       " + dmoney);
					break;
				case 6:
					System.out.println(datetime + "    " + "转出" + "        "
							+ accountOthers + "     " + seqEx + "       " + dmoney);
					break;
				default:
					System.out.println(datetime + "    " + "转进" + "        "
							+ accountOthers + "     " + seqEx + "       " + dmoney);
				}
				System.out.println();
				System.out.println("日期&时间：          "+datetime);
				System.out.println("类型：                       "+type);
				System.out.println("对方账号：             "+accountOthers);
				System.out.println("交易金额：             "+ dmoney);
				System.out.println("流水号：                  "+ seqEx);

			
		}
		DbClose.close(rs5);
		return;
	}
	}

}
