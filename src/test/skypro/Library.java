package test.skypro;

public class Library {
    private Book [] library;
    private int maxCountOfBooks;
    private int countOfBooks = 0;

    public Library (int maxCountOfBooks) {
        this.maxCountOfBooks = maxCountOfBooks;
        this.library = new Book[maxCountOfBooks];
    }

    public void addBook (Book book) {
        for (int i=0; i<this.maxCountOfBooks; i++) {
            if (library[i] != null) continue;
            library[i] = book;
            return;
        }
        System.out.println("Некуда ставить книги!");
    }

    public int getMaxCountOfBooks () {
        return this.maxCountOfBooks;
    }

    public int getCountOfBooks () {
        return this.countOfBooks;
    }

    public void printLibrary () {
        for (int i=0; i<this.maxCountOfBooks; i++) {
            if (library[i] == null) continue;
            System.out.println(library[i].getAuthor() + ": " + library[i].getName() + ": " + library[i].getYearOfPublishing());
        }
    }

    public void getInformationAboutBookByName (String nameOfBook) {
        for (int i=0; i<this.maxCountOfBooks; i++) {
            if (library[i] == null) continue;
            if (library[i].getName() == nameOfBook) {
                System.out.println(library[i].getName() + " by " + library[i].getAuthor() + ", was published in " +  library[i].getYearOfPublishing());
            }
        }
    }

    public void setNewYearOfPublishingByName (String nameOfBook, int newYearOfPublishing) {
        for (int i=0; i<this.maxCountOfBooks; i++) {
            if (library[i] == null) continue;
            if (library[i].getName() == nameOfBook) {
                library[i].setYearOfPublishing(newYearOfPublishing);
            }
        }
    }

    @Override
    public String toString () {
        StringBuilder s1 = new StringBuilder();
        for (int i=0; i<this.maxCountOfBooks; i++) {
            if (library[i] == null) continue;
            s1.append(library[i].toString()+ '\n');
        }
        return s1.toString();
    }
}
