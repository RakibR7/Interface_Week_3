package ie.atu.productv5;

public class ProductDB {

    public static Printable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Printable p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(54.50);
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(54.50);
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            p = myBook;
        }

        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);

            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setLabel("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("PINK")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.00);
            myMusic.setLabel("Columbia group");
            myMusic.setArtist("Pink Floyd");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("TV")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Best TV");
            myTV.setPrice(800.00);
            myTV.setScreen("50x70 inches");
            myTV.setManufacturer("SONY");
            p = myTV;

        } else if (productCode.equalsIgnoreCase("horse")) {
            Horse myHorse = new Horse();
            myHorse.setCode(productCode);
            myHorse.setDescription("Best Horse");
            myHorse.setPrice(200.00);
            myHorse.setScreen("100 KG");
            myHorse.setManufacturer("Samsung brand Horse");
            p = myHorse;
        return p;
    }
}

