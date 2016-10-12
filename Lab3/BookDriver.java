import java.util.Scanner;

public class BookDriver {
	public static void main(String[] args){
		
		String comic,ISBN;
		float price;
		int pages;
		
		Scanner in = new Scanner(System.in);
		
		Book bible = new Book("The Bible",15.45f,"17363827",560);
		
		System.out.println(bible.getTitle());
		System.out.print(String.format("%.2f",bible.getPrice()));
		System.out.println(bible.getISBN());
		System.out.println(bible.getNumOfPages());
		//System.out.print(Book.numOfBooks);
		
		System.out.println(bible.toString());
		
		Book book2 = new Book();
		
		//System.out.print("PLease enter your favourite comic, its price, ISBN and number of pages");
		
		System.out.print("Favourite comic: ");
		comic = in.nextLine();
		
		System.out.print("Its price: ");
		price = in.nextFloat();
		
		in.nextLine();
		System.out.print("ISBN: ");
		ISBN = in.nextLine();
		
		
		System.out.print("Pages: ");
		pages = in.nextInt();
		
		book2.setTitle(comic);
		book2.setPrice(price);
		book2.setISBN(ISBN);
		book2.setNumOfPages(pages);
		
		System.out.println(book2);
		
		
		
	}
}