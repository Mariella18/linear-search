/**
* LINEAR SEARCH checks each item in a collection from start to end until a match is found. 
*
* @author  [your full name here]
* @link    [full github url]
* @version [version number]
* @since   [last updated dd/mm/yyyy]
*/

// TODO: import Scanner and Random from Java library

public class LinearSearch {

	public static void main(String[] args) {

		int i, size, search, array[];

		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter array size: ");
		// TODO: use nextInt() to assign keyboard input as array size
		array = new int[size];		

		System.out.print("Enter number to find: ");
		// TODO: use nextInt() to assign keyboard input as search item

		for (i = 0; i < size; i++) {
			// TODO: use nextInt() to assign random numbers (range of 1000) to array index
			if (array[i] == search) {
				System.out.println("FOUND: " + search + " is at " + "array["+i+"]");
				break; // note: break the loop if not found
			} 			
		}

		// TODO: if searching reaches the array size and still no match, print NOT FOUND
			System.out.println("NOT FOUND: " + search + " is not in the array.");
		}

	}

}