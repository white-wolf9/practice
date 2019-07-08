import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Author;
import com.lti.entity.Book;
import com.lti.interfaces.BookManager;

public class BookAuthorTest {

	@Test
	public void testAddBook() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		BookManager bM=(BookManager) context.getBean("bookManagerImpl");
		
		Author author =  new Author();
		author.setFirstName("Saurav");
		author.setLastName("Sanyal");
		
		Book book =new Book();
		book.setName("A game of Groans");
		book.setDescription("Parody of game of thrones");
		book.setAuthor(author);
		bM.addNewBook(book);
	}
	
	@Test
	public void testAddAuthor() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		BookManager bM=(BookManager) context.getBean("bookManagerImpl");
		
		Author author =  new Author();
		author.setFirstName("Saurav");
		author.setLastName("Sanyal");
		bM.addNewAuthor(author);
	}

}
