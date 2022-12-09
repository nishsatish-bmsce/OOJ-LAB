import java.util.Scanner;
class Book {
	String name;
	String author;
	float price;
	int num_pages;
	
	Book(String n, String a, float p, int np) {
		name = n;
		author = a;
		price = p;
		num_pages = np;
	}	

	void getDetails() {
		System.out.println(name.toString());
		System.out.println(author.toString());
		System.out.println(price);
		System.out.println(num_pages);
	}

}



class BookProgram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name, author;
		float price;
		int np, i;
		Book[] books = new Book[3];
		for(i=0; i <3; i++) {
			System.out.println("Enter name, author, price and number of pages for book " + (i+1));
			name = sc.nextLine();
			author = sc.nextLine();
			price = sc.nextFloat();
			np = sc.nextInt();
			books[i] = new Book(name.toString(), author.toString(), price, np);
		}

		for(i = 0 ; i<3; i++) {
			System.out.println("The details of book " + (i+1) + " are: ");
			books[i].getDetails();
		}
	}
}