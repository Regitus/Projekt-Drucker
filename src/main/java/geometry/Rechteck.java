package main.java.geometry;

import java.util.Arrays;
import java.util.List;

import org.freedesktop.dbus.bin.CreateInterface;

public class Rechteck extends Viereck {
	
	public Rechteck(double width, double height) {
		super(
			new Vector(0, 0, true),
			new Vector(0, height, true),
			new Vector(width, height, true),
			new Vector(width, 0, true)
		);
	}
}
