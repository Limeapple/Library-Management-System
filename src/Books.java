
public class Books {
private String BookID;
private String BookTitle;
private String Author;
private int pages;

public Books(String id, String title, String a, int p)
{
	BookID = id;
	BookTitle = title;
	Author = a;
	pages = p;
}
public String getBookID()
{
	return BookID;
}
public String getBookTitle()
{
	return BookTitle;
}
public String getAuthor()
{
	return Author;
}
public int getPages()
{
	return pages;
}





}
