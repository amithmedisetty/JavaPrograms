package Files;
import java.io.File;
public class CreatinggFiles {
    public static void main(String[] args) {
        File file=new File("example.txt");
        try{
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println(file.getAbsolutePath());
                System.out.println("File already exists.");
            }

             // To delete the file
            // if (file.delete()) {
            //     System.out.println("File deleted successfully.");
            // } else {
            //     System.out.println("Failed to delete the file.");
            // }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
}
