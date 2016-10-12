

public class Book {
	
	private String title;
	private float price;
	private String ISBN;
	private int numOfPages;
	private static int numOfBooks;
	
	public Book(){
		
	}
	
	public Book(String title, float price, String ISBN, int numOfPages){
		setTitle(title);
		setPrice(price);
		setISBN(ISBN);
		setNumOfPages(numOfPages);
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	public String getISBN(){
		return this.ISBN;
	}
	
	public int getNumOfPages(){
		return this.numOfPages;
	}
	
	public String toString(){
		return "The title is "+title+" The price is "+price+" The ISBN is "+ISBN+" The pages is "+numOfPages;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	
	public void setNumOfPages(int numOfPages){
		this.numOfPages = numOfPages;
	}
}