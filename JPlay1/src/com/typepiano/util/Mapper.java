package com.typepiano.util;

import java.util.Map;

import org.jnativehook.keyboard.NativeKeyEvent;

import com.typepiano.reference.KeyMap;
import com.typepiano.reference.Note;
import com.typepiano.sound.ClipPlayer;
import com.typepiano.sound.Player;

public class Mapper {

	public static String mapKey(char key, boolean shiftPressed) {
		// to do
		return "";
	}
	
	public static String mapKey(int keyCode, boolean shiftPressed) {
		switch(keyCode) {
			case NativeKeyEvent.VC_0: return KeyMap.KEY_0;
			case NativeKeyEvent.VC_1: return shiftPressed ? KeyMap.KEY_s1 : KeyMap.KEY_1;
			case NativeKeyEvent.VC_2: return shiftPressed ? KeyMap.KEY_s2 : KeyMap.KEY_2;
			case NativeKeyEvent.VC_3: return KeyMap.KEY_3;
			case NativeKeyEvent.VC_4: return shiftPressed ? KeyMap.KEY_s4 : KeyMap.KEY_4;
			case NativeKeyEvent.VC_5: return shiftPressed ? KeyMap.KEY_s5 : KeyMap.KEY_5;
			case NativeKeyEvent.VC_6: return shiftPressed ? KeyMap.KEY_s6 : KeyMap.KEY_6;
			case NativeKeyEvent.VC_7: return KeyMap.KEY_7;
			case NativeKeyEvent.VC_8: return shiftPressed ? KeyMap.KEY_s8 : KeyMap.KEY_8;
			case NativeKeyEvent.VC_9: return shiftPressed ? KeyMap.KEY_s9 : KeyMap.KEY_9;
			case NativeKeyEvent.VC_A: return KeyMap.KEY_A;
			case NativeKeyEvent.VC_B: return shiftPressed ? KeyMap.KEY_sB : KeyMap.KEY_B;
			case NativeKeyEvent.VC_C: return shiftPressed ? KeyMap.KEY_sC : KeyMap.KEY_C;
			case NativeKeyEvent.VC_D: return shiftPressed ? KeyMap.KEY_sD : KeyMap.KEY_D;
			case NativeKeyEvent.VC_E: return shiftPressed ? KeyMap.KEY_sE : KeyMap.KEY_E;
			case NativeKeyEvent.VC_F: return KeyMap.KEY_F;
			case NativeKeyEvent.VC_G: return shiftPressed ? KeyMap.KEY_sG : KeyMap.KEY_G;
			case NativeKeyEvent.VC_H: return shiftPressed ? KeyMap.KEY_sH : KeyMap.KEY_H;
			case NativeKeyEvent.VC_I: return shiftPressed ? KeyMap.KEY_sI : KeyMap.KEY_I;
			case NativeKeyEvent.VC_J: return shiftPressed ? KeyMap.KEY_sJ : KeyMap.KEY_J;
			case NativeKeyEvent.VC_K: return KeyMap.KEY_K;
			case NativeKeyEvent.VC_L: return shiftPressed ? KeyMap.KEY_sL : KeyMap.KEY_L;
			case NativeKeyEvent.VC_M: return KeyMap.KEY_M;
			case NativeKeyEvent.VC_N: return KeyMap.KEY_N;
			case NativeKeyEvent.VC_O: return shiftPressed ? KeyMap.KEY_sO : KeyMap.KEY_O;
			case NativeKeyEvent.VC_P: return shiftPressed ? KeyMap.KEY_sP : KeyMap.KEY_P;
			case NativeKeyEvent.VC_Q: return shiftPressed ? KeyMap.KEY_sQ : KeyMap.KEY_Q;
			case NativeKeyEvent.VC_R: return KeyMap.KEY_R;
			case NativeKeyEvent.VC_S: return shiftPressed ? KeyMap.KEY_sS : KeyMap.KEY_S;
			case NativeKeyEvent.VC_T: return shiftPressed ? KeyMap.KEY_sT : KeyMap.KEY_T;
			case NativeKeyEvent.VC_U: return KeyMap.KEY_U;
			case NativeKeyEvent.VC_V: return shiftPressed ? KeyMap.KEY_sV : KeyMap.KEY_V;
			case NativeKeyEvent.VC_W: return shiftPressed ? KeyMap.KEY_sW : KeyMap.KEY_W;
			case NativeKeyEvent.VC_X: return KeyMap.KEY_X;
			case NativeKeyEvent.VC_Y: return shiftPressed ? KeyMap.KEY_sY : KeyMap.KEY_Y;
			case NativeKeyEvent.VC_Z: return shiftPressed ? KeyMap.KEY_sZ : KeyMap.KEY_Z;
		}
		return "";
	}
	
	public static void mapPlayers(Map<String, Player> players) {
		players.put(KeyMap.KEY_0, (new ClipPlayer(Note.E17)));
		players.put(KeyMap.KEY_1, (new ClipPlayer(Note.C1)));
		players.put(KeyMap.KEY_2, (new ClipPlayer(Note.D3)));
		players.put(KeyMap.KEY_3, (new ClipPlayer(Note.E5)));
		players.put(KeyMap.KEY_4, (new ClipPlayer(Note.F6)));
		players.put(KeyMap.KEY_5, (new ClipPlayer(Note.G8)));
		players.put(KeyMap.KEY_6, (new ClipPlayer(Note.A10)));
		players.put(KeyMap.KEY_7, (new ClipPlayer(Note.B12)));
		players.put(KeyMap.KEY_8, (new ClipPlayer(Note.C13)));
		players.put(KeyMap.KEY_9, (new ClipPlayer(Note.D15)));
		players.put(KeyMap.KEY_A, (new ClipPlayer(Note.B36)));
		players.put(KeyMap.KEY_B, (new ClipPlayer(Note.A58)));
		players.put(KeyMap.KEY_C, (new ClipPlayer(Note.F54)));
		players.put(KeyMap.KEY_D, (new ClipPlayer(Note.D39)));
		players.put(KeyMap.KEY_E, (new ClipPlayer(Note.A22)));
		players.put(KeyMap.KEY_F, (new ClipPlayer(Note.E41)));
		players.put(KeyMap.KEY_G, (new ClipPlayer(Note.F42)));
		players.put(KeyMap.KEY_H, (new ClipPlayer(Note.G44)));
		players.put(KeyMap.KEY_I, (new ClipPlayer(Note.F30)));
		players.put(KeyMap.KEY_J, (new ClipPlayer(Note.A46)));
		players.put(KeyMap.KEY_K, (new ClipPlayer(Note.B48)));
		players.put(KeyMap.KEY_L, (new ClipPlayer(Note.C49)));
		players.put(KeyMap.KEY_M, (new ClipPlayer(Note.C61)));
		players.put(KeyMap.KEY_N, (new ClipPlayer(Note.B60)));
		players.put(KeyMap.KEY_O, (new ClipPlayer(Note.G32)));
		players.put(KeyMap.KEY_P, (new ClipPlayer(Note.A34)));
		players.put(KeyMap.KEY_Q, (new ClipPlayer(Note.F18)));
		players.put(KeyMap.KEY_R, (new ClipPlayer(Note.B24)));
		players.put(KeyMap.KEY_S, (new ClipPlayer(Note.C37)));
		players.put(KeyMap.KEY_T, (new ClipPlayer(Note.C25)));
		players.put(KeyMap.KEY_U, (new ClipPlayer(Note.E29)));
		players.put(KeyMap.KEY_V, (new ClipPlayer(Note.G56)));
		players.put(KeyMap.KEY_W, (new ClipPlayer(Note.G20)));
		players.put(KeyMap.KEY_X, (new ClipPlayer(Note.E53)));
		players.put(KeyMap.KEY_Y, (new ClipPlayer(Note.D27)));
		players.put(KeyMap.KEY_Z, (new ClipPlayer(Note.D51)));
		
		// shifted keys are sharps
		players.put(KeyMap.KEY_s1, (new ClipPlayer(Note.Cx2)));
		players.put(KeyMap.KEY_s2, (new ClipPlayer(Note.Dx4)));
		players.put(KeyMap.KEY_s4, (new ClipPlayer(Note.Fx7)));
		players.put(KeyMap.KEY_s5, (new ClipPlayer(Note.Gx9)));
		players.put(KeyMap.KEY_s6, (new ClipPlayer(Note.Ax11)));
		players.put(KeyMap.KEY_s8, (new ClipPlayer(Note.Cx14)));
		players.put(KeyMap.KEY_s9, (new ClipPlayer(Note.Dx16)));
		players.put(KeyMap.KEY_sB, (new ClipPlayer(Note.Ax59)));
		players.put(KeyMap.KEY_sC, (new ClipPlayer(Note.Fx55)));
		players.put(KeyMap.KEY_sD, (new ClipPlayer(Note.Dx40)));
		players.put(KeyMap.KEY_sE, (new ClipPlayer(Note.Ax23)));
		players.put(KeyMap.KEY_sG, (new ClipPlayer(Note.Fx43)));
		players.put(KeyMap.KEY_sH, (new ClipPlayer(Note.Gx45)));
		players.put(KeyMap.KEY_sI, (new ClipPlayer(Note.Fx31)));
		players.put(KeyMap.KEY_sJ, (new ClipPlayer(Note.Ax47)));
		players.put(KeyMap.KEY_sL, (new ClipPlayer(Note.Cx50)));
		players.put(KeyMap.KEY_sO, (new ClipPlayer(Note.Gx33)));
		players.put(KeyMap.KEY_sP, (new ClipPlayer(Note.Ax35)));
		players.put(KeyMap.KEY_sQ, (new ClipPlayer(Note.Fx19)));
		players.put(KeyMap.KEY_sS, (new ClipPlayer(Note.Cx38)));
		players.put(KeyMap.KEY_sT, (new ClipPlayer(Note.Cx26)));
		players.put(KeyMap.KEY_sV, (new ClipPlayer(Note.Gx57)));
		players.put(KeyMap.KEY_sW, (new ClipPlayer(Note.Gx21)));
		players.put(KeyMap.KEY_sY, (new ClipPlayer(Note.Dx28)));
		players.put(KeyMap.KEY_sZ, (new ClipPlayer(Note.Dx52)));
	}
}
