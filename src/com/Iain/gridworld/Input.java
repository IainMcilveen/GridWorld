package com.Iain.gridworld;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {
	
	private Player player;
	
	public Input(Player player) {
		this.player = player;
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e);
		if(e.getKeyCode() == 87) {
			this.player.moveForward();
		}
		if(e.getKeyCode() == 68) {
			this.player.moveRight();
		}
		if(e.getKeyCode() == 83) {
			this.player.moveBack();
		}
		if(e.getKeyCode() == 65) {
			this.player.moveLeft();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

}
