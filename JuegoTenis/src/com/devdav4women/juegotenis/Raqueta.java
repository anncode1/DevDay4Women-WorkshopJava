package com.devdav4women.juegotenis;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Raqueta {
	
	int x = 0;
	int xa = 0;
	Cancha cancha;
	
	public Raqueta(Cancha cancha) {
		// TODO Auto-generated constructor stub
		this.cancha = cancha;
	}
	
	public void moverRaqueta() {
		if (x + xa > 0 && x + xa < cancha.getWidth() - 60) {
			x = x + xa;
		}
		
	}
	public void pintarRaqueta(Graphics2D graphics2d) {
			graphics2d.fillRect(x, 250, 60, 10);
	}
	
	public void  keyReleassed(KeyEvent e) {
		xa = 0;
	}
	
	public void  keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			xa = -1;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			xa = 1;
		}
		
	}
	
	public Rectangle obtenerLimites() {
		return new Rectangle(x, 250, 60, 10);
	}
}
