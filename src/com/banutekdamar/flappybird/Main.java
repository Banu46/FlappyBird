package com.banutekdamar.flappybird;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static boolean gameOver = false;
	GamePanel game = new GamePanel();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePanel.frame = new GamePanel();
					GamePanel.frame.setVisible(true);
					GamePanel.frame.addKeyListener(GamePanel.bird);	
					GamePanel.bm = new BackgroundMovement();
					
					new Timer().schedule(new TimerTask() {
						
						@Override
						public void run() {
							if(!Main.gameOver)GamePanel.updateScreen();
						}
					},0, 1000/60);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public static void GameOver() {
		Main.gameOver = true;
		System.out.println("over");
//		JOptionPane.showMessageDialog(null, "asd", "asdasda", JOptionPane.INFORMATION_MESSAGE);
	}
}
