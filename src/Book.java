import java.util.Objects;

public class Book {
private String nameBook;
private int yearOfWriting;
private Author author;

        public Book(String nameBook, int yearOfWriting, Author author) {
                this.nameBook = nameBook;
                this.yearOfWriting = yearOfWriting;
                this.author = author;
        }

        public String getNameBook() {
                return nameBook;
        }

        public int getYearOfWriting() {
                return yearOfWriting;
        }

        public Author getAuthor() {
                return author;
        }


        public void setYearOfWriting(int yearOfWriting) {
                this.yearOfWriting = yearOfWriting;
        }

        @Override
        public String toString() {
                return "Book{" +
                        "nameBook='" + nameBook + '\'' +
                        ", yearOfWriting=" + yearOfWriting +
                        ", author=" + author +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Book book = (Book) o;
                return yearOfWriting == book.yearOfWriting && Objects.equals(nameBook, book.nameBook) &&
                        Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
                return Objects.hash(nameBook, yearOfWriting, author);
        }
}