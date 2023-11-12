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



}