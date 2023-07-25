import java.util.Scanner;

public class MainSeparateChaining {

	public static void main(String[] args) {
		hashTable table = new hashTable(7);
		Scanner scanIn = new Scanner(System.in);

		System.out.println("Separate Chaining\n");
		while (true) {
			System.out.println("Choose an option below:");
			System.out.println("( 1 ) - BUILD a new hash table");
			System.out.println("( 2 ) - PRINT hash table");
			System.out.println("( 3 ) - INSERT a value");
			System.out.println("( 4 ) - DELETE a value");
			System.out.println("( 5 ) - FIND if a value exists");
			
			String option = scanIn.next();

			switch (option) {
			case "1":
				System.out.println("Enter the size of the hash table : ");
				int size = scanIn.nextInt();
				table = new hashTable(size);
				System.out.println("New table generated\n");
				break;
			case "2":
				table.printTable();
				break;
			case "3":
				System.out.println("Enter the value to be inserted : ");
				int insertValue = scanIn.nextInt();
				table.insert(insertValue);
				break;
			case "4":
				System.out.println("Enter the value to be deleted : ");
				int deleteValue = scanIn.nextInt();
				table.delete(deleteValue);
				break;
			case "5":
				System.out.println("Enter the value to find :");
				int findValue = scanIn.nextInt();
				table.findHandler(table.find(findValue, table.getList(table.hashFunction(findValue))));
				break;
			default:
				System.out.println("Invalid option!\n");
			}
		}
	}

}
