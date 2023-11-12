public class Main {
    public static void main(String[] args) {


        Author ivan = new Author("Ivan","Grigorovich");
        Author igor = new Author("Igor","Kim");
        Book Fisherman = new Book("Fisherman", 1861, ivan );
        Book TheWoodcutter = new Book("TheWoodcutter", 1906,igor);

        System.out.println(Fisherman.getNameBook() + "-" + Fisherman.getAuthor().getName() +
        " " + Fisherman.getAuthor().getSurname() + " " + Fisherman.getYearOfWriting());

        System.out.println(TheWoodcutter.getNameBook() + "-" + TheWoodcutter.getAuthor().getName() +
                " " + TheWoodcutter.getAuthor().getSurname() + " " + TheWoodcutter.getYearOfWriting());


        System.out.println(Fisherman);

        Fisherman.setYearOfWriting(1465);
        System.out.println("Fisherman.getYearOfWriting1() = " + Fisherman.getYearOfWriting());

        TheWoodcutter.setYearOfWriting(1525);
        System.out.println("TheWoodcutter.getYearOfWriting() = " + TheWoodcutter.getYearOfWriting());



    }
}