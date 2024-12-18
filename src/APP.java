
/**
 * Главный класс APP демонстрирует использование классов Author и Book.
 * Проверяет работу методов toString, equals и hashCode.
 *
 * В методе main создаются объекты классов Author и Book, после чего
 * выполняется тестирование следующих возможностей:
 * - Вывод информации о книгах с помощью метода toString();
 * - Сравнение объектов Book с использованием метода equals();
 * - Проверка корректности вычисления хеш-кодов с помощью hashCode().
 */
public class APP {
    public static void main(String[] args) {
        // Создание авторов
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Fyodor", "Dostoevsky");

        // Создание книг
        Book book1 = new Book("War and Peace", author1, 1869);
        Book book2 = new Book("Crime and Punishment", author2, 1866);
        Book book3 = new Book("War and Peace", author1, 1869);

        // Проверка toString()
        System.out.println(book1);
        System.out.println(book2);

        // Проверка equals()
        System.out.println("book1 равна book2: " + book1.equals(book2));
        System.out.println("book1 равна book3: " + book1.equals(book3));

        // Проверка hashCode()
        System.out.println("hashCode book1: " + book1.hashCode());
        System.out.println("hashCode book3: " + book3.hashCode());
    }
}
