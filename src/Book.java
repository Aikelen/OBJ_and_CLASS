
/**
 * Класс Book представляет книгу с информацией о названии, авторе и годе публикации.
 * Предоставляет методы для получения и изменения года публикации, а также
 * методы для сравнения книг и их текстового представления.
 */
public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Возвращает строковое представление книги, включая информацию об авторе.
     * Метод делегирует вызов toString() класса Author для включения данных об авторе.
     */
    @Override
    public String toString() {
        return "Книга: '" + name + "', " + author.toString() + ", год публикации: " + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + Integer.hashCode(year);
        return result;
    }
}
