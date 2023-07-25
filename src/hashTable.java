import java.util.ArrayList;
import java.util.LinkedList;

public class hashTable {
	private ArrayList<LinkedList<Integer>> bucketArray;
	private int bucketCount = 0;
	
	public hashTable(int buckets) {
		bucketCount = buckets;
		this.bucketArray = new ArrayList<LinkedList<Integer>>();
		for (int i = 0; i < buckets; i++) {
			bucketArray.add(i, new LinkedList<Integer>());
		}
	}
	
	public int hashFunction(int value) {
		return value % bucketCount;
	}
	
	public LinkedList<Integer> getList(int index) {
		return bucketArray.get(index);
	}
	
	public boolean find(int value, LinkedList<Integer> list) {
		return list.contains(value);
	}
	
	public void findHandler(boolean bool) {
		System.out.println(bool ? "Value exists\n" : "Find unsuccessful : value does not exist\n");
	}
	
	public void insert(int value) {
		LinkedList<Integer> list = getList(hashFunction(value));
		list.add(value);
		System.out.println("New value inserted\n");
	}
	
	public void delete(int value) {
		LinkedList<Integer> list = getList(hashFunction(value));
		if (find(value, list)) {
			list.removeFirstOccurrence(value);
			System.out.println("Value deleted\n");
		} else {
			System.out.println("Delete unsuccesful : value does not exist\n");
		}
	}
	
	public void printTable() {
		for (int i = 0; i < bucketCount; i++) {
            LinkedList<Integer> list = getList(i);
            System.out.println(i + " --> " + list);
        }
		System.out.println("");
	}
}
