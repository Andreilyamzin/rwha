public class Main {
    public static void main(String[] args) {


        Author ivan = new Author("Ivan","Grigorovich");
        Author igor = new Author("Igor","Kim");
        Book Fisherman = new Book("Fisherman", 1908, 2002);
        Book TheWoodcutter = new Book("TheWoodcutter", 1908,2002);


        System.out.println("ivan.name = " + ivan.getName() + "\n" + "год выхода книги "+
                Fisherman.getNameBook() + " - " + Fisherman.getYearOfWriting());
        System.out.println("ivan.surname = " + ivan.getName());
        System.out.println("igor.name = " + igor.getName() + "\n" + "год выхода книги "+
                TheWoodcutter.getNameBook() + " - " + TheWoodcutter.getYearOfWriting1());
        System.out.println("igor.surname = " + igor.getSurname());


        Fisherman.setYearOfWriting1(1465);
        System.out.println("Fisherman.getYearOfWriting1() = " + Fisherman.getYearOfWriting1());

        TheWoodcutter.setYearOfWriting(1525);
        System.out.println("TheWoodcutter.getYearOfWriting() = " + TheWoodcutter.getYearOfWriting());



    }
}