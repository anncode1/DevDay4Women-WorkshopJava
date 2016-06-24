package com.devdav4women.juegotenis;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Cancha extends JPanel {
	Pelota pelota = new Pelota(this);
	Raqueta raqueta = new Raqueta(this);
	
	public Cancha() {
		// TODO Auto-generated constructor stub
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				raqueta.keyReleassed(e);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				raqueta.keyPressed(e);
			}
		});
		
		setFocusable(true);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D graphics2d = (Graphics2D) g;
		pelota.pintarPelota(graphics2d);
		raqueta.pintarRaqueta(graphics2d);
		
		
	}
	
	public void  mover() {
		pelota.moverPelota();
		raqueta.moverRaqueta();
	}
	
	public void  gameOver() {
		JOptionPane.showMessageDialog(this, "Se termino el juego", "Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
		
	}

}
