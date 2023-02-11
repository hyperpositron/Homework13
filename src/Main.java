public class Main {
    public static void main(String[] args) {
        Author lermontov = new Author("Михаил", "Лермонтов");
        Author lermontov2 = new Author("Михаил", "Лермонтов");
        Author tolstoy = new Author("Лев", "Толстой");
        Author tolstoy2 = new Author("Лев", "Толстой");

        System.out.println(tolstoy.equals(tolstoy2));
        System.out.println(lermontov.equals(lermontov2));


        Book mtsyri = new Book("Мцыри", 1839, lermontov);
        Book warAndPeace = new Book("Война и мир", 1867, tolstoy);
        System.out.println(mtsyri);
        System.out.println(warAndPeace);

        mtsyri.setPublishingYear(2023);




    }
}