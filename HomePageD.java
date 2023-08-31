package cabmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.border.Border;
//import javax.swing.border.EtchedBorder;

import java.sql.*;
import java.util.*;

public class HomePageD extends JFrame implements ActionListener{
	JFrame f;
	JButton l1,l2,l3,l4,l5;
	JLabel p1;
	
	HomePageD(){
		f=new JFrame("HomePage");
		f.setBackground(Color.BLACK);
		f.setLayout(null);
		
		//image_additon
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("cabmanagement/icons/HomePageD.png"));
		Image img = ic.getImage().getScaledInstance(1354,758,Image.SCALE_DEFAULT);
		ImageIcon icl=new ImageIcon(img);
		p1=new JLabel(icl);
		p1.setBounds(0,0,1354,758);

		l1=new RoundedBorder("PROFILE");
		l1.setBackground(Color.YELLOW);
		l1.setForeground(Color.BLACK);
		l1.setBounds(300,590,120,120);
		
		l2=new RoundedBorder("ADD DETAILS");
		l2.setBackground(Color.YELLOW);
		l2.setForeground(Color.BLACK);
		l2.setBounds(500,590,120,120);
		
		l3=new RoundedBorder("UPDATE DATA");
		l3.setBackground(Color.YELLOW);
		l3.setForeground(Color.BLACK);
		l3.setBounds(700,590,120,120);
		
		l4=new RoundedBorder("VIEW DRIVES");
		l4.setBackground(Color.YELLOW);
		l4.setForeground(Color.BLACK);
		l4.setBounds(900,590,120,120);
		
		l5=new RoundedBorder("EXIT");
		l5.setBackground(Color.YELLOW);
		l5.setForeground(Color.BLACK);
		l5.setBounds(1100,590,120,120);
		
	    f.add(l1);
	    f.add(l2);
	    f.add(l3);
	    f.add(l4);
	    f.add(l5);
	    f.add(p1);
	    
		f.getContentPane();
		f.setVisible(true);
		f.setSize(1354,758);
		f.setLocation(0,0);
		
		l1.addActionListener(this);
		l2.addActionListener(this);
		l3.addActionListener(this);
		l4.addActionListener(this);
		l5.addActionListener(this);
		

		}

		public void actionPerformed(ActionEvent e)
		{
			String comnd=e.getActionCommand();
			if(comnd.equals("PROFILE"))
			{
				new ProfileD();
			}
			else if(comnd.equals("UPDATE DATA")) {
				new UpdateD().setVisible(true);
			}
			else if(comnd.equals("VIEW DRIVES")) {
				new View_BookedCab().setVisible(true);
			}
			else if(comnd.equals("ADD DETAILS")) {
				new Add_IntraCity_Driver().setVisible(true);
			}
			else if (comnd.equals("EXIT"))
			{
				System.exit(0);
			}
		}
	public static void main(String[] args){
		new HomePageD();
		}
}
