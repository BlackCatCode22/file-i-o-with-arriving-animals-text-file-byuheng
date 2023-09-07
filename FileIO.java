
import java.io.*;


public class FileIO {
    public static void main(String[] args) throws IOException {
        System.out.println("\n Welcome to java IO!");

        try {
            // Create a file writer, named writer, and open it.
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Heng\\OneDrive\\Documents\\Fresno City College\\Fall '23\\CIT-63-16266 - Mohle, Dennis\\Notes\\myNewFile.txt"));

            // Write to the file using "writer"
            writer.write("This is the first line in my new file!");
            writer.write("\n This is on a new line!");
            writer.write("\nThis is a string and it is my third line.");

            // Close the file -- otherwise nothing will be written to the file!
            writer.close();

            // Tell us that our program wrote to a file
            System.out.println("\n We just wrote to a file!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the file.
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Heng\\OneDrive\\Documents\\Fresno City College\\Fall '23\\CIT-63-16266 - Mohle, Dennis\\Notes\\myNewFile.txt"));
            String myLine = "";
            while ( ( myLine = reader.readLine() ) != null ) {
                System.out.println(myLine);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Open a csv file using the split() method on a string object
        String path = "C:\\Users\\Heng\\OneDrive\\Documents\\Fresno City College\\Fall '23\\CIT-63-16266 - Mohle, Dennis\\Notes\\arrivingAnimals.txt";
        String myFileLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((myFileLine = reader.readLine()) != null) {
                String[] myArray = myFileLine.split(",");
                System.out.println(" First element: " + myArray[0]);
                System.out.println(" Second element: " + myArray[1]);
                System.out.println(" Third item: " + myArray[2]);
                System.out.println(" Fourth element: " + myArray[3]);
                System.out.println(" Fifth item: " + myArray[4]);
                System.out.println(" Sixth item: " + myArray[5]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }



}

