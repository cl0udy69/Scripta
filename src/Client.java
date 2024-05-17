import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String selection;
        String chooseAuthor;

        int i;
        int j;
        int x;
        int y;
        int w;
        int z;

        String[][] authors = {
            {"George RR Martin", "J.R.R. Tolkein", "Aurthur C. Clarke", "George Orwell", "James Patterson"},
            {"Stephen King", "Peter Suskind", "Ernest Hemingway", "J.K. Rowling"},
            {"Kurt Vonnegut", "William Shakespear", "Harper Lee", "Charles Dickens"},
            {"Fyodor Dostoevsky", "Franz Kafka", "Mark Twain", "Oscar Wilde"},
            {"Charles Dickens", "Fyodor Dostoevsky", "Franz Kafka", "Mark Twain"},
            {"Oscar Wilde", "Anne Frank", "Dr. Suess", "Slyvia Plath"},
            {"Jacob Grimm", "John Steinbeck", "Mary Shelley", "H.P. Lovecraft"},
            {"Naom Chomsky", "Mary Wollstonecraft", "Giacomo Casanova", "Albert Camus"},
            {"Upton Sinclair", "Douglas Adams", "Elie Weisel", "J.J. Abrams"},
            {"Jacqueline Susann", "Aristotle", "Friedrich Nietzsche", "Karl Marx"},
            {"Fredrick Engles", "Voltaire", "Socrates", "John Grisham"},
        };

        String[][] georgeRRMartin = {
            {"George R.R. Martin"},
            {"A Game of Thrones", "The Winds of Winter", "Fire & Blood", "A Dance with Dragons" },
            {"The Hedge Knight", "A Dream of Spring", "A Storm of Swords", "A Clash of Kings"},
            {"A Feast for Crows", "Fevre Dream", "The Ice Dragon", "The Rise of the Dragon"},
            {"Sandkings", "Dying of the Light", "Tuf Voyaging", "A Song of Fire and Ice"},
            {"The Princess and the Queen", "Nightflyers", "The Sworn Sword", "The Rise of the Dragon: An Illustrated History of the Targaryen Dynasty"},
            {"The Rogue Princess", "Dreamsongs: A RRetrospective", "Windhaven", "The Armageddon Rag"},
            {"Blood of the Dragon", "Dreamsongs: 2:", "Jokers Wild", "The Pear-shaped Man"},
            {"Dreamsongs: Volume I", "Starport", "The Lands of Ice and Fire", "The Sons of the Dragon"},
            {"A Song for Lya", "The Wit and Wisdom of Tyrion Lannister", "Ice Dragon", "In the House of the Worm"},
            {"A Knight of the Seven Kingdoms", "A Dance With Dragons: Part 2 After the Feast (A Song of Ice and Fire, Book 5)", "Songs of Love and Death", "With Morning Comes Mistfall"},
            {"Songs of the Dying Earth", "Dark Visions", "Aces Abroad", "A Storm of Swords: Part 1 Steel and Snow (A Song of Ice and Fire, Book 3)"}
        };

        String[][] jrrTolkein = {
            {"J.R.R. Tolkein"},
            {"The Lord of the Rings", "The Hobbit", "The Silmarillion", "The Fellowship of the Ring"},
            {"Unfinished Tales", "The Children of Hurin", "The Two Towers", "The Return of the King"},
            {"Beowulf: A Translation and Commentary", "The Fall of Gondolin", "The Adventures of Tom Bombadil"},
            {"The Book of Lost Tales", "The Fall of Númenor", "On Fairy-Stories", "Tolkien on Fairy-stories"},
            {"The Father Christmas Letters", "The New Shadow", "The Monsters and the Critics, and Other Essays", "Leaf by Niggle"},
            {"Tree and Leaf", "Farmer Giles of Ham", "Ainulindalë", "The Lost Road and Other Writings"},
            {"The Tale of Aragorn and Arwen", "Roverandom", "The Hobbit and the Lord of the Rings", "Quenta Silmarillion"},
            {"The Hobbit, or There and Back Again John Ronald Reuel Tolkien", "The Road Goes Ever On: A Song Cycle", "The Fall of Arthur", "The Peoples of Middle-earth"},
            {"Mr. Bliss", "Hobbits Journal John Ronald Reuel Tolkien", "Errantry", "The War of the Ring"},
            {"Tales from the Perilous Realm", "The Battle of Maldon: Together with the Homecoming of Beorhtnoth", "J. R. R. Tolkien: Artist and Illustrator", "Smith of Wootton Major"},
            {"Tolkien: Maker of Middle-earth", "The Return of the Shadow", "Goblin Feet", "The Lays of Beleriand"},
            {"Eriol's song John Ronald Reuel Tolkien", "Beowulf: The Monsters and the Critics", "The Nature of Middle-earth", "The Lay of Aotrou and Itroun"},
            {"The Hobbit. Illustrated", "The Lord of the Rings (3 Book Box Set) John Ronald Reuel Tolkien", "Bilbo's Last Song"}
        };
        
        System.out.println("View All Authors");
        System.out.println("Specific Author");
        selection = scanner.nextLine();

        if (selection.equalsIgnoreCase("view all authors") || selection.equalsIgnoreCase("")) {
            for (i = 0; i < authors.length; i++) {
                for (j = 0; j < authors[i].length; j++) {
                    System.out.println("- " + authors[i][j]);
                }
            }
            
            System.out.println("Enter the name of the author whose books you want to see: ");
            chooseAuthor = scanner.nextLine();

            if (chooseAuthor.equalsIgnoreCase("George R.R. Martin") || (chooseAuthor.equalsIgnoreCase("George RR Martin"))) {
                for (x = 1; x < georgeRRMartin.length; x++) {
                    for (y = 0; y < georgeRRMartin[x].length; y++) {
                        System.out.println("- " + georgeRRMartin[x][y]);
                    }
                }
            
            } else if (chooseAuthor.equalsIgnoreCase("J.R.R Tolkein") || (chooseAuthor.equalsIgnoreCase("JRR Tolkein"))) {
                for (w = 1; w < jrrTolkein.length; w++) {
                    for (z = 0; z < jrrTolkein[w].length; z++) {
                        System.out.println("- " + jrrTolkein[w][z]);
                    }
                }   
            }
        } 
    }
}


