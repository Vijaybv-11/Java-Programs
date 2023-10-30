package Collections.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Listprogram {
	
	public static void main(String[] args) {

		        List<String> fruits = new ArrayList<>();
		        
		        // Adding elements
		        fruits.add("Orange");
		        fruits.add("Apple");
		        fruits.add("Banana");
		        
		        System.out.println("List after adding elements: " + fruits);
		        
		        // Getting elements
		        String firstFruit = fruits.get(0);
		        System.out.println("First fruit: " + firstFruit);
		        
		        // Updating elements
		        fruits.set(1, "Mango");
		        System.out.println("List after updating element: " + fruits);
		        
		        // Removing elements
		        fruits.remove("Apple");
		        System.out.println("List after removing element: " + fruits);
		        
		        // Checking if an element exists
		        boolean containsOrange = fruits.contains("Orange");
		        System.out.println("List contains Orange: " + containsOrange);
		        
		        // Getting the size of the list
		        int size = fruits.size();
		        System.out.println("Size of the list: " + size);
		        
		        
		        // Clearing the list
		        fruits.clear();
		        System.out.println("List after clearing: " + fruits);
		        
		        // Checking if the list is empty
		        boolean isEmpty = fruits.isEmpty();
		        System.out.println("Is the list empty: " + isEmpty);
		        
	}

}
