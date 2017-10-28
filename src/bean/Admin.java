package bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.ConnectionFactory;
import jdbc.ControlDB;
import jdbc.DbClose;

public class Admin {
	private long adminID;
	private String adminName;
	private int adminPassword;
	private String adminJuris;

	public Admin() {

	}

	public long getAdminID() {
		return adminID;
	}

	public void setAdminID(long adminID) {
		this.adminID = adminID;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public int getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(int adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminJuris() {
		return adminJuris;
	}

	public void setAdminJuris(String adminJuris) {
		this.adminJuris = adminJuris;
	}

	// 检测该管理员账号密码是否正确
	public boolean check(long adminID1, int adminPassword1) throws Exception {;
		String sql = "select adminID,adminPassword from a_admin";
		ResultSet rs1 = ControlDB.executeQuery(sql);
		while (rs1.next()) {
			if (rs1.getLong("adminID") == adminID1&& rs1.getLong("adminPassword") == adminPassword1) {
				DbClose.close(rs1);
				return true;
			}
		}
		DbClose.close(rs1);
		return false;

	}

}
