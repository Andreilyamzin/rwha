public class Book {
private String nameBook;
private int yearOfWriting;
private int yearOfWriting1;
public Book(String nameBook, int yearOfWriting, int yearOfWriting1) {
        this.nameBook = nameBook;
        this.yearOfWriting = yearOfWriting;
        this.yearOfWriting1 = yearOfWriting1;
        }

public int getYearOfWriting(){
        return this.yearOfWriting;
        }

public String getNameBook (){
        return this.nameBook;
        }

public int getYearOfWriting1() {
        return this.yearOfWriting1;
        }

public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting= yearOfWriting;
        }

public void setYearOfWriting1(int yearOfWriting1) {
        this.yearOfWriting1 = yearOfWriting1;
        }

        }