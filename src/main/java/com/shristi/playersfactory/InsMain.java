package com.shristi.playersfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InsMain {

	public static void main(String[] args) {

		ApplicationContext context=
				new AnnotationConfigApplicationContext("com.shristi");
		
		Players players=context.getBean("players", Players.class);
		players.playSong("v", "Sapphire");
		
	}

}
