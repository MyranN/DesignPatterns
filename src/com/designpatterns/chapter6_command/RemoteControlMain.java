package com.designpatterns.chapter6_command;

public class RemoteControlMain {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);
		
		remote.setCommand(command);
		remote.executeCommand();
		
	}
}
