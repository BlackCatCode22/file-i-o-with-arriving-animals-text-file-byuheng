import java.io.*;


public class FileIOwithCSV {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\n Welcome to File I/O ! \n\n");

        String pathName = "C:\\Users\\Heng\\OneDrive\\Documents\\Fresno City College\\Fall '23\\CIT-63-16266 - Mohle, Dennis\\Notes\\arrivingAnimals.txt";
        String pathOutput = "C:\\Users\\Heng\\OneDrive\\Documents\\Fresno City College\\Fall '23\\CIT-63-16266 - Mohle, Dennis\\Notes\\myNewFile.txt";
        BufferedReader reader = null;
        String line = "";

        // Create a File Writer.
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput));

        try {
            reader = new BufferedReader(new FileReader(pathName));
            while ( (line = reader.readLine()) != null ) {
                String[] row = line.split(",");

                for (String i : row) {
                    System.out.println("\n" + i);
                    writer.write("\n" + i);
                }

            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
            writer.close();
        }

    }
}