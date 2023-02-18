import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {

    public static void main(String[] args) {
        try{
            String filename = "text.txt";
            String[] arr = readFile(filename);
            for (String string : arr) {
                if(string != null)System.out.println(string);
                else break;
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(NullPointerException e){
            System.out.println("Your file is null");
        }
    }    

    public static String[] readFile(String fileName) throws FileNotFoundException, NullPointerException{
        File file = new File(fileName);
        int lineCounter = 0;
        Scanner scan = new Scanner(file);
        String[] lines = new String[1000];
        while(scan.hasNextLine()){
            lines[lineCounter] = scan.nextLine();
            lineCounter++;
        }
        scan.close();
        return lines;
    }
}
