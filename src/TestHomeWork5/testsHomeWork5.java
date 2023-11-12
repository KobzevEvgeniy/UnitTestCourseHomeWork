import org.example.homeWork5.Contact;
import org.example.homeWork5.NoteBook;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class testsHomeWork5 {

    /*
    Юнит-тесты гетеров Contact
     */
    @Test
    void testContactGetPhone(){
        Contact contact=mock( Contact.class);
        when(contact.getPhone()).thenReturn("9876543210");
        assertThat(contact.getPhone()).isEqualTo("9876543210");

    }
    @Test
    void testContactGetFirsName(){
        Contact contact=mock( Contact.class);
        when(contact.getFirstName()).thenReturn("Иванов");
        assertThat(contact.getFirstName()).isEqualTo("Иванов");

    }
    @Test
    void testContactGetLastName(){
        Contact contact=mock( Contact.class);
        when(contact.getLastName()).thenReturn("Иван");
        assertThat(contact.getLastName()).isEqualTo("Иван");

    }

    /*
   Юнит-тесты cеттеров Contact
    */
    @Test
    void testContactSetPhone(){
        Contact contact= new Contact("Петров", "Олег", "9286054277");
        contact.setPhone("0123456789");
        assertThat(contact.getPhone()).isEqualTo("0123456789");

    }
    @Test
    void testContactSetFirsName(){
        Contact contact= new Contact("Петров", "Олег", "9286054277");
        contact.setFirstName("Сидоров");
        assertThat(contact.getFirstName()).isEqualTo("Сидоров");

    }

    @Test
    void testContactSetLastName(){
        Contact contact= new Contact("Петров", "Олег", "9286054277");
        contact.setLastName("Василий");
        assertThat(contact.getLastName()).isEqualTo("Василий");

    }

    //Юнит-тесты методов NoteBook

    @Test
    void testAddContact(){
        NoteBook noteBook=new NoteBook();
        Contact contact1= new Contact("Петрова", "Марина", "987654321");
        noteBook.addContact(contact1);
        assertThat(noteBook.getContact("Петрова", "Марина")).isEqualTo(contact1);

    }

    @Test
    void testGetContacts(){
        NoteBook noteBook=mock(NoteBook.class);
        when(noteBook.getContacts()).thenReturn(noteBook.contacts);
        assertThat(noteBook.getContacts()).isEqualTo(noteBook.contacts);
    }
    @Test
    void testRemoveContact(){
        NoteBook noteBook=new NoteBook();
        Contact contact1= new Contact("Петрова", "Марина", "987654321");
        noteBook.addContact(contact1);
        assertThat(noteBook.getContact("Петрова", "Марина")).isEqualTo(contact1);
        noteBook.removeContact("Петрова", "Марина");
        assertThat(noteBook.getContact("Петрова", "Марина")).isEqualTo(null);
    }

    @Test
    void testUpdateContact(){
        NoteBook noteBook=new NoteBook();
        Contact contact1= new Contact("Петрова", "Марина", "987654321");
        noteBook.addContact(contact1);
        noteBook.updateContact("Петрова", "Ольга", "6666666666");
        Contact result=noteBook.getContact("Петрова", "Ольга");
        assertThat(noteBook.getContact("Петрова", "Ольга")).isEqualTo(result);

    }

    @Test
    void testToString(){
        NoteBook noteBook=new NoteBook();
        Contact contact1= new Contact("Петрова", "Марина", "987654321");
        noteBook.addContact(contact1);
        assertThat(noteBook.toString(contact1)).isEqualTo("Петрова Марина 987654321");

    }
    //Интеграционное тестирование проверяет работу 2 и более методорв в комплексе
    //например работы двух методов getContacts+toString
    @Test
    void integtetionGetContactgetPhone(){
        NoteBook noteBook=mock(NoteBook.class);
        Contact contact1= new Contact("Петрова", "Марина", "987654321");
        noteBook.addContact(contact1);
        when(noteBook.getContact("Петрова", "Марина")).thenReturn(contact1);
        assertThat(noteBook.getContact("Петрова", "Марина").getPhone()).isEqualTo("987654321");
    }
    //сквозное тестирование, проверяет что метод отработал 1 раз- и вывел в печать
    @Test
    void testToPring(){
        NoteBook noteBook=mock(NoteBook.class);
        Contact contact1= new Contact("Петрова", "Марина", "987654321");
        noteBook.addContact(contact1);
        noteBook.printContacts();
        verify(noteBook,times(1)).printContacts();

    }

}
