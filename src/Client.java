import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selection;
        String chooseAuthor;

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

        // String[][] georgeRRMartin = {
        //     {"Georege R.R. Martin"},
        //     {"A Game of Thrones", "The Winds of Winter", "Fire & Blood",
        //     "A Dance with Dragons", "The Hedge Knight", "A Dream of Spring",
        //     "A Storm of Swords", "A Clash of Kings", "A Feast for Crows", 
        //     "Fevre Dream", "The Ice Dragon", "The Rise of the Dragon", 
        //     "Sandkings", "Dying of the Light", "Tuf Voyaging",
        //     "A Song of Fire and Ice", "The Princess and the Queen", "Nightflyers", 
        //     "The Sworn Sword", "The Rise of the Dragon: An Illustrated History of the Targaryen Dynasty", "The Rogue Princess", 
        //     "Dreamsongs: A RRetrospective", "Windhaven", "The Armageddon Rag", 
        //     "Blood of the Dragon", "Dreamsongs: 2: A RRetrospective George R. R. Martin", "Jokers Wild", 
        //     "The Pear-shaped Man", "Dreamsongs: Volume I", "Starport", 
        //     "The Lands of Ice and Fire", "The Sons of the Dragon", "A Song for Lya", 
        //     "The Wit and Wisdom of Tyrion Lannister", "Ice Dragon", "In the House of the Worm", 
        //     "A Knight of the Seven Kingdoms", "A Dance With Dragons: Part 2 After the Feast (A Song of Ice and Fire, Book 5)", "Songs of Love and Death", 
        //     "With Morning Comes Mistfall", "Songs of the Dying Earth", "Dark Visions", 
        //     "Aces Abroad", "A Storm of Swords: Part 1 Steel and Snow (A Song of Ice and Fire, Book 3)", "The Second Kind of Loneliness"}
        // };

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
        
        System.out.println("View All Authors");
        System.out.println("Specific Author");
        selection = scanner.nextLine();

        if (selection.equalsIgnoreCase("view all authors") || selection.equalsIgnoreCase("view authors")) {
            for (int row = 0; row < 11; row++) {
                for (int column = 0; column < 4; column++) {
                    System.out.println(authors[row][column]);
                }   
            }
            System.out.println("Enter the name of the author whose books you want to see: ");
            chooseAuthor = scanner.nextLine();

            if (chooseAuthor.equalsIgnoreCase("George R.R. Martin") || (chooseAuthor.equalsIgnoreCase("George RR Martin"))) {
                for (int row = 0; row < 2; row++) {
                    for (int column = 0; column < 4; column++){
                        System.out.println(georgeRRMartin[row][column]);
                    } 
                }
            }
        } else if (selection.equalsIgnoreCase("view specific author") || (selection.equalsIgnoreCase("specific author"))) {
            System.out.println("Feature not available");
        }
        scanner.close();
    }
}
