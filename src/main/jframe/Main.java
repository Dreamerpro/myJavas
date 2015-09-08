package main.jframe;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args){
		
		JFrame jf=new JFrame();
		jf.setTitle("My Jframe");
		Toolkit tk=jf.getToolkit();
		Dimension dm=tk.getScreenSize();
		jf.setBounds(dm.width/4, dm.height/4, dm.width/2, dm.height/2);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		
		JPanel contentPan=new JPanel(new BorderLayout());
		contentPan.setBorder(null);
		Button bt=new Button("push me");
		bt.setSize(100, 100);
		contentPan.add(bt, BorderLayout.CENTER);
		
		jf.setContentPane(contentPan);
		jf.setVisible(true);
	}
}
