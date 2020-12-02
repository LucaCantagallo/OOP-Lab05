package it.unibo.oop.lab05.ex1;

import java.util.*;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {
	
	private final static int N_ELEMENTS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        
//          Considering the content of "UseCollection, write a program which, in
//          order:
//
//      1) Builds a TreeSet containing Strings
    	final Set<String> set = new TreeSet <>();

//          
//         2) Populates such Collection with all the Strings ranging from "1" to
//         "20"
    	for (int i = 1; i <= UseSet.N_ELEMENTS; i++) {
    		set.add(Integer.toString(i));
    	} 
//         
//         3) Prints its content
    		System.out.println(set);
//         
//         4) Removes all those strings whose represented number is divisible by
//         three
    		final Iterator<String> it = set.iterator();
    		
    		while (it.hasNext()) {
    			if(Integer.parseInt(it.next()) % 3 == 0) {
    				it.remove();
    			}
    		}

//         
//         5) Prints the content of the Set using a for-each costruct
    	for (String s : set) {
    		System.out.println(s);
    	}
//          
//         6) Verifies if all the numbers left in the set are even
    	final Set<String> setEven = new TreeSet<>();
    	
        for (int i = 2; i <= UseSet.N_ELEMENTS; i += 2) {
            setEven.add(Integer.toString(i));
        }
        
        System.out.println(setEven.containsAll(set));
    		
    }
    
}
