package manager;
import javax.swing.*;

import bean.Account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel implements ActionListener{
	JButton addUserBut, changeInfoBut;
	JButton freezeBut, reportLossBut, delUserBut;
	JButton unFreezeBut, unReportLossBut, unDelUserBut, exitBut;
	JPanel changeInfoPanel;
	AddUserPanel addUserPanel;
	SearchPanel functionPanel;
	static JFrame frame;
	static String page = "";
	JButton button;
	String statusInfo[] = {"����", "����", "��ʧ", "����"};
	
	public static void main(String[] args){
		new HomePanel();
		
		frame = new JFrame();
		frame.setResizable(false); //���ɸı��С
		frame.setBounds(100, 20, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new HomePanel();
//		JPanel panel = new ChangeInfoPanel2("444");
		frame.add(panel);
		
		frame.setVisible(true);
	}
	
	public HomePanel(){
		initHomePanel();
		functionPanel = new SearchPanel();
		functionPanel.setVisible(false);
		this.add(functionPanel);
	}
	//��ʼ��HomePanel
	public void initHomePanel(){
		this.setLayout(null);
		this.setSize(1000, 600);
		this.setOpaque(false);
		
		addUserBut = new JButton();
		changeInfoBut = new JButton();
		freezeBut = new JButton();
		unFreezeBut = new JButton();
		reportLossBut = new JButton();
		unReportLossBut = new JButton();
		exitBut = new JButton();
		delUserBut = new JButton();
		button = new JButton("");
		
		//���ð�ť����
		addUserBut.setBounds(0, 0, 150, 150);
		changeInfoBut.setBounds(150, 0, 150, 150);
		freezeBut.setBounds(0, 150, 150, 150);
		unFreezeBut.setBounds(150, 150, 150, 150);
		reportLossBut.setBounds(0, 300, 150, 150);
		unReportLossBut.setBounds(150, 300, 150, 150);
		exitBut.setBounds(0, 450, 150, 150);
		delUserBut.setBounds(150, 450, 150, 150);
		button.setBounds(810, 100, 80, 40);
		button.setFont(new Font("����", Font.BOLD+Font.ITALIC, 18));
		
		//���ð�ť���ɼ�
		addUserBut.setContentAreaFilled(false);  
		addUserBut.setBorderPainted(false);   
		addUserBut.setFocusPainted(false);
		changeInfoBut.setContentAreaFilled(false);  
		changeInfoBut.setBorderPainted(false);   
		changeInfoBut.setFocusPainted(false);
		freezeBut.setContentAreaFilled(false);  
		freezeBut.setBorderPainted(false);   
		freezeBut.setFocusPainted(false);
		unFreezeBut.setContentAreaFilled(false);  
		unFreezeBut.setBorderPainted(false);   
		unFreezeBut.setFocusPainted(false);
		reportLossBut.setContentAreaFilled(false);  
		reportLossBut.setBorderPainted(false);   
		reportLossBut.setFocusPainted(false);
		unReportLossBut.setContentAreaFilled(false);  
		unReportLossBut.setBorderPainted(false);   
		unReportLossBut.setFocusPainted(false);
		exitBut.setContentAreaFilled(false);  
		exitBut.setBorderPainted(false);   
		exitBut.setFocusPainted(false);
		delUserBut.setContentAreaFilled(false);  
		delUserBut.setBorderPainted(false);   
		delUserBut.setFocusPainted(false);
		button.setVisible(false);
		
		//��ťע�������
		addUserBut.addActionListener(this);
		changeInfoBut.addActionListener(this);
		freezeBut.addActionListener(this);
		unFreezeBut.addActionListener(this);
		reportLossBut.addActionListener(this);
		unReportLossBut.addActionListener(this);
		exitBut.addActionListener(this);
		delUserBut.addActionListener(this);
		button.addActionListener(this);
		
		this.add(addUserBut);
		this.add(changeInfoBut);
		this.add(freezeBut);
		this.add(unFreezeBut);
		this.add(reportLossBut);
		this.add(unReportLossBut);
		this.add(exitBut);
		this.add(delUserBut);
		this.add(button);
		
	}
	//���ñ���ͼƬ
	public void paint(Graphics g){
		String path = "1000x600.png";
		ImageIcon icon = new ImageIcon(path);
		g.drawImage(icon.getImage(), 0, 0, this.getSize().width,this.getSize().height,this);
		super.paint(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addUserBut){ //�������������ť
			button.setVisible(false);
			if(addUserPanel != null){
				addUserPanel.setVisible(false);
			}
			if(functionPanel != null){
				functionPanel.setVisible(false);
			}
			
			addUserPanel = new AddUserPanel();
			addUserPanel.setBounds(350, 50, 600, 500);
			this.add(addUserPanel);

		}else if(e.getSource() == exitBut){ //������˳�����ť
			button.setVisible(false);
			int i = JOptionPane.showConfirmDialog(frame, "ȷ���˳���", "", JOptionPane.YES_NO_OPTION);
			if(i == 0){
				System.exit(0);
			}
		}else{
			button.setVisible(true); //�ָ���ť�ɼ�
			if(addUserPanel != null){
				addUserPanel.setVisible(false);
			}
			if(functionPanel != null){
				functionPanel.setVisible(false);
			}
			
			functionPanel.setVisible(true);
			
			
			if(e.getSource() == changeInfoBut){ //������޸���Ϣ����ť
				button.setText("�޸���Ϣ");
				button.setSize(110, 40);
				page = "changeInfo";
			}else if(e.getSource() == freezeBut){ //��������ᡱ��ť
				button.setText("����");
				button.setSize(80, 40);
				page = "freeze";
				
			}else if(e.getSource() == unFreezeBut){ //�����������ᡱ��ť
				button.setText("�������");
				button.setSize(110, 40);
				page = "unFreeze";
			}else if(e.getSource() == reportLossBut){ //�������ʧ����ť
				button.setText("��ʧ");
				button.setSize(80, 40);
				page = "reportLoss";
			}else if(e.getSource() == unReportLossBut){ //����������ʧ����ť
				button.setText("�����ʧ");
				button.setSize(110, 40);
				page = "unReportLoss";
			}else if(e.getSource() == delUserBut){ //�������������ť
				button.setText("����");
				button.setSize(80, 40);
				page = "delUser";
			}else if(e.getSource() == button){
				try{
					String account = functionPanel.getAccount(); //��ȡ����
					Account ac = new Account(); 
					int status = ac.getStatus(account); //��ȡ��ǰ״̬
					
					if(page.equals("changeInfo")){
						System.out.println("equals");
					}
					if(page.equals("changeInfo")){
						System.out.println("account: " + account);//�޸���Ϣ
						changeInfo(account); //�����޸���Ϣframe
					}else if(page.equals("freeze")){ //����
						if(status == 1){
							if(ac.changeStatus(account, 0))
								JOptionPane.showMessageDialog(null, "����ɹ���","������",  JOptionPane.INFORMATION_MESSAGE);
							functionPanel.updateTable();
						}
						else
							JOptionPane.showMessageDialog(frame, "���ܴӰ�" + statusInfo[status] + "״̬�Ŀ�����");
					}else if(page.equals("unFreeze")){ //�������
						if(status == 0)
						{
							ac.changeStatus(account, 1);
							functionPanel.updateTable();
						}
							
						else
							JOptionPane.showMessageDialog(frame, "���ܴӰ�" + statusInfo[status] + "״̬�Ŀ��������");
					}else if(page.equals("reportLoss")){ //��ʧ
						if(status == 1)
						{
							if(ac.changeStatus(account, 2))
								JOptionPane.showMessageDialog(null, "��ʧ�ɹ���","��ʧ���",  JOptionPane.INFORMATION_MESSAGE);
							functionPanel.updateTable();
						}
							
						else
							JOptionPane.showMessageDialog(frame, "���ܴӰ�" + statusInfo[status] + "״̬�Ŀ���ʧ");
					}else if(page.equals("unReportLoss")){ //�����ʧ
						if(status == 2)
						{
							if(ac.changeStatus(account, 1))
								JOptionPane.showMessageDialog(null, "�ÿ��ָ�������","���",  JOptionPane.INFORMATION_MESSAGE);
							functionPanel.updateTable();
						}
							
						else
							JOptionPane.showMessageDialog(frame, "���ܴӰ�" + statusInfo[status] + "״̬�Ŀ������ʧ");
					}else if(page.equals("delUser")){ //����
						if(status == 1)
						{
							if(ac.changeStatus(account, 3))
								JOptionPane.showMessageDialog(null, "�����ɹ���","�������",  JOptionPane.INFORMATION_MESSAGE);
							functionPanel.updateTable();
						}
							
						else
							JOptionPane.showMessageDialog(frame, "���ܴӰ�" + statusInfo[status] + "״̬�Ŀ�����");
					}
				}catch(Exception ee){
					System.out.println("���button�쳣");
				}

			}

		}
	}

	public void changeInfo(String acct){
		JFrame frame1 = new JFrame();
		frame1.setBounds(200, 20, 500, 410);
		JPanel panel = new ChangeInfoPanel2(acct);
		frame1.add(panel);
		
		frame1.setVisible(true);
	}
}
