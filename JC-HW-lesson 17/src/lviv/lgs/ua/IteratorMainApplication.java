package lviv.lgs.ua;

public class IteratorMainApplication {
	
	public static void main(String[] args) {
		
		Integer [] arr = {1, 5, 6, 10, 11, 13, 70, 54, -32, 22};
		
		
		Collection collection = new Collection (arr); 
		System.out.println("1) Output the value of the array from the first to the last");
		System.out.println();
		Iterator forwardIterator = collection.createIteratorForward(); 
		
		while (forwardIterator.hasNext()) {
			Integer next = forwardIterator.next();
			
			if (next % 2 != 0) {
				System.out.println("null");
			} else {
				System.out.println(next);
			}
			
			System.out.println();
				
		}
		
		System.out.println("2) Display an array one element at a time from end to beginning");
		Iterator backwardIterator = collection.createIteratorBackward();
		
		while (backwardIterator.hasNext()) {
			Integer next = backwardIterator.next();
			System.out.println(next);
		}
		System.out.println();
	
		
		System.out.println("3) Display every third odd element of the array on the screen from end to beginning: ");
		Iterator iteratorAnonymous = collection.createAnonymousIterator();
		
		int i = 1; 
		while (iteratorAnonymous.hasNext()) {
			Integer next = iteratorAnonymous.next(); 
			
			if (i % 3 == 0) {
				if (next % 2 != 0) {
					System.out.println(next);
				}
			}
			i++;
		}
		System.out.println();
		
		System.out.println("4) Display every fifth element minus 100 of the array from beginning to end:");
		Iterator iteratorLocal = collection.createLocalIterator();
		
		int j = 1; 
		while (iteratorLocal.hasNext()) {
			Integer next = iteratorLocal.next();
			if(j % 5 ==0) {
				if (next % 2 == 0) {
					System.out.println(next - 100);
				}
			}
			j++;
			
		}
		System.out.println();
		
		System.out.println("5) Display every second element of the array from beginning to end like odd:");
		Iterator iteratorStatic = Collection.createStaticIterator();
		
		int a = 1; 
		while (iteratorStatic.hasNext()) {
			Integer next = iteratorStatic.next();
			
			if (a % 2 == 0) {
				if (next % 2 == 0) {
					System.out.println(next + 1);
				}
			}
			 a++;
		}
	}
	

}
	