package org.example.homeWork5;

public class Main {
    public static void main(String[] args) {
        NoteBook noteBook=new NoteBook();
        Contact contact1= new Contact("Кобзев", "Евгений", "9286054271");
        Contact contact2= new Contact("Кобзева", "Марина", "9286054272");
        Contact contact3= new Contact("Кобзев", "Олег", "9286054273");
        noteBook.addContact(contact1);
        noteBook.addContact(contact2);
        noteBook.addContact(contact3);
        System.out.println("Создал Записную книгу и добавил три контакта в нее:");
        noteBook.printContacts();
        noteBook.removeContact("Кобзев", "Олег");
        System.out.println("Удалил один контакт:");
        noteBook.printContacts();
        noteBook.updateContact("Кобзев", "Евгений", "6666666666");
        System.out.println("Изменил один контакт (номер телефона):");
        noteBook.printContacts();
        System.out.println("Изменил один контакт с помощью setPhone(номер телефона):");
        noteBook.getContacts().get(1).setPhone("5555555555");
        noteBook.printContacts();

      }
}
