package com.typepiano.controller;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jnativehook.keyboard.NativeKeyEvent;

import com.typepiano.keys.KeyContract;
import com.typepiano.keys.KeyDemon;
import com.typepiano.sound.Player;
import com.typepiano.util.Mapper;

public class WavConductor implements KeyContract {

	private KeyDemon keyDemon;
	private Map<String, Player> players;
	private Set<String> pressedKeys;
	private boolean shiftPressed = false;	
	
	public WavConductor() {
		this.initKeys();
		this.initPlayers();		
	}
	
	public void start() {
		this.initKeyDemon();
	}
	
	@Override
	public void onKeyPressed(int keyCode) {
		if (isExitKey(keyCode)) {
			this.conclude();
		}
		checkShiftPressed(keyCode);
		String keyMap = Mapper.mapKey(keyCode, shiftPressed);
		if(!pressedKeys.contains(keyMap)) {
			pressedKeys.add(keyMap);
			Player note = players.get(keyMap);
			if(note != null) {
				note.play();
			}			
		}
	}

	@Override
	public void onKeyReleased(int keyCode) {
		checkShiftReleased(keyCode);
		String keyMap = Mapper.mapKey(keyCode, shiftPressed);
		if(pressedKeys.contains(keyMap)) {
			pressedKeys.remove(keyMap);
		}
	}

	@Override
	public void onKeyTyped(int keyCode) {
		// TODO Auto-generated method stub

	}
	
	private void initPlayers() {
		players = new HashMap<String, Player>();
		Mapper.mapPlayers(players);
	}
	
	private void initKeys() {
		pressedKeys = new HashSet<String>();
	}
	
	private void initKeyDemon() {
		keyDemon = new KeyDemon();
		keyDemon.summon();
		keyDemon.bind(this);
	}
	
	private void checkShiftPressed(int keyCode) {
		if (keyCode == NativeKeyEvent.VC_SHIFT_L || 
				keyCode == NativeKeyEvent.VC_SHIFT_R) {
			shiftPressed = true;
		}
	}
	
	private void checkShiftReleased(int keyCode) {
		if (keyCode == NativeKeyEvent.VC_SHIFT_L || 
				keyCode == NativeKeyEvent.VC_SHIFT_R) {
			shiftPressed = false;
		}
	}
	
	private boolean isExitKey(int keyCode) {
		return keyCode == NativeKeyEvent.VC_F9;
	}
	
	private void conclude() {
		this.keyDemon.dismiss();
	}
}
