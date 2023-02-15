import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {
        public static String[] readFile(String fileName){
        File file = new File(fileName);
        ArrayList<String> arr = new ArrayList<>();
        int lineCounter = 0;
        try(Scanner scan = new Scanner(file)){
            while(scan.hasNext()){
                arr.add(lineCounter, scan.nextLine());
                lineCounter++;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        String[] lines = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            lines[i] = arr.get(i);
        }

        return lines;
    }
}
