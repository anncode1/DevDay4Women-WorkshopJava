package com.devdav4women.juegotenis;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

public class Pelota {
	
	int x = 0;
	int y = 0;
	
	int xa = 1;
	int ya = 1;
	
	Cancha cancha;
	public Pelota(Cancha cancha) {
		// TODO Auto-generated constructor stub
		this.cancha = cancha;
	}
	
	public void moverPelota() {
		if (x + xa < 0) {
			xa = 1;
		}
		if (x + xa > cancha.getWidth() - 30) {
			xa = -1;
		}
		if (y + ya <0) {
			ya = 1;
		}
		/*if (y + ya > cancha.getHeight() - 30) {
			ya = -1;
		}*/
		if (colision()) {
			ya = -1;
			
		}
		
		if (y + ya > cancha.getHeight() - 30) {
			cancha.gameOver();
		}
		
		x= x + xa;
		y = y + ya;
	}
	
	public void pintarPelota(Graphics2D graphics2d) {
		// 
		graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2d.fillOval(x, y, 30, 30);
		

	}
	
	public Rectangle obtenerLimites() {
		return new Rectangle(x, y, 30, 30);
		
	}
	
	public boolean colision() {
		return cancha.raqueta.obtenerLimites().intersects(obtenerLimites());
	}

}
