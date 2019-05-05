
public class Logs {
private String username;
private String password;
private String type;
private Books book;
private boolean booked;

public Logs(String user, String pass, String t, Books b, boolean bk)
{
	username = user;
	password = pass;
	type = t;
	book = b;
	booked = bk;
}
public String getUsername()
{
	return username;
}
public String getPassword()
{
	return password;
}
public String getType()
{
	return type;
}
public void setType(String t)
{
	type = t;
}
public void setPassword(String p)
{
	password = p;
}
public Books getBook()
{
	return book;
}
public void setBook(Books b)
{
	book = b;
}
public Boolean isBooked()
{
	return booked;
}
public void setBooked(boolean bk)
{
	booked = bk;
}

}
