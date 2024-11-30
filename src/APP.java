
public class APP {

    public static void main(String[] args) {
        // Создание авторов
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Fyodor", "Dostoevsky");

        // Создание книг
        Book book1 = new Book("War and Peace", author1, 1869);
        Book book2 = new Book("Crime and Punishment", author2, 1866);

        // Вывод информации о книгах
        System.out.println("Книга 1: " + book1.getName() + ", автор: " + book1.getAuthor().getFullName() + ", год публикации: " + book1.getYear());
        System.out.println("Книга 2: " + book2.getName() + ", автор: " + book2.getAuthor().getFullName() + ", год публикации: " + book2.getYear());

        // Изменение года публикации книги
        book1.setYear(1873);
        System.out.println("Обновленный год публикации книги '" + book1.getName() + "': " + book1.getYear());
    }
}

