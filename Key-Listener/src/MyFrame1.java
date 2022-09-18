import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame1 extends JFrame implements KeyListener{
	
	   JLabel label;
	   ImageIcon icon;
	   
       MyFrame1(){
    	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	   this.setSize(1600,1000);
    	   this.addKeyListener(this);
    	   this.setLayout(null);  //layout is set to null because we are manually going to move components in frame using keystrokes
    	  
    	  icon=new ImageIcon("rocket-icon-2.png"); 
    	   
    	   
    	   label = new JLabel();
    	   label.setBounds(0,0,512,512);
    	   //label.setBackground(Color.gray);
    	  // label.setOpaque(true);
    	   label.setIcon(icon);
    	   
    	   this.getContentPane().setBackground(Color.black);
    	   this.add(label);
    	   this.setVisible(true);
    	   
       }

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		 
		case 'a': label.setLocation(label.getX()-10,label.getY());
		         break;
		case 'w': label.setLocation(label.getX(),label.getY()-10);
		         break;
		case 'd': label.setLocation(label.getX()+10,label.getY());
                 break;
		case 's': label.setLocation(label.getX(),label.getY()+10);
                 break;


		
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		//System.out.println("you used key char: " + e.getKeyChar());
		//System.out.println("you used key code: " + e.getKeyCode());
		
	}
}
