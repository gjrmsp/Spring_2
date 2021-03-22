package com.google.s2;

import org.springframework.stereotype.Component;

import com.google.s2.robot.Arm;

@Component
public class Arm_Right extends Arm {

	public Arm_Right() {
		this.setName("Right Arm");
	}
}
