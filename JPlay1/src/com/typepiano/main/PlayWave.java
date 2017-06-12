package com.typepiano.main;

import com.typepiano.controller.WavConductor;

/**
 * The entry point for the application.
 * 
 * @category Main
 * @version 1.0
 * @author saurabh.parihar
 * 
 */
public class PlayWave {

	public static void main(String[] args) {
		WavConductor mainConductor = new WavConductor();
		mainConductor.start();
	}

}
