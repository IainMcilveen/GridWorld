package com.Iain.gridworld;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {}

}