package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class OrderedTS implements Comparator<String>{

	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}

}
