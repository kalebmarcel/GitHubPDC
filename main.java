import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;
import java.lang.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class main extends JFrame
{
	Timer tm;
	car mbl = new car();
	Obstacle obst1 = new Obstacle(); //obstacle 1
	Obstacle obst2 = new Obstacle(); //obstacle 2
	Obstacle obst3 = new Obstacle(); //obstacle 3
	
	
	Container container = getContentPane();
	ImageIcon mobil = new ImageIcon("C://Users//user//Desktop//Mobil.png");
	ImageIcon obs1 = new ImageIcon("C://Users//user//Desktop//Obstekel.png");
	ImageIcon obs2 = new ImageIcon("C://Users//user//Desktop//Obstekel.png");
	ImageIcon obs3 = new ImageIcon("C://Users//user//Desktop//Obstekel.png");
	
	JLabel mbil = new JLabel(mobil);
	JLabel ob1 = new JLabel(obs1);
	JLabel ob2 = new JLabel(obs2);
	JLabel ob3 = new JLabel(obs3);
	
	
	
		Container penampung = getContentPane();
		
		public void addPicture()
	{
		obst1.SetobstaclePosition();
		obst2.SetobstaclePosition();
		obst3.SetobstaclePosition();
		
		penampung.add(mbil);
		mbil.setSize(55,40);
		mbil.setLocation(mbl.carX, mbl.carY);
		
		penampung.add(ob1);
		ob1.setSize(72,10);
		ob1.setLocation(obst1.x1, obst1.y1);
		
		
		penampung.add(ob2);
		ob2.setSize(72,10);
		ob2.setLocation(obst2.x2, obst2.y2);
				
		penampung.add(ob3);
		ob3.setSize(72,10);
		ob3.setLocation(obst3.x3, obst3.y3);
				
		tm = new Timer();
		tm.schedule(new TimerTask(){
		
		public void run() //ngejalanin loop
			{
			mbl.mobilGerak();
			mbil.setLocation(mbl.carX, mbl.carY);
		
			}
		},0,20);
	
	}

		public main()
	{  
	 setTitle("Car Simulator");
	 setVisible(true);
	 setSize(800, 600);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLocationRelativeTo(null);
	 setResizable(false);
	 container.setLayout(null);
			
		addPicture();
	}
	
	public static void main(String[] args) {
	 main Main = new main();
	 }
	
	
	}
