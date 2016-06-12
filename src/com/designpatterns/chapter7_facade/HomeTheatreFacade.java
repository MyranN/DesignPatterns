package com.designpatterns.chapter7_facade;

public class HomeTheatreFacade {

	Screen screen;
	TheatreLights theatreLights;
	Projector projector;
	DVDPlayer dvdPlayer;
	
	//Simplifies interface to complex subsystem
	public HomeTheatreFacade(Screen screen, TheatreLights lights, Projector proj, DVDPlayer dvd) {
		this.screen = screen;
		this.theatreLights = lights;
		this.projector = proj;
		this.dvdPlayer = dvd;
	}
	
	public void watchMovie() {
		System.out.println("Starting home theatre system");
		theatreLights.dim();
		screen.down();
		projector.on();
		projector.wideScreenMode();
		dvdPlayer.on();
		dvdPlayer.play();	
	}
	
	public void endMovie() {
		System.out.println("Shutting down home theatre system");
		theatreLights.on();
		screen.up();
		projector.off();
		dvdPlayer.off();	
	}
	
}
