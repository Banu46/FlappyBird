package com.banutekdamar.flappybird;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class BackgroundMovement {

	public static ArrayList<JPanel> liste = new ArrayList<>();

	public static int location = 250;

	public BackgroundMovement() {

		Random random = new Random();

		int totalColumn = GamePanel.frame_HEİGHT-GamePanel.bird.getSize().height*3/2;


		int[] dizi = new int[6];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = random.nextInt(totalColumn);
			int bolum = totalColumn - dizi[i];

			JPanel panel = new JPanel();
			liste.add(panel);
			GamePanel.frame.add(panel);
			panel.setSize(100,bolum);
			panel.setLocation(location+i*(150), 0);
			panel.setBackground(Color.black);
			
			panel = new JPanel();
			liste.add(panel);
			GamePanel.frame.add(panel);
			panel.setSize(100,dizi[i]);
			panel.setLocation(location+i*(150),bolum + GamePanel.bird.getSize().height*3/2);
			panel.setBackground(Color.green);

		}

	}

}
