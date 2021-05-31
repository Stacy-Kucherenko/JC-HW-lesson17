package lviv.lgs.ua;

public interface Iterator {
	
	public boolean hasNext();
	public Integer next();
	
	

}

class Collection {
	
	private static Integer [] arr;
	Collection (Integer [] arr) {
	Collection.arr = arr;	
	}
	
	public class IteratorForward implements Iterator {
		
		private int i = 0;

		@Override
		public boolean hasNext() {
			
			return i < arr.length;
		}

		@Override
		public Integer next() {
			
			return arr[i++];
		}
		
		
	}
	
	public IteratorForward createIteratorForward () {
		return new IteratorForward();
	}
	
	
	public class IteratorBackward implements Iterator {
		
		private int i = arr.length -1;

		@Override
		public boolean hasNext() {
			
			return i >=0;
		}

		@Override
		public Integer next() {
			i = i-2;
			return arr[i+2];
		}
		
		
	}
	public IteratorBackward createIteratorBackward () {
		return new IteratorBackward();
	}
	
	public Iterator createAnonymousIterator() {
		return new Iterator() {
			private int i = arr.length -1;

			@Override
			public boolean hasNext() {
				
				return i>=0;
			}

			@Override
			public Integer next() {
				
				return arr[i--];
			}
			
		};
	}
	
	public Iterator createLocalIterator() {
		class LocalIterator implements Iterator {
			private int i = 0;

			@Override
			public boolean hasNext() {
				
				return i < arr.length;
			}

			@Override
			public Integer next() {
				
				return arr[i++];
			}
			
		}
		return new LocalIterator();
	}
	
	static class StaticIterator implements Iterator {
		private int i = 0;

		@Override
		public boolean hasNext() {
			
			return i < arr.length;
		}

		@Override
		public Integer next() {
			
			return arr[i++];
		} 
		
		
	}
	
	static StaticIterator createStaticIterator () {
		return new StaticIterator();
	}
}
