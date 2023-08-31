package cabmanagementsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class RoundedBorder extends JButton {
	public String label;
	public int a,b;
	  public RoundedBorder(String label) {
		  super(label);
		  Dimension size = getPreferredSize();
		    size.width = size.height = Math.max(size.width,size.height);
		    setPreferredSize(size);

	    setContentAreaFilled(false);
	    
	  }
	protected void paintComponent(Graphics g) {
	    if (getModel().isArmed()) {
	      g.setColor(Color.WHITE);
	    } else {
	      g.setColor(Color.YELLOW);
	    }
	    g.fillOval(a, b, 120,120);

	    super.paintComponent(g);
	  }

	  protected void paintBorder(Graphics g) {
	    g.setColor(Color.YELLOW);
	    g.drawOval(a,b, 120,120);
	  }

	  Shape shape;
	  public boolean contains(int x, int y) {
	    if (shape == null || 
	      !shape.getBounds().equals(getBounds())) {
	      shape = new Ellipse2D.Float(a, b, 120,120);
	      
	    }
	    return shape.contains(x, y);
	  }
}

	





