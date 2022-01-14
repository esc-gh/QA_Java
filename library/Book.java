package library;

public class Book extends Item implements Shredder {
//	private List<Book> bookList = new ArrayList<>();
	private String author;
	private String genre;
	private boolean isHardback;

	public Book(int stocked, int available, int id, String name, String author, String genre, boolean isHardback) {
		super(stocked, available, name);
		this.author = author;
		this.genre = genre;
		this.isHardback = isHardback;
		totalItems += 1;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isHardback() {
		return isHardback;
	}

	public void setHardback(boolean isHardback) {
		this.isHardback = isHardback;
	}

	@Override
	public void shred() {
		System.out.println("Have you no respect for literature!");

	}

}
