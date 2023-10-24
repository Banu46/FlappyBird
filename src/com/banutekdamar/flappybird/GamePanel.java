package com.banutekdamar.flappybird;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GamePanel extends JFrame{

	private static JPanel contentPane;
	static BirdMovement bird;
	static GamePanel frame;
	static BackgroundMovement bm;
	static Toolkit toolkit = Toolkit.getDefaultToolkit();
	public static int  frame_WİDHT = toolkit.getScreenSize().width*2/3;
	public static int  frame_HEİGHT = toolkit.getScreenSize().height*2/3;
	public static double verticalSpeed;



	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public GamePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, frame_WİDHT, frame_HEİGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		bird = new BirdMovement();
		contentPane.add(bird);
		bird.setSize(100,100);
		bird.setBackground(Color.red);
	}

	public static void updateScreen() {
//		Main.GameOver();
		for(JPanel panel : BackgroundMovement.liste) {
			panel.setLocation(panel.getX()-1, panel.getY());
			if(panel.getX() < -100) {
				panel.setLocation(frame_WİDHT, panel.getY());
				
			}
		}
		
		bird.setLocation(0, (int) (bird.getY()+ verticalSpeed) );
		bird.repaint();
		verticalSpeed += (frame_HEİGHT/480.0)*0.15 ;
		if(bird.getY()+BirdMovement.birdHeight > frame_HEİGHT || bird.getY()+BirdMovement.birdHeight < 0) {
			Main.GameOver();
		}
	}

}
