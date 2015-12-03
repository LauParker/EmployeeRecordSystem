package lpapps.ers.objects;

/**
 * 
 * @author Laurence Parker
 *
 */
public class Store {

	public int count, maxSize;
	public Person [] list;
	public Person [] bigger; // temp used to increase list size
	// AFTER NOTE. we were specifically told to only use list(), although looking at
	// what i wanted to do an ArrayList<Person> would have worked.

	/**
	 * defined constructor
	 * @param max employee size of the store
	 */
	public Store(int max) {
		maxSize = max;
		count = 0;
		list = new Person [maxSize];
	}
	
	/**
	 * 
	 * @param p Person to add to list
	 */
	public void addPerson(Person p) {
		if (!storeFull()) {
			list[count] = p;
		} else System.out.println("Store is full");
	}
	
	/**
	 * Used to add a person to the records even when the list is full
	 * @param p person to add to list
	 */
	public void increaseStoreSizeThenAddP(Person p) {
		if (!storeFull()) {
			addPerson(p);
			System.out.println("size not increased");
		} else {
			bigger = new Person[list.length+1];
			for (int i = 0; i<list.length; i++) {
				bigger[i] = list[i];
			}
		list = bigger;
		// update origional array location to point to new array location
		// var bigger[] will be garbage collected
		list[list.length] = p;
		count++;
		maxSize = maxSize +1;
		}
	}

	public boolean storeFull() {
		return count == maxSize;
	}
	
	public int getCount() {
		return count;
	}
	
	public Person elementAt(int index) {
		return list[index];
	}
	
	public boolean alreadyIn(Person p) {
		for (int i=0; i<list.length; i++) {
			if (list[i] !=null) {
				if (list[i].name.equals(p.name) && list[i].nationalI.equals(p.nationalI)
						&& list[i].birthDate.equals(p.birthDate)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String showAll() {
		String allStore = "";
		for (int i=0; i<list.length; i++) {
			if (list[i] !=null) {
				allStore = list[i].toString() + "\n";
			}
		}
		return allStore;
	}
}
