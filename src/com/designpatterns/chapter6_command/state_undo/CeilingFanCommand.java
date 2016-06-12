package com.designpatterns.chapter6_command.state_undo;

import com.designpatterns.chapter6_command.Command;

public class CeilingFanCommand implements Command{

	CeilingFan ceilingFan;
	int prevSpeed;
	int speed;
	
	public CeilingFanCommand(CeilingFan ceilingFan, int speed) {
		this.ceilingFan = ceilingFan;
		this.speed = speed;
	}
	
	@Override
	public void execute() {
		this.prevSpeed = ceilingFan.getSpeed();
		
		switch(speed) {
		case 3:
			ceilingFan.high();
			break;
		case 2:
			ceilingFan.medium();
			break;
		case 1:
			ceilingFan.low();
			break;
		default:
			ceilingFan.off();
			break;
		}
	}

	@Override
	public void undo() {
		switch(prevSpeed) {
		case 3:
			ceilingFan.high();
			break;
		case 2:
			ceilingFan.medium();
			break;
		case 1:
			ceilingFan.low();
			break;
		default:
			ceilingFan.off();
			break;
		}
		
	}

}
