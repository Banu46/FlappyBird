package com.banutekdamar.flappybird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BirdMovement extends JLabel implements KeyListener{
	
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(0, 0, getWidth(), getHeight());
    }
	public static int birdWidth= BirdMovement.WIDTH, birdHeight = BirdMovement.HEIGHT;
	 
	public BirdMovement() {
//		try {
//			BufferedImage bi = ImageIO.read(getClass().getResource("kuşgibikuş.png"));
//			setIcon(new ImageIcon(bi.getScaledInstance(birdWidth, birdHeight, Image.SCALE_SMOOTH)));
//			setSize(birdWidth,birdHeight);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		setSize(100, 100);
//		setBackground(Color.red);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			
				
			GamePanel.verticalSpeed =(int) ((- GamePanel.frame_HEİGHT/480.0)*2);
			
				
			}		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
