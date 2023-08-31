package cabmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Chioce extends JFrame implements ActionListener{
	JFrame f;
	JButton b1,b2,b3,b4;
	JLabel l1;
	
	Chioce(){
	
		f=new JFrame("Create New Account");
		f.setBackground(Color.BLACK);
		
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("cabmanagement/icons/Certains.jpg"));
		Image img = ic.getImage().getScaledInstance(1000,914,Image.SCALE_DEFAULT);
		ImageIcon icl=new ImageIcon(img);
		l1=new JLabel(icl);
	
		b1=new JButton("User");
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.setBounds(400,300,200,50);
	
		b2=new JButton("Driver");
		b2.setBackground(Color.BLUE);
		b2.setForeground(Color.WHITE);
		b2.setBounds(400,400,200,50);
	
		b3=new JButton("Manager");
		b3.setBackground(Color.BLUE);
		b3.setForeground(Color.WHITE);
		b3.setBounds(400,500,200,50);
		
		b4=new JButton("EXIT");
		b4.setBackground(Color.RED);
		b4.setForeground(Color.WHITE);
		b4.setBounds(400,600,200,50);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l1);
		
		f.getContentPane();
		f.setVisible(true);
		f.setSize(1000,914);
		f.setLocation(0,0);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		String comnd=e.getActionCommand();
		if(comnd.equals("User"))
		{
			this.f.setVisible(false);
			new User_SignUp();
		}
		else if(comnd.equals("Driver"))
		{
			this.f.setVisible(false);
			new Driver_SignUp().setVisible(true);
		}
		else if (comnd.equals("Manager"))
		{
			this.f.setVisible(false);
			new SignUp().setVisible(true);
		}
		else if (comnd.equals("EXIT"))
		{
			System.exit(0);
		}
	}
	public static void main(String[] arg) {
		new Chioce();
	}
}  
