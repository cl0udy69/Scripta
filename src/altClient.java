import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class altClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using a Map to store author names and their respective books
        Map<String, String[][]> authorsMap = new HashMap<>();
        
        authorsMap.put("george r.r. martin", new String[][] {
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
        });

        authorsMap.put("j.r.r. tolkien", new String[][] {
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
        });

        authorsMap.put("arthur c. clarke", new String[][] {
            {"Rendezvous with Rama", "Childhood's End", "2001: A Space Odyssey", "2010: Odyssey Two"},
            {"The Sentinel", "2061: Odyssey Three", "Rama II", "3001: The Final Odyssey"},
            {"The City and the Stars", "The Garden of Rama", "The Fountains of Paradise", "Rama Revealed"},
            {"The Collected Stories of Arthur C. Clarke", "The Nine Billion Names of God", "Rendezvous with Rama. Arthur C. Clarke", "The Songs of Distant Earth"},
            {"A Fall of Moondust", "The Sands of Mars", "Childhood's End: By Arthur C. Clarke", "The Hammer of God"},
            {"Time's Eye", "Profiles of the Future", "Rescue Party", "Imperial Earth"},
            {"Earthlight Arthur C. Clarke", "If I Forget Thee, Oh Earth", "The Deep Range", "Dog Star"},
            {"Expedition to Earth", "Superiority (short story)", "Against the Fall of Night", "Encounter in the Dawn"},
            {"The Light of Other Days", "The Last Theorem", "A Meeting with Medusa", "Dolphin Island"},
            {"Firstborn (Clarke and Baxter novel)", "Cradle", "The Wind from the Sun", "Islands in the Sky Arthur C. Clarke"},
            {"Tales of Ten Worlds", "The Lost Worlds of 2001", "Tales from the White Hart", "Richter 10"},
            {"Prelude to Space", "2001 odisseia no espaç Arthur C. Clarke", "Breaking Strain Arthur C. Clarke", "Dial F for Frankenstein"},
            {"Jupiter Five","The Ghost from the Grand Banks", "Tales from Planet Earth"}
        });

        authorsMap.put("george orwell", new String[][] {
            {"Nineteen Eighty-Four", "Animal Farm", "Homage to Catalonia", "Politics and the English Language"},
            {"Burmese Days", "Down and Out in Paris and London", "The Road to Wigan Pier", "Why I Write"},
            {"Coming Up for Air", "A Hanging", "Keep the Aspidistra Flying", "George Orwell Essays"},
            {"A Clergyman's Daughter", "Fascism and Democracy", "The Lion and the Unicorn: Socialism and the English Genius", "Notes on Nationalism"},
            {"The Theory and Practice of Oligarchical Collectivism", "Inside the Whale and Other Essays", "A Nice Cup of Tea", "Inside the Whale"},
            {"Inside the Whale", "How the Poor Die", "Fighting in Spain George Orwell", "Books v. Cigarettes"},
            {"Such, Such Were the Joys", "The Complete Works of George Orwell", "The Poetry of George Orwell", "England Your England"},
            {"As I Please", "Shooting an Elephant: and other essays", "Looking Back on the Spanish War", "All art is propaganda"}
        });

        authorsMap.put("James Patterson", new String[][] {
            
        });

        // List of authors
        String[] authors = {"George R.R. Martin", "J.R.R. Tolkien", "Arthur C. Clarke", "George Orwell"};

        // Main program loop
        while (true) {
            System.out.println("View All Authors or Specific Author:");
            String selection = scanner.nextLine().trim();

            if (selection.equalsIgnoreCase("view all authors") || selection.equalsIgnoreCase("")) {
                printAllAuthors(authors);

                System.out.println("Enter the name of the author whose books you want to see: ");
                String chooseAuthor = scanner.nextLine().trim().toLowerCase();

                if (authorsMap.containsKey(chooseAuthor)) {
                    printBooksByAuthor(chooseAuthor, authorsMap.get(chooseAuthor));
                } else {
                    System.out.println("Author not found.");
                }
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    // Function to print all authors
    public static void printAllAuthors(String[] authors) {
        for (String author : authors) {
            System.out.println("- " + author);
        }
    }

    // Function to print books by a specific author
    public static void printBooksByAuthor(String author, String[][] books) {
        System.out.println("Books by " + author + ":");
        for (String[] bookSet : books) {
            for (String book : bookSet) {
                System.out.println("- " + book);
            }
        }
    }
}
