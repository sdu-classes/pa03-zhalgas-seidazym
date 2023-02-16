import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class SimpleIO {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        File file;
        while(true){
            file = new File(s.next());
            if(file.exists()) break;
            else {
                System.out.println("Enter the correct path to your file:");
            }
        }

        File newFile;
        while(true){
            newFile = new File(s.next());
            if(!file.getName().equals(newFile.getName())) break;
            else {
                System.out.println("Enter the another name than in file:");
            }
        }   
        try{
            PrintWriter pr = new PrintWriter(newFile);
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                int countThe = 0;
                String str = sc.nextLine();
                String str2 = str.toLowerCase();
                for(int i = 0; i < str2.length() - 2; i++){
                    if(str2.charAt(i) == 't' && str2.charAt(i + 1) == 'h' && str2.charAt(i + 2) == 'e')countThe++;
                }
                pr.print(str);
                pr.println(" [ " + countThe + " ]");
            }
            
            pr.close();
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(StringIndexOutOfBoundsException a){
        }
        s.close();
    }
}
