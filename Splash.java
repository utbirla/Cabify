package cabmanagementsystem; //need to tell jvm address

import javax.swing.*; //for jframe class
import java.awt.*;  //for scaling image

public class Splash extends JFrame implements Runnable
{
   
    Thread t;
    Splash () //constucture  (so that as soon as class runs the frame is shown)
    {
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("cabmanagement/icons/Screenshot 2023-03-02 234005.png"));  //object to get image of screen
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);  //scaling image to fit it perfectly
        ImageIcon i3 = new ImageIcon(i2);   //since jlable  dont take image clas  obj directly as argument
        JLabel image = new JLabel(i3);  //since add dont take image directly as argument
        add(image);  ////placing any component(here image ) on frame
       
        t = new Thread(this);
        t.start();
       
        setVisible(true);  //visibilty of frame hidden(= True so that it is visisble)
       
        int x = 1;
        for (int i = 2; i <= 600; i+=4, x+=1) //used the loop so the frame inc in the starting
        {
            setLocation(600 - ((i + x)/2), 350 - (i/2)); //changing location of frame(x,y)
            setSize(i + 3*x, i + x/2); //size of frame (x,y)
           
            try {
                Thread.sleep(8); //code of exectued can be paused for some time
            } catch (Exception e) {}
        }        
    }
   
    public void run() {
        try {
            Thread.sleep(5500);
            setVisible(false);
           
            // Next Frame
            new Chioce();
        } catch (Exception e) {
           
        }
    }
   
    public static void main(String[] args) //to run class need main method
    {
        new Splash();  //actual object of class (anonymous object)
    }
}