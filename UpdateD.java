package cabmanagementsystem;
import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
import java.sql.*;

public class UpdateD extends JFrame implements ActionListener
{
	JLabel l1,l2,l3, l4, l5, l6, l7,l8,l9,l10,l11,l12,l13;
	JButton bt1, bt2;
	JPanel p1,p2,p3;
	JTextField tf1, tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
	Font f,f1;
	Choice ch;
	
	UpdateD()
	{
		super("Update Driver");
		setSize(740,700);
		setLocation(50,50);
		f=new Font("Arial", Font.BOLD, 25);
		f1=new Font("Arial", Font.BOLD, 18);
		
		ch=new Choice();
		try
		{
			ConnectionClass obj=new ConnectionClass();
			String q="Select name from profiled";
			ResultSet rest=obj.stm.executeQuery(q);
			while(rest.next())
			{
				ch.add(rest.getString("name"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		l1=new JLabel("Update_Driver");
		l1.setHorizontalAlignment(JLabel.CENTER);
		l2=new JLabel("Name");
		l3=new JLabel("Age");
		l4=new JLabel("Blood Group");
		l5=new JLabel("Phone");
		l6=new JLabel("Address");
		l7=new JLabel("City");
		l8=new JLabel("Pincode");
		l9=new JLabel("Addhar");
		l10=new JLabel("DL No.");
		l11=new JLabel("Car Model");
		l12=new JLabel("Car No.");
		l13=new JLabel("Experience");
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf7=new JTextField();
		tf8=new JTextField();
		tf9=new JTextField();
		tf10=new JTextField();
		tf11=new JTextField();
		
		bt1=new JButton("Update");
		bt2=new JButton("Back");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		l1.setFont(f); 
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		l10.setFont(f1);
		l11.setFont(f1);
		l12.setFont(f1);
		l13.setFont(f1);
		
		tf1.setFont(f1);
		tf2.setFont(f1);
		tf3.setFont(f1);
		tf4.setFont(f1);
		tf5.setFont(f1);
		tf6.setFont(f1);
		tf7.setFont(f1);
		tf8.setFont(f1);
		tf9.setFont(f1);
		tf10.setFont(f1);
		tf11.setFont(f1);
		
		ch.setFont(f1);
		bt1.setFont(f1);
		bt2.setFont(f1);
		
		
		bt1.setBackground(Color.BLACK);
		bt2.setBackground(Color.RED);
		bt1.setForeground(Color.WHITE);
		bt2.setForeground(Color.WHITE);
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(1,1,10,10));
		p1.add(l1);
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(1,1,10,10));
		
		p3=new JPanel();
		p3.setLayout(new GridLayout(13,2,10,10));
		p3.add(l2);
		p3.add(ch);
		p3.add(l3);
		p3.add(tf1);
		p3.add(l4);
		p3.add(tf2);
		p3.add(l5);
		p3.add(tf3);
		p3.add(l6);
		p3.add(tf4);
		p3.add(l7);
		p3.add(tf5);
		p3.add(l8);
		p3.add(tf6);
		p3.add(l9);
		p3.add(tf7);
		p3.add(l10);
		p3.add(tf8);
		p3.add(l11);
		p3.add(tf9);
		p3.add(l12);
		p3.add(tf10);
		p3.add(l13);
		p3.add(tf11);
		p3.add(bt1);
		p3.add(bt2);
		
		setLayout(new BorderLayout(10,10));
		add(p1,"North");
		add(p2,"West");
		add(p3,"Center");
		
		ch.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0)
				{
			try
			{
				ConnectionClass obj2=new ConnectionClass();
				String name=ch.getSelectedItem();
				String q1="select * from profiled where name='"+name+"'";
				ResultSet rest1=obj2.stm.executeQuery(q1);
				while(rest1.next())	
				{
					tf1.setText(rest1.getString("age"));
					tf2.setText(rest1.getString("blood_group"));
					tf3.setText(rest1.getString("mobile_no"));
					tf4.setText(rest1.getString("address"));
					tf5.setText(rest1.getString("city"));
					tf6.setText(rest1.getString("pincode"));
					tf7.setText(rest1.getString("aadhar"));
					tf8.setText(rest1.getString("dl_no"));
					tf9.setText(rest1.getString("car_model"));
					tf10.setText(rest1.getString("car_no"));
					tf11.setText(rest1.getString("experience"));
				}
			}
			catch(Exception exx)
			{
				exx.printStackTrace();
			}
				}
	});
		
}
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==bt1) {
			
			String name=ch.getSelectedItem();
			String age=tf1.getText();
			String blood_group=tf2.getText();
			String mobile_no=tf3.getText();
			String address=tf4.getText();
			String city=tf5.getText();
			String pincode=tf6.getText();
			String aadhar=tf7.getText();
			String dl_no=tf8.getText();
			String car_model=tf9.getText();
			String car_no=tf10.getText();
			String experience=tf11.getText();
			
			try
			{
				ConnectionClass obj3=new ConnectionClass();
				String q1="Update profiled set age='"+age+"',blood_group='"+blood_group+"',mobile_no='"+mobile_no+"',address='"+address+"',city='"+city+"',pincode='"+pincode+"',aadhar='"+aadhar+"',dl_no='"+dl_no+"',car_model='"+car_model+"',car_no='"+car_no+"',experience='"+experience+"' where name='"+name+"'";
				int aa=obj3.stm.executeUpdate(q1);
				if(aa==1)
				{
					JOptionPane.showMessageDialog(null,"your data successfully updated");
					this.setVisible(false);
					new HomePageD().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please!, fill all details carefully");	
				}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
			
		}
		if(e.getSource()==bt2)
		{
			this.setVisible(false);
		}
	}
	public static void main(String args[]) 
	{
		new UpdateD().setVisible(true);
	}
}

