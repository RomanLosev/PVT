package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task7_2 {
	public static void main(String[] args) {
	 
		int n; //кол-во строк
        Scanner scan = new Scanner (System.in);
        if (scan.hasNextInt ()) {
            n = Integer.parseInt (scan.nextLine ());
            List<String> text = new ArrayList<String> ();
            for (int i = 0; i < n; i++) {
                text.add (scan.nextLine ());
            }
            StringLengthListSort sort = new StringLengthListSort ();
            Collections.sort (text, sort);

            for (int i = 0; i < n; i++) {
                System.out.println ("(" + text.get (i).length () + "): \"" + text.get (i) + "\"");
            }
        }
    }

        // Sort method for the task2
        class StringLengthListSort implements Comparator<String> {

            public int compare (String s1, String s2) {

                if (s1.length () == s2.length ())
                    return s1.compareTo (s2);
                else
                    return (s1.length () - s2.length ());
            }
        }
	
	
	

}
