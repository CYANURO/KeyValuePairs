/**
 * 
 */
package labKeyValuePair;

/**
 * @author Cyanuro
 *
 */
public class PairApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyValuePair<String, Integer> p1 = new KeyValuePair<String, Integer>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<String, Integer>("NY", 8244910);
		
		printPairs(p1, p2);
		compareAndPrint(p1, p2);
		
		System.out.println();
		
		p1 = p2;
		
		printPairs(p1, p2);
		compareAndPrint(p1, p2);

	}

	private static <T> void printPairs(KeyValuePair<String,  Integer> p1, KeyValuePair<String,  Integer> p2) {
		
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
	}
	
	private static <T> void compareAndPrint(KeyValuePair<String,  Integer> p1, KeyValuePair<String,  Integer> p2) {
		
		if(p1.equals(p2)) {
			
			System.out.println("p1.equals(p2): " + p1.equals(p2));
		}
		else {
			
			System.out.println("p1.equals(p2): " + p1.equals(p2));
		}
	}
}
