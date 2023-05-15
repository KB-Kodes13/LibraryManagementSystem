public class LibraryApp {
    public static void main(String[] args) {

        LibraryManager<LibraryItem> libraryDirectory = new LibraryManager<>();

        Book book1 = new Book("Can't Hurt Me: Master Your Mind Defy the Odds", 2018, "David Goggins", "978-1544512280");
        libraryDirectory.addItem(book1);

        DVD dvd1 = new DVD("Friday", 1995, "F. Gary Gray", 91);
        libraryDirectory.addItem(dvd1);


        libraryDirectory.removeItem(book1);
        System.out.println();

        libraryDirectory.displayItem();
        System.out.println();

        Book book2 = new Book("The 7 Habits of Highly Effective People", 1989, "Stephen Covey", " 978-0743269513" );
        libraryDirectory.addItem(book2);

        DVD dvd2 = new DVD("Rocky", 1976, "John G. Avildsen", 119);
        libraryDirectory.addItem(dvd2);

        DVD dvd3 = new DVD("Remember the Titans", 2000, "Boaz Yakin", 113);
        libraryDirectory.addItem(dvd3);
        System.out.println();

        libraryDirectory.removeItem(dvd2);
        libraryDirectory.removeItem(dvd2);
        System.out.println();

        libraryDirectory.displayItem();


    }
}
