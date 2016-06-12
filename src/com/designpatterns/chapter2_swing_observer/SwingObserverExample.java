package com.designpatterns.chapter2_swing_observer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ActionListener implementations are the observers.
 * AbstractButton (JButton's superclass) is the subject (object being observed)
 * @author Maestro
 *
 */
public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args){
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
	}
	
	class AngelListener implements ActionListener{
		//actionPerformed method acts like the update method in the observer pattern and is
		//called when the button state changes.
		public void actionPerformed(ActionEvent event){
			System.out.println("Don't do it. You might regret it");
		}
	}
	
	class DevilListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("Come on, do it!");
		}
	}
}
