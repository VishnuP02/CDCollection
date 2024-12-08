public class Main {
    public static void main(String[] args) {
        // Step 1: Create a CDCollection instance
        CDCollection myCollection = new CDCollection();

        // Step 2: Add CDs to the collection
        myCollection.addCD("Thriller", "Michael Jackson", 14.99, 9);
        myCollection.addCD("Back in Black", "AC/DC", 10.99, 10);
        myCollection.addCD("The Dark Side of the Moon", "Pink Floyd", 12.99, 10);

        // Step 3: Print the initial collection
        System.out.println("Initial CD Collection:");
        System.out.println(myCollection);

        // Step 4: Add more CDs to trigger resizing
        for (int i = 0; i < 100; i++) {
            myCollection.addCD("Album " + i, "Artist " + i, 9.99, 10);
        }

        // Step 5: Print the collection after resizing
        System.out.println("\nCD Collection After Adding More CDs:");
        System.out.println(myCollection);
    }
}