package testMain;

import java.util.Vector;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JTableTest extends JFrame implements ActionListener{
	JButton but;
	JTable table;
	
	public JTableTest(){
		Vector head = new Vector();
		head.add("����");
		head.add("����");
		
		Vector<Vector> data = new Vector<Vector>();
		Vector a = new Vector();
		a.add("����");
		a.add("34");
		Vector b = new Vector();
		b.add("����");
		b.add("45");
		
		data.add(a);
		data.add(b);
		
		table = new JTable(data, head);


		this.add(new JScrollPane(table));
		
		this.setBounds(100, 20, 200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		but = new JButton("ȷ��");
		this.add(but, new BorderLayout().SOUTH);
		but.addActionListener(this);
		
	}
	
	public static void main(String[] args){
		new JTableTest();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == but){
			System.out.println(table.getSelectedRow());
		}
	}
}
