import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class basics {


    public static void main(String[] args)
    {
        for(int i=3001;i<=6000;i++) {
            File file = new File("C:\\Users\\prade\\git\\textdocument_"+i+".txt"); //initialize File object and passing path as argument
            boolean result;
            try {
                result = file.createNewFile();
                String text     = "Welcome to Opsera\nHappy Learning!";

                // Defining the file name of the file
                Path fileName = Path.of(
                        "C:\\Users\\prade\\git\\textdocument"+i+".txt");

                // Writing into the file
                Files.writeString(fileName, text);

                //creates a new file
                if (result)      // test if successfully created a new file
                {
                    System.out.println("file created " + file.getCanonicalPath()); //returns the path string
                } else {
                    System.out.println("File already exist at location: " + file.getCanonicalPath());
                }
            } catch (IOException e) {
                e.printStackTrace();    //prints exception if any
            }
        }
    }

}
