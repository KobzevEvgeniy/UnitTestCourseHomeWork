/*
Задание 2.
У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о
книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания
мок-объекта BookRepository.
 */

import org.example.homeWork4.Book;
import org.example.homeWork4.BookService;
import org.example.homeWork4.InMemoryBookRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class TestBookServiceFindById {

    @Test
    void testBookGeters(){
        Book mockbook =mock(Book.class);
        when(mockbook.getId()).thenReturn(String.valueOf(10));
        when(mockbook.getAuthor()).thenReturn("Пушкин");
        when(mockbook.getTitle()).thenReturn("Пиковая дама");

        assertThat(mockbook.getId()).isEqualTo("10");
        assertThat(mockbook.getAuthor()).isEqualTo("Пушкин");
        assertThat(mockbook.getTitle()).isEqualTo("Пиковая дама");

    }


    @Mock
    InMemoryBookRepository mockBookRepository;
    BookService bookService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(mockBookRepository);
    }

    @Test
    public void testFindBookById() {

        Book book = new Book("1", "Book1", "Author1");
        when(mockBookRepository.findById("1")).thenReturn(book);
        Book result= mockBookRepository.findById("1");
        Assert.assertEquals(book,result);
    }


    @Test
    public void testFindAllBooks() {

        BookService bookService1= mock(BookService.class);

//       Методы основного класса для проверки
//        public List<Book> findAllBooks() {
//            return bookRepository.findAll();
////        }
//        public List<Book> findAll() {
//            return new ArrayList<>(books.values());
//        }
//    }
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2= new Book("2", "Book2", "Author2");
        ArrayList<Book> bookArrayList= new ArrayList<>();
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        ArrayList <Book> result= bookArrayList;
        bookService1.findAllBooks().removeAll(result);
        when(bookService1.findAllBooks()).thenReturn(result);
        verify(bookService1,times(1)).findAllBooks();



    }
}




