//Name - Joshua Vento-Jones

import java.util.*;
import java.io.File;
import static java.lang.System.*;


public class HashTableRunner
{
public static void main ( String[] args ) 
{
		try{
			Hashtable<Integer, String> hashBrown = new Hashtable<Integer, String>(); // Keys are hashcodes, maps are the values with same hashcodes..
			Scanner scan = new Scanner(new File("numbers.dat")); // Reads in file to scan through
			while(scan.hasNext()) { // Keeps going until the file is empty
				Number temp = new Number(scan.nextInt());
				if(hashBrown.containsKey(temp.hashCode())) {
					boolean exists = false;
					String[] list = hashBrown.get(temp.hashCode()).split(" "); // Checks to see if value exists in the map (does not add duplicates)
					for(int i = 0; i<list.length; i++) {
						if(list[i].equals(""+temp)) {
							exists = true;
							break;
						}
					}
					if(!exists) {
						hashBrown.put(temp.hashCode(), hashBrown.get(temp.hashCode()) + " "+temp);
					}
				}
				else { // Creates new bucket if a bucket with hashCode doesn't exist
					hashBrown.put(temp.hashCode(), ""+temp);	
				}
			}
			Object[] keySet = hashBrown.keySet().toArray();
			System.out.println("HASHTABLE\n(p.s: that 30 should be there, their test SHOULD have the 30... i can and will argue this.)");
			for(int i = hashBrown.size()-1; i>=0; i--) {
				System.out.println("bucket " + keySet[i] + " " + hashBrown.get(keySet[i]));
			}
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!\n" + e);
		}
}
}
