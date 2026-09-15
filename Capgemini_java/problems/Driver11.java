package problems;
// composition and aggregation
class Book{
	private String title="";
	private String author="";
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	public void displayBook() {
		System.out.println("Title"+title+" Author"+author);
	}
}

class Member{
	private int memberId;
	private String name="";
	Member(int memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
	public void displayMember() {
		System.out.println("MemberId "+memberId+" Name "+name);
	}
}
class Library{
	private Book b;
	private Member m;
	public Library(Member member) {
        this.b = new Book(" Java", " James"); // Composition
        this.m = member;                     // Aggregation
    }

    public void displayLibraryDetails() {
        System.out.println("--- Library Details ---");
        b.displayBook();
        m.displayMember();
    }
}
class Driver11{
	public static void main(String [] args) {
		Member m=new Member(101,"John");
		Library l=new Library(m);
		l.displayLibraryDetails();
	}
}

