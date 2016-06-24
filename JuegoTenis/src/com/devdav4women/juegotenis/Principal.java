package com.devdav4women.juegotenis;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Cancha cancha = new Cancha();
		JFrame miVentana = new JFrame("Juego Tenis");
		miVentana.add(cancha);
		
		miVentana.setSize(300, 300);
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			cancha.mover();
			cancha.repaint();
			Thread.sleep(10);
		}

	}

}
