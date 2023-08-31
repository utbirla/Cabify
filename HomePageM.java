package cabmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class HomePageM extends JFrame implements ActionListener{
	JLabel l1;
	Font f,f1,f2;
	JPanel p1,p2;
	
	HomePageM(){
		super("Cab Booking Home Page");
		setLocation(0,0);
		setSize(1550,800);
		
		f=new Font("Aerial",Font.BOLD,20);
		f2= new Font("Gadugi",Font.BOLD,35);
		f1= new Font("MS UI Gothic",Font.BOLD,18);
		
		//image_additon
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("cabmanagement/icons/Homepage.png"));
		Image img = ic.getImage().getScaledInstance(1550,800,Image.SCALE_DEFAULT);
		ImageIcon icl=new ImageIcon(img);
		l1=new JLabel(icl);

		JMenuBar m1= new JMenuBar();
		JMenu men1= new JMenu("Customer Profile");
		JMenuItem ment1= new JMenuItem("Add Customer Profile");
		JMenuItem ment2= new JMenuItem("View Customer Profile");

		JMenu men2= new JMenu("Manage Customer");
		JMenuItem ment3= new JMenuItem("Update Customer Profile");

		JMenu men3= new JMenu("Book Intercity Cab");
		JMenuItem ment5= new JMenuItem("Book Cab");
		JMenuItem ment6= new JMenuItem("View Intercity Booked Cab");
		
		JMenu men7= new JMenu("Delete");
		JMenuItem ment12= new JMenuItem("Delete Customer");

		JMenu men8= new JMenu("Exit");
		JMenuItem ment14= new JMenuItem("Exit");
		
		men1.add(ment1);
		men1.add(ment2);
		men2.add(ment3);
		men3.add(ment5);
		men3.add(ment6);
		men7.add(ment12);
		men8.add(ment14);

		m1.add(men1);
		m1.add(men2);
		m1.add(men3);
		m1.add(men7);
		m1.add(men8);


		m1.setBackground(Color.YELLOW);

		men1.setForeground(Color.BLACK);
		men2.setForeground(Color.BLACK);
		men3.setForeground(Color.BLACK);
		men7.setForeground(Color.BLACK);
		men8.setForeground(Color.BLACK);
		
		men1.setPreferredSize(new Dimension(130,70));
		men2.setPreferredSize(new Dimension(130,70));
		men3.setPreferredSize(new Dimension(130,70));
		men7.setPreferredSize(new Dimension(70,70));
		men8.setPreferredSize(new Dimension(70,70));

		ment1.setBackground(Color.BLACK);
		ment2.setBackground(Color.BLACK);
		ment3.setBackground(Color.BLACK);
		ment5.setBackground(Color.BLACK);
		ment6.setBackground(Color.BLACK);
		ment12.setBackground(Color.BLACK);
		ment14.setBackground(Color.BLACK);


		ment1.setForeground(Color.YELLOW);
		ment2.setForeground(Color.YELLOW);
		ment3.setForeground(Color.YELLOW);
		ment5.setForeground(Color.YELLOW);
		ment6.setForeground(Color.YELLOW);
		ment12.setForeground(Color.YELLOW);
		ment14.setForeground(Color.RED);

		ment1.addActionListener(this);
		ment2.addActionListener(this);
		ment3.addActionListener(this);
		ment5.addActionListener(this);
		ment6.addActionListener(this);
		ment12.addActionListener(this);
		ment14.addActionListener(this);

		setJMenuBar(m1);
		add(l1);
		}

		public void actionPerformed(ActionEvent e)
		{
			String comnd=e.getActionCommand();
			if(comnd.equals("Add Customer Profile"))
			{
				new Add_CustomerM();
			}
			else if(comnd.equals("View Customer Profile"))
			{
				new View_Customer().setVisible(true);
			}
			else if (comnd.equals("Update Customer Profile"))
			{
				new Update_Customer().setVisible(true);
			}
			else if(comnd.equals("Book Cab")) {
				new Book_Cab().setVisible(true);
			}
			else if(comnd.equals("View Intercity Booked Cab")) {
				new View_BookedCab().setVisible(true);
			}
			else if(comnd.equals("Delete Customer")) {
				new Delete_Customer().setVisible(true);
			}
			else if (comnd.equals("Exit"))
			{
				System.exit(0);
			}
		}
	public static void main(String[] args){
		new HomePageM().setVisible(true);
		}
}