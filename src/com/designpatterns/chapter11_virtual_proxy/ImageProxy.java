package com.designpatterns.chapter11_virtual_proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

	ImageIcon imageIcon;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL imageURL) {
		this.imageURL = imageURL;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							imageIcon = new ImageIcon(imageURL, "CD Cover");
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		}
		return 800;
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		}
		return 600;
	}

}
