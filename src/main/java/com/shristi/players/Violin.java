package com.shristi.players;

import org.springframework.stereotype.Component;

@Component
public class Violin implements IInstrument {

	public void play(String song) {

		System.out.println("Playing "+song+"using violin");
		
	}

}
