package com.shristi.playersfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shristi.players.IInstrument;

@Component
public class Players {

	@Autowired
	@Qualifier("violin")
	IInstrument instrument;
	
	public void playSong(String type,String song)
	{
		if(type.equalsIgnoreCase("v"))
			instrument.play(song);
		else if(type.equalsIgnoreCase("g"))
			instrument.play(song);
		else if(type.equalsIgnoreCase("p"))
			instrument.play(song);
	}
	
	
	
}
